
package com.titan;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import com.titan.intermediate.*;
import com.titan.intermediate.symtabimpl.*;

import static com.titan.intermediate.symtabimpl.SymTabKeyImpl.*;

public class TitanVisitorPass1 extends TitanBaseVisitor<Integer>
{
    private SymTabStack symTabStack;
    private SymTabEntry programId;
    private ArrayList<SymTabEntry> variableIdList;
    private PrintWriter jFile;

    private boolean localDeclarations = false;


    public SymTabStack getSymTabStack() {
        return symTabStack;
    }

    public SymTabEntry getProgramId() {
        return programId;
    }

    public ArrayList<SymTabEntry> getVariableIdList() {
        return variableIdList;
    }

    public TitanVisitorPass1()
    {
        // Create and initialize the symbol table stack.
        symTabStack = SymTabFactory.createSymTabStack();
        Predefined.initialize(symTabStack);

        // Print the cross-reference table.
        //CrossReferencer crossReferencer = new CrossReferencer();
        //crossReferencer.print(symTabStack);
    }

    public PrintWriter getAssemblyFile() { return jFile; }


    @Override
    public Integer visitClassName(TitanParser.ClassNameContext ctx)
    {
        String programName = ctx.ID().toString();

        programId = symTabStack.enterLocal(programName);
        programId.setDefinition(DefinitionImpl.PROGRAM);
        programId.setAttribute(ROUTINE_SYMTAB, symTabStack.push());
        symTabStack.setProgramId(programId);
        
        // Create the assembly output file.
        try {
            jFile = new PrintWriter(new FileWriter(programName + ".j"));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }

        // Emit the program header.
        jFile.println(".class public " + programName);
        jFile.println(".super java/lang/Object");

        // Emit the RunTimer and PascalTextIn fields.
        jFile.println();
        jFile.println(".field private static _runTimer LRunTimer;");
        jFile.println(".field private static _standardIn LPascalTextIn;");


        // Emit the class constructor.
        jFile.println();
        jFile.println(".method public <init>()V");
        jFile.println();
        jFile.println("\taload_0");
        jFile.println("\tinvokenonvirtual    java/lang/Object/<init>()V");
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 1");
        jFile.println(".limit stack 1");
        jFile.println(".end method");

        return visitChildren(ctx);
    }

    @Override
    public Integer visitProg(TitanParser.ProgContext ctx) {
        localDeclarations = true;
        visitChildren(ctx);
        localDeclarations = false;
        return 0;
    }

    @Override
    public Integer visitNormalDeclaration(TitanParser.NormalDeclarationContext ctx) {
        if(!localDeclarations) {
            jFile.println("; global " + ctx.getText() + "\n");
            //jFile.println(".field private static " +
            //                    id.getName() + " " + typeIndicator);
            //add to sym table
            symTabStack.enterLocal(ctx.ID().getText());
            //set type
        }
        else {
            SymTabEntry loc = symTabStack.enterLocal(ctx.ID().getText());
            loc.setTypeSpec(getType(ctx.primitives()));
            loc.setAttribute(SLOT, symTabStack.getLocalSymTab().nextSlotNumber());             
        }
        return visitChildren(ctx);
    }
    
    @Override
    public Integer visitTernaryDeclaration(TitanParser.TernaryDeclarationContext ctx) {
        if(!localDeclarations) {
            jFile.println("; global " + ctx.getText() + "\n");
            //jFile.println(".field private static " +
            //                    id.getName() + " " + typeIndicator);
            //add to sym table
            symTabStack.enterLocal(ctx.ID().getText());
            //set type
        }
        else {
            SymTabEntry loc = symTabStack.enterLocal(ctx.ID().getText());
            loc.setTypeSpec(getType(ctx.primitives()));
            loc.setAttribute(SLOT, symTabStack.getLocalSymTab().nextSlotNumber());             
        }
        return visitChildren(ctx);
    }
    
    public TypeSpec getType(String type) {
    	if(type.equals("int") || type.equals("I"))
    		return Predefined.integerType;
    	else if(type.equals("float") || type.equals("F"))
    		return Predefined.realType;
    	else if(type.equals("bool") || type.equals("Z"))
    		return Predefined.booleanType;
    	else if(type.equals("string") || type.equals("S"))
    		return Predefined.stringType;
    	else
    		return Predefined.undefinedType;
    }

