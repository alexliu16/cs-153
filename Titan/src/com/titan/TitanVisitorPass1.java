
package com.titan;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

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
    public Integer visitBlock(TitanParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Integer visitRegularFunction(TitanParser.RegularFunctionContext ctx) {
        return super.visitRegularFunction(ctx);
    }

    @Override
    public Integer visitDeclaration(TitanParser.DeclarationContext ctx) {
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
            
            //System.out.println("Adding " + ctx.ID().getText() + " to Stack");
        }
        return visitChildren(ctx);
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

        System.out.println("type1: " + type1);
        System.out.println("type2: " + type2);
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
    public Integer visitSimpleExpr(TitanParser.SimpleExprContext ctx) {
        Integer value = visitChildren(ctx);
        ctx.type = ctx.simpleExpression().type;
        return value;
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
    public Integer visitLiteral(TitanParser.LiteralContext ctx) {
        Integer value = visitChildren(ctx);
        ctx.type = ctx.number().type;
        return value;
    }

    @Override
    public Integer visitIdentifier(TitanParser.IdentifierContext ctx) {
        String variableName = ctx.ID().toString();
        SymTabEntry variableId = symTabStack.lookupLocal(variableName);

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
    public Integer visitLoop(TitanParser.LoopContext ctx) {
    	String name = ctx.ID().getText() + "loop";

    	int slot_no = symTabStack.getLocalSymTab().nextSlotNumber();
    	SymTabEntry entry = symTabStack.enterLocal(name);
    	entry.setAttribute(ROUTINE_SYMTAB, symTabStack.push());
        
    	for (int i = 0; i < slot_no; i++) { symTabStack.getLocalSymTab().nextSlotNumber(); }
    	
    	Integer val = visitChildren(ctx);
    	
    	symTabStack.pop();

    	return val;
    }
}