    public String getType(TypeSpec type) {
        if(type == Predefined.integerType)
            return "integer";
        else if(type == Predefined.realType)
            return "float";
        else if(type == Predefined.booleanType)
            return "boolean";
        else if(type == Predefined.stringType)
            return "string";
        return "undefined";
    }

    public TypeSpec getType(TitanParser.PrimitivesContext prim) {
        switch(prim.getText()) {
            case "int": return Predefined.integerType;
            case "float": return Predefined.realType;
            case "bool": return Predefined.booleanType;
            case "string": return Predefined.stringType;
            default: return Predefined.integerType;
        }
    }

    public Integer visitAddSubOp(TitanParser.AddSubOpContext ctx) {
        Integer value = visitChildren(ctx);

        TypeSpec type1 = ctx.simpleExpression(0).type;
        TypeSpec type2 = ctx.simpleExpression(1).type;

        boolean integerMode =    (type1 == Predefined.integerType)
                && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType || type1 == Predefined.integerType)
                && (type2 == Predefined.realType || type2 == Predefined.integerType);
        boolean stringMode = type1 == Predefined.stringType && type2 == Predefined.stringType;

        TypeSpec type = integerMode ? Predefined.integerType
                : realMode    ? Predefined.realType
                : stringMode ? Predefined.stringType
                : null;
        ctx.type = type;

        return value;
    }

    @Override
    public Integer visitSimpleExpr(TitanParser.SimpleExprContext ctx) {
        Integer value = visitChildren(ctx);
        ctx.type = ctx.simpleExpression().type;
        return value;
    }

    @Override
    public Integer visitStrLit(TitanParser.StrLitContext ctx) {
        Integer value = visitChildren(ctx);
        ctx.type = Predefined.stringType;
        return value;
    }

    @Override
    public Integer visitString(TitanParser.StringContext ctx) {
        visitChildren(ctx);
        ctx.type = ctx.stringExpr().type;
        return 0;
    }

    @Override
    public Integer visitMulDivOp(TitanParser.MulDivOpContext ctx)
    {
        Integer value = visitChildren(ctx);

        TypeSpec type1 = ctx.simpleExpression(0).type;
        TypeSpec type2 = ctx.simpleExpression(1).type;


        boolean integerMode =    (type1 == Predefined.integerType)
                && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType || type1 == Predefined.integerType)
                && (type2 == Predefined.realType || type2 == Predefined.integerType);

        TypeSpec type = integerMode ? Predefined.integerType
                : realMode    ? Predefined.realType
                :               null;
        ctx.type = type;

        return value;
    }
    
    @Override
    public Integer visitModOp(TitanParser.ModOpContext ctx)
    {
    	Integer value = visitChildren(ctx);
    	
        TypeSpec type1 = ctx.simpleExpression(0).type;
        TypeSpec type2 = ctx.simpleExpression(1).type;
    	
        boolean integerMode =    (type1 == Predefined.integerType)
                && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType || type1 == Predefined.integerType)
                && (type2 == Predefined.realType || type2 == Predefined.integerType);
        
        TypeSpec type = integerMode ? Predefined.integerType
                : realMode    ? Predefined.realType
                :               null;
        ctx.type = type;

        return value;
    }

    @Override
    public Integer visitLiteral(TitanParser.LiteralContext ctx) {
        Integer value = visitChildren(ctx);
        ctx.type = ctx.number().type;
        return value;
    }

    @Override
    public Integer visitIdentifier(TitanParser.IdentifierContext ctx) {
        String variableName = ctx.ID().toString();
        SymTabEntry variableId = symTabStack.lookup(variableName);
        if(variableId != null) {
            ctx.type = variableId.getTypeSpec();
        }
        
        return visitChildren(ctx);
    }

    @Override
    public Integer visitInteger(TitanParser.IntegerContext ctx) {
        ctx.type = Predefined.integerType;
        return visitChildren(ctx);
    }

    @Override
    public Integer visitFloat(TitanParser.FloatContext ctx) {
        ctx.type = Predefined.realType;
        return visitChildren(ctx);
    }

    @Override
    public Integer visitExponential(TitanParser.ExponentialContext ctx) {
        ctx.type = Predefined.realType;
        return visitChildren(ctx);
    }

    @Override
    public Integer visitSimpleExprParen(TitanParser.SimpleExprParenContext ctx) {
        Integer value = visitChildren(ctx);
        ctx.type = ctx.simpleExpression().type;
        return value;
    }

    @Override
    public Integer visitBoolExpr(TitanParser.BoolExprContext ctx) {
        ctx.type = Predefined.booleanType;
        return visitChildren(ctx);
    }
    
    @Override 
    public Integer visitWhileLoop(TitanParser.WhileLoopContext ctx) {
    	String name = "whileloop" + ctx.start.getLine();
    	
    	visit(ctx.boolExprs()); // visit, otherwise jFile prints ???
    	
    	int slot_no = symTabStack.getLocalSymTab().nextSlotNumber() - 1;
    	SymTabEntry entry = symTabStack.enterLocal(name);
    	entry.setAttribute(ROUTINE_SYMTAB, symTabStack.push());
    	symTabStack.getLocalSymTab().setSlotNumber(slot_no);
    	
    	Integer val = visit(ctx.block());
    	
    	symTabStack.pop();
    	  
    	return val;
    }
    
    @Override
    public Integer visitForLoop(TitanParser.ForLoopContext ctx) {
    	String name = "forloop" + ctx.start.getLine();

    	int slot_no = symTabStack.getLocalSymTab().nextSlotNumber() - 1;
    	SymTabEntry entry = symTabStack.enterLocal(name);
    	entry.setAttribute(ROUTINE_SYMTAB, symTabStack.push());
    	symTabStack.getLocalSymTab().setSlotNumber(slot_no);
    	int slot_no2 = symTabStack.getLocalSymTab().nextSlotNumber();
    	
    	SymTabEntry entry2 = symTabStack.enterLocal(ctx.ID().getText());
        entry2.setTypeSpec(Predefined.integerType);
        entry2.setAttribute(SLOT, slot_no2);
    	Integer val = visitChildren(ctx);
    	
    	symTabStack.pop();
    	return val;
    }
    
    //Functions


    @Override
    public Integer visitRegularFunctionCallWithArgs(TitanParser.RegularFunctionCallWithArgsContext ctx) {
        SymTabEntry symtabEntry = symTabStack.lookup(ctx.ID().getText());
        SymTab symtab = symTabStack.getLocalSymTab();
        if(symtabEntry != null) {
            symtab = (SymTab)symtabEntry.getAttribute(ROUTINE_SYMTAB);
        }
        TypeSpec returnType = symtab.lookup("return").getTypeSpec();
        ctx.type = returnType;
        return 0;
    }

    @Override
    public Integer visitFuncCall(TitanParser.FuncCallContext ctx) {
        visitChildren(ctx);
        ctx.type = ctx.functionCall().type;
        return 0;
    }

    //Function declaration
    @Override
    public Integer visitFunctionWithArgsDecl(TitanParser.FunctionWithArgsDeclContext ctx) { 
    	//Create a symbol table for function
    	SymTab symTable = SymTabFactory.createSymTab(symTabStack.getCurrentNestingLevel() + 1);
    	int slot_no = symTabStack.getLocalSymTab().nextSlotNumber() - 1;
    	symTabStack.push(symTable);
    	symTabStack.getLocalSymTab().setSlotNumber(slot_no);
    	
    	visit(ctx.funcReturnTypes());
        visit(ctx.args());
        visit(ctx.block());
    	symTable = symTabStack.pop();
    	
    	//create function arg signature
    	//eg. function void test(int i) has a signature:(I)V
    	TitanParser.ArgsContext args = ctx.args();
    	StringBuilder sb = new StringBuilder();
  
    	while(args != null) {
    		TypeSpec typeSpec = symTable.lookup(args.argDecl().children.get(1).getText()).getTypeSpec();
    		if(typeSpec == Predefined.integerType)
    			sb.append("I");
    		else if(typeSpec == Predefined.realType)
    			sb.append("F");
    		else if(typeSpec == Predefined.booleanType)
    			sb.append("Z");
    		else if(typeSpec == Predefined.stringType)
    			sb.append("S");
    		args = args.args();
    	}
    	
    	sb = sb.reverse();
    	sb.insert(0, "(");
    	sb.append(")");
    	
    	//function return type
    	TypeSpec returnType = symTable.lookup("return").getTypeSpec();
    	if(returnType == Predefined.undefinedType)
    		sb.append("V");
    	else if(returnType == Predefined.integerType)
    		sb.append("I");
    	else if(returnType == Predefined.realType)
    		sb.append("F");
    	else if(returnType == Predefined.booleanType)
    		sb.append("Z");
    	else if(returnType == Predefined.stringType)
    		sb.append("S");
    	
    	//save return type
    	SymTabEntry ret = symTable.lookup("return");
    	
    	if(returnType == Predefined.stringType)
    		ret.setAttribute(DATA_VALUE, ';');
    	else
    		ret.setAttribute(DATA_VALUE, sb.charAt(sb.length() - 1));
    	
    	//save symbol table and header
    	SymTabEntry loc = symTabStack.enterLocal(ctx.ID().getText());
    	loc.setAttribute(FUNCTION_HEADER, sb.toString().replaceAll("S", "Ljava/lang/String;"));
    	loc.setAttribute(ROUTINE_SYMTAB, symTable);

    	return 0;
    }
    
    //Function argument declaration
    @Override
    public Integer visitArgDecl(TitanParser.ArgDeclContext ctx) { 
    	for(int i = 1; i < ctx.children.size(); i+=2) {
    		SymTabEntry loc = symTabStack.enterLocal(ctx.children.get(i).getText());
    		String type = ctx.children.get(i-1).getText().toString();
    		loc.setTypeSpec(getType(type));
            loc.setAttribute(SLOT, symTabStack.getLocalSymTab().nextSlotNumber());   
    	}
    	
    	return visitChildren(ctx);
    }
    
    //Function return type
    @Override
    public Integer visitFuncReturnTypes(TitanParser.FuncReturnTypesContext ctx) { 
    	//Save return type in symbol table
    	SymTabEntry loc = symTabStack.enterLocal("return");
    	loc.setTypeSpec(getType(ctx.getText()));
    	return visitChildren(ctx);
    }
    
    @Override
    public Integer visitFunctionWithoutArgsDecl(TitanParser.FunctionWithoutArgsDeclContext ctx) { 
    	//Create a symbol table for function
    	SymTab symTable = SymTabFactory.createSymTab(symTabStack.getCurrentNestingLevel() + 1);
    	int slot_no = symTabStack.getLocalSymTab().nextSlotNumber() - 1;
    	symTabStack.push(symTable);
    	symTabStack.getLocalSymTab().setSlotNumber(slot_no);
    	
    	visitChildren(ctx);
    	symTable = symTabStack.pop();
    	
    	//create function arg signature
    	//function return type
    	String sb = "()";
    	TypeSpec returnType = symTable.lookup("return").getTypeSpec();
    	if(returnType == Predefined.undefinedType)
    		sb += ("V");
    	else if(returnType == Predefined.integerType)
    		sb += ("I");
    	else if(returnType == Predefined.realType)
    		sb += ("F");
    	else if(returnType == Predefined.booleanType)
    		sb += ("Z");
    	else if(returnType == Predefined.stringType)
    		sb += ("Ljava/lang/String;");
    	
    	//Save return type in symbol table
    	SymTabEntry ret = symTable.enter("return");
    	
    	if(returnType == Predefined.stringType)
    		ret.setAttribute(DATA_VALUE, ';');
    	else
    		ret.setAttribute(DATA_VALUE, sb.charAt(sb.length() - 1));
    	
    	//save symbol table and header
    	SymTabEntry loc = symTabStack.enterLocal(ctx.ID().getText());
    	loc.setAttribute(FUNCTION_HEADER, sb.toString());
    	loc.setAttribute(ROUTINE_SYMTAB, symTable);

    	return 0;
    }
    
}
