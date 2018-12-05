package com.titan;

import java.io.PrintWriter;
import java.util.ArrayList;

import com.titan.intermediate.*;
import com.titan.intermediate.symtabimpl.*;

import static com.titan.intermediate.symtabimpl.SymTabKeyImpl.DATA_VALUE;
import static com.titan.intermediate.symtabimpl.SymTabKeyImpl.SLOT;
import static com.titan.intermediate.symtabimpl.SymTabKeyImpl.FUNCTION_HEADER;
import static com.titan.intermediate.symtabimpl.SymTabKeyImpl.ROUTINE_SYMTAB;

import static com.titan.intermediate.symtabimpl.SymTabKeyImpl.*;

public class TitanVisitorPass2 extends TitanBaseVisitor<Integer>
{
    String programName;
    private PrintWriter jFile;

    private SymTabStack symTabStack;
    private SymTabEntry programId;
    private ArrayList<SymTabEntry> variableIdList;
    
    // used to give unique labels (L000, L0001, L0002 ...)
    private int labelIncrementer;

    private boolean localDeclarations = false;
    private int numArgs = 0;
    
    private boolean functionCall = false;
    

    public TitanVisitorPass2(PrintWriter jFile, TitanVisitorPass1 pass1)
    {
        this.jFile = jFile;
        symTabStack = pass1.getSymTabStack();
        programId = pass1.getProgramId();
        variableIdList = pass1.getVariableIdList();
        labelIncrementer = 0;
    }

    @Override
    public Integer visitClassName(TitanParser.ClassNameContext ctx) {
        programName = ctx.ID().toString();
        Integer value = visitChildren(ctx);
        jFile.close();
        return value;
    }

    @Override
    public Integer visitProg(TitanParser.ProgContext ctx) {

        // Emit the main program header.
        jFile.println();
        jFile.println(".method public static main([Ljava/lang/String;)V");
        jFile.println();
        jFile.println("\tnew RunTimer");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual RunTimer/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tnew PascalTextIn");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual PascalTextIn/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_standardIn LPascalTextIn;");

        Integer value = visit(ctx.block());

        // Emit the main program epilogue.
        jFile.println();
        jFile.println("\tgetstatic     " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tinvokevirtual RunTimer.printElapsedTime()V");
        jFile.println();
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 16");
        jFile.println(".limit stack 16");
        jFile.println(".end method");

        ctx.functionDeclaration().forEach(f->visit(f));

        return value;
    }

    @Override
    public Integer visitBlock(TitanParser.BlockContext ctx) {
        localDeclarations = true;
        Integer value = visitChildren(ctx);
        localDeclarations = false;
        return value;
    }
 
    @Override
    public Integer visitSimpleAssignment(TitanParser.SimpleAssignmentContext ctx) {
        Integer value = visit(ctx.expr());

        TypeSpec type = ctx.expr().type;
        String typeIndicator =
                (type == Predefined.integerType || type == Predefined.booleanType) ? "I"
                        : (type == Predefined.realType)    ? "F"
                        : (type == Predefined.stringType) ? "A"
                        : "?";
        SymTabEntry local = symTabStack.lookup(ctx.ID().toString());

        if(local != null) {
            jFile.println(typeIndicator.toLowerCase() + "store " + local.getAttribute(SLOT));
        }
        else {
            // Emit a field put instruction.
            if(ctx.expr().type == Predefined.stringType) {
                typeIndicator = "Ljava/lang/String;";
            }
            jFile.println("\tputstatic\t" + programName
                    + "/" + ctx.ID().toString()
                    + " " + typeIndicator);
        }

        return value;
    }

    @Override
    public Integer visitShorthandIncDecAssignment(TitanParser.ShorthandIncDecAssignmentContext ctx) {
        SymTabEntry local = symTabStack.lookup(ctx.ID().toString());

        char typeIndicator = local.getTypeSpec() == Predefined.integerType ? 'i'
                            : '?';
        String op = ctx.SHORTHANDASSIGNOP().getText().equals("++") ? "inc"
                : ctx.SHORTHANDASSIGNOP().getText().equals("--") ? "dec"
                : "???";
        if(local != null) {
            jFile.println(typeIndicator + op + " " + local.getAttribute(SLOT) + " 1");
        }
        else {
            jFile.println("Not yet supported shorthand inc/dec for global variables");
        }
        return 0;
    }

    @Override
    public Integer visitSpecialAssignment(TitanParser.SpecialAssignmentContext ctx) {
        SymTabEntry local = symTabStack.lookup(ctx.ID().toString());

        TypeSpec type = local.getTypeSpec();
        char typeIndicator = type == Predefined.integerType ? 'i'
                : type == Predefined.realType ? 'f'
                : '?';

        String op = ctx.AssignmentOp().getText();
        if(local != null) {
            jFile.println(typeIndicator + "load " + local.getAttribute(SLOT));//load value onto stack
            visit(ctx.expr()); // load expression onto stack
            switch(op) {
                case "+=":
                    jFile.println(typeIndicator + "add");
                 break;
                case "-=":
                    jFile.println(typeIndicator + "sub");
                    break;
                case "*=":
                    jFile.println(typeIndicator + "mul");
                    break;
                case "/=":
                    jFile.println(typeIndicator + "div");
                    break;
            }
            jFile.println(typeIndicator + "store " + local.getAttribute(SLOT));

            //jFile.println(typeIndicator + op + " " + local.getAttribute(SLOT) + " 1");
        }
        else {
            jFile.println("Not yet supported shorthand assignments for global variables");
        }
        return 0;
    }

    @Override
    public Integer visitDeclaration(TitanParser.DeclarationContext ctx) {
        String name = ctx.ID().getText();

        if(localDeclarations) { 
            SymTabEntry entry = symTabStack.lookupLocal(name);
            if(entry != null) {
                TypeSpec typeSpec = entry.getTypeSpec();
                char type = typeSpec == Predefined.integerType ? 'i'
                        : typeSpec == Predefined.realType ? 'f'
                        : typeSpec == Predefined.booleanType ? 'i'
                        : typeSpec == Predefined.stringType ? 'a'
                        : '?';
                int slot_no = (int) entry.getAttribute(SLOT);
                if (ctx.expr() != null) {
                    visit(ctx.expr()); // expr is on stack now
                    jFile.println(type + "store " + slot_no);
                }
            }
            else {
                jFile.println("Unknown declaration " + name);
            }
        }

        return 0;
    }



    @Override
    public Integer visitAddSubOp(TitanParser.AddSubOpContext ctx)
    {
        Integer value = visitChildren(ctx);

        TypeSpec type1 = ctx.simpleExpression(0).type;
        TypeSpec type2 = ctx.simpleExpression(1).type;

        boolean integerMode =    (type1 == Predefined.integerType)
                && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                && (type2 == Predefined.realType);

        String op = ctx.op.getText();
        String opcode;

        if (op.equals("+")) {
            opcode = integerMode ? "iadd"
                    : realMode    ? "fadd"
                    :               "????add";
        }
        else {
            opcode = integerMode ? "isub"
                    : realMode    ? "fsub"
                    :               "????sub";
        }

        // Emit an add or subtract instruction.
        jFile.println("\t" + opcode);

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
        boolean realMode    =    (type1 == Predefined.realType)
                && (type2 == Predefined.realType);


        String op = ctx.op.getText();
        String opcode;

        if (op.equals("*")) {
            opcode = integerMode ? "imul"
                    : realMode    ? "fmul"
                    :               "f???";
        }
        else {
            opcode = integerMode ? "idiv"
                    : realMode    ? "fdiv"
                    :               "????";
        }

        // Emit a multiply or divide instruction.
        jFile.println("\t" + opcode);

        return value;
    }


    @Override
    public Integer visitIdentifier(TitanParser.IdentifierContext ctx) {
    	String variableName = ctx.ID().toString();  
    	SymTabEntry local = null;
    	if(functionCall)
    		local = symTabStack.lookupLocal(ctx.ID().toString());
    	else
    		local = symTabStack.lookup(ctx.ID().toString());
        
        //SymTabEntry local = symTabStack.lookupLocal(ctx.ID().toString());
    	System.out.println("Identifier " + ctx.ID().getText() );

        ctx.type = local.getTypeSpec();
        TypeSpec type = ctx.type;

        String typeIndicator = (type == Predefined.integerType || type == Predefined.booleanType) ? "I"
                : (type == Predefined.realType)    ? "F"
                : (type == Predefined.stringType) ? "A"
                :                                    "?";
        if(local != null) {
            jFile.println(";load local value from stack");
            jFile.println(typeIndicator.toLowerCase() + "load " + local.getAttribute(SLOT));
        }
        else {

            // Emit a field get instruction.
            jFile.println("\tgetstatic\t" + programName +
                    "/" + variableName + " " + typeIndicator);
        }
        return 0;
    }

    @Override
    public Integer visitSimpleExpr(TitanParser.SimpleExprContext ctx) {
        Integer value = visitChildren(ctx);
        ctx.type = ctx.simpleExpression().type;
        return value;
    }
    
    
    public Integer visitSimpleExpr(TitanParser.SimpleExpressionContext ctx) {
        Integer value = visitChildren(ctx);
        ctx.type = ctx.type;
        return value;
    }

    @Override
    public Integer visitStringExpr(TitanParser.StringExprContext ctx) {
        jFile.println("ldc " + ctx.getText());
        return 0;
    }

    private boolean printfFirstPass = false;
    private boolean printfSecondPass = false;
    private int printfArgCount = 0;
    @Override
    public Integer visitPrintf(TitanParser.PrintfContext ctx) {
        jFile.println("getstatic java/lang/System/out Ljava/io/PrintStream; ");
        printfFirstPass = true;
        Integer count = visit(ctx.printfexprList());
        printfArgCount = count-1;
        printfFirstPass = false;
        printfSecondPass = true;
        if(count > 1)
            visit(ctx.printfexprList());
        else {
            visit(ctx.printfexprList().expr());
        }
        printfSecondPass = false;
        if(count == 1) {
            jFile.println("aconst_null");
        }
        jFile.println("invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;");
        jFile.println("pop");
        return 0;
    }

    @Override
    public Integer visitPrintfexprList(TitanParser.PrintfexprListContext ctx) {
        Integer value = 0;
        if(ctx.printfexprList() != null) {
            value = visit(ctx.printfexprList());
        }
        if(printfSecondPass) {
            if(value == 0) {
                visit(ctx.expr()); // loads the string onto stack
                jFile.println("ldc " + printfArgCount);
                jFile.println("anewarray java/lang/Object");
                jFile.println("dup");
            }
            else
                jFile.println("ldc " + (value-1) + " ; load arrayIndex"); // load array index
        }


        if(!printfFirstPass && ((value != 0 || !printfSecondPass)))
            visit(ctx.expr());
        if(printfSecondPass  && value != 0) {
            // figure out if it's an integer or real
            if(ctx.expr().type == Predefined.integerType)
                jFile.println("invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;");
            else if(ctx.expr().type == Predefined.realType)
                jFile.println("invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;");
            else if(ctx.expr().type == Predefined.stringType)
                jFile.println("; do we need this? invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;");
            else if(ctx.expr().type == Predefined.booleanType)
                jFile.println("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            else
                jFile.println("Failure casting " + ctx.expr().getText() + " to object. Type is " + ctx.expr().type);
            jFile.println("aastore");
            if(value != printfArgCount)
                jFile.println("dup");
        }
        return value + 1;
    }


    @Override
    public Integer visitInteger(TitanParser.IntegerContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Integer visitFloat(TitanParser.FloatContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());

        return visitChildren(ctx);
    }


    @Override
    public Integer visitIfElseBrackets(TitanParser.IfElseBracketsContext ctx) {
        // visit expr and emit the code for the expr (comparisonExpr)
        visit(ctx.boolExprs());

        // emit labels by adding one for every new label created
        jFile.println("\tifeq L00" + (this.labelIncrementer + 2));
        visit(ctx.block(0));

        // check to see if there is an else by seeing if the second block is null.
        if (ctx.block(1) != null) { // else statement
            jFile.println("\tgoto L00" + (this.labelIncrementer + 3));
            jFile.println("L00" + (this.labelIncrementer + 2) + ":");
            visit(ctx.block(1));
            jFile.println("L00" + (this.labelIncrementer + 3) + ":");
            this.labelIncrementer += 4; // increment for new labels
        } else { // no else statement
            jFile.println("L00" + (this.labelIncrementer + 2) + ":");
            this.labelIncrementer += 3; // increment for new labels
        }
        return 0;
    }

    @Override
    public Integer visitIfElseNoBrackets(TitanParser.IfElseNoBracketsContext ctx) {
        // visit expr and emit the code for the expr (comparisonExpr)
        visit(ctx.boolExprs());
        jFile.println("\tifeq L00" + (this.labelIncrementer + 2));
        visit(ctx.stat(0));
        if (ctx.stat(1) != null) { // else statement
            jFile.println("\tgoto L00" + (this.labelIncrementer + 3));
            jFile.println("L00" + (this.labelIncrementer + 2) + ":");
            visit(ctx.stat(1));
            jFile.println("L00" + (this.labelIncrementer + 3) + ":");
            this.labelIncrementer += 4; // increment for new labels
        } else { // no else statement
            jFile.println("L00" + (this.labelIncrementer + 2) + ":");
            this.labelIncrementer += 3; // increment for new labels
        }
        return 0;
    }


    @Override
    public Integer visitComparisonExpr(TitanParser.ComparisonExprContext ctx) {
        String comparison = ctx.comparison().COMPARISON_OP().getText();
        TypeSpec type1 = ctx.comparison().simpleExpression(0).type;
        TypeSpec type2 = ctx.comparison().simpleExpression(1).type;
        visit(ctx.comparison().simpleExpression((0)));
        visit(ctx.comparison().simpleExpression(1));
        boolean integerMode =    (type1 == Predefined.integerType)
                && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                && (type2 == Predefined.realType);
        String compareCode;
        if (comparison.equals("<")) {
            compareCode = integerMode ? "if_icmplt"
                    : realMode ? "if_fcmplt"
                    : "???";
        } else if(comparison.equals(">")) {
            compareCode = integerMode ? "if_icmpgt"
                    : realMode ? "if_fcmpgt"
                    : "???";
        } else if(comparison.equals("<=")) {
            compareCode = integerMode ? "if_icmple"
                    : realMode ? "if_fcmple"
                    : "???";
        } else if(comparison.equals(">=")) {
            compareCode = integerMode ? "if_icmpge"
                    : realMode ? "if_fcmpge"
                    : "???";
        } else if(comparison.equals("==")) {
            compareCode = integerMode ? "if_icmpeq"
                    : realMode ? "if_fcmpeq"
                    : "???";
        } else if(comparison.equals("!=")) {
            compareCode = integerMode ? "if_icmpne"
                    : realMode ? "if_fcmpne"
                    : "???";
        } else {
            compareCode = "???";
        }
        // auto increment labels for unique labels
        String labelOne = "L00" + this.labelIncrementer;
        String labelTwo = "L00" + (this.labelIncrementer + 1);
        jFile.println(compareCode + "\t" + labelOne);
        jFile.println("iconst_0");
        jFile.println("goto \t" +  labelTwo);
        jFile.println(labelOne + ":");
        jFile.println("\ticonst_1");
        jFile.println(labelTwo + ":");
        this.labelIncrementer += 2; // increment for new labels
        return 0;
    }

    @Override
    public Integer visitBoolLiteral(TitanParser.BoolLiteralContext ctx) {
        jFile.println(";Pushing boolean value to stack");
        jFile.println("\ticonst_" + (ctx.BOOLVALUES().getText().equals("true")? 1 : 0));
        return 0;
    }

    @Override
    public Integer visitBoolIdentifier(TitanParser.BoolIdentifierContext ctx) {
        String variableName = ctx.ID().toString();
       
        SymTabEntry local = symTabStack.lookupLocal(ctx.ID().toString());
        ctx.type = local.getTypeSpec();
        TypeSpec type = ctx.type;

        if(local != null && type == Predefined.booleanType) {
            jFile.println(";load boolean from stack");
            jFile.println("iload " + local.getAttribute(SLOT));
        }
        else {
            // Emit a field get instruction.
            jFile.println("\tgetstatic\t" + programName +
                    "/" + variableName + " I");
        }
        return 0;
    }

    
    public Integer visitLoopExpression(TitanParser.SimpleExpressionContext ctx) {
    	Integer val = 1;
    	return val;
    }
    
    @Override
    public Integer visitLoop(TitanParser.LoopContext ctx) {   
    	//System.out.println("Stack before push: " + symTabStack.getLocalSymTab());
    	
    	String id = ctx.ID().getText();
    	String name = "loop" + ctx.start.getLine();
    	
    	// push new symbol table for scoped variables
    	SymTab scopedTab = (SymTab) symTabStack.lookup(name).getAttribute(ROUTINE_SYMTAB);
    	symTabStack.push(scopedTab);
	    
    	int slot_no = symTabStack.getLocalSymTab().nextSlotNumber();
    	
    	SymTabEntry entry = symTabStack.enterLocal(id);
        entry.setTypeSpec(Predefined.integerType);
        entry.setAttribute(SLOT, slot_no);
        
    	visit(ctx.simpleExpression(0)); // store var
    	jFile.println("\tistore_" + slot_no + "\t; " + id);  
    	jFile.println("L00" + (this.labelIncrementer) + ":"); // emit label
    	this.labelIncrementer++;
    	
    	visit(ctx.block());

    	jFile.println("\tiload " + slot_no + " \t; load " + id);
    	visit(ctx.simpleExpression(1));
    	jFile.println("\tiinc " + slot_no + " 1\t; " + id + "++");
    	jFile.println("\tif_icmpeq L00" + this.labelIncrementer);
    	jFile.println("\ticonst_0 \t; false");
    	jFile.println("\tgoto L00" + (this.labelIncrementer + 1));
    	
    	jFile.println("L00" + (this.labelIncrementer) + ":"); // emit label
    	jFile.println("\ticonst_1 \t; true");
    	
        jFile.println("L00" + (this.labelIncrementer + 1) + ":"); // emit label
        jFile.println("\tifne L00" + (this.labelIncrementer + 2));
        jFile.println("\tgoto L00" + (this.labelIncrementer - 1));        
        
        jFile.println("L00" + (this.labelIncrementer + 2) + ":"); // emit label
        this.labelIncrementer += 3;
        
    	//System.out.println("Stack right before pop: " + symTabStack.getLocalSymTab());
		symTabStack.pop();
		//System.out.println("Stack right after pop: " + symTabStack.getLocalSymTab());
		
        return 0;
    }
    
    @Override
    public Integer visitBoolAnd(TitanParser.BoolAndContext ctx) {
        visit(ctx.boolExprs(0));
        visit(ctx.boolExprs(1));
        jFile.println("iand");
        return 0;
    }

    @Override
    public Integer visitBoolOr(TitanParser.BoolOrContext ctx) {
        visit(ctx.boolExprs(0));
        visit(ctx.boolExprs(1));
        jFile.println("ior");
        return 0;
    }

    @Override
    public Integer visitBoolParen(TitanParser.BoolParenContext ctx) {
        return visitChildren(ctx);
    }
    
    //Functions
    
    //Function declaration
    @Override
    public Integer visitFunctionWithArgsDecl(TitanParser.FunctionWithArgsDeclContext ctx) {  
    	//emit function header
    	String funcHeader = (String) symTabStack.lookupLocal(ctx.ID().getText()).getAttribute(FUNCTION_HEADER);
    	jFile.println("\n.method static " + ctx.ID().toString() + funcHeader);
    	
    	//push local symbol table for function and visit children
    	functionCall = true;
    	symTabStack.push((SymTab) symTabStack.lookupLocal(ctx.ID().getText()).getAttribute(ROUTINE_SYMTAB));
    	Integer value = visitChildren(ctx);
    	symTabStack.pop();
    	functionCall = false;
    	
    	//emit function return type
    	char returnType = funcHeader.charAt(funcHeader.length() - 1);
    	
    	if(returnType == 'F')
    		jFile.println("\tfreturn\n");
    	else if(returnType == 'V')
    		jFile.println("\treturn\n");
    	else if(returnType == ';')
    		jFile.println("\tareturn\n");
    	else
    		jFile.println("\tireturn\n");
    	
    	numArgs = 0; //reset number of arguments
    	
    	jFile.println(".limit locals 32");
        jFile.println(".limit stack 32");
    	jFile.println(".end method");
    	return value;
    }
    
    //Function argument declaration
    @Override
    public Integer visitArgDecl(TitanParser.ArgDeclContext ctx) { 
    	//load values on stack into registers for variables 
    	for(int i = 1; i < ctx.children.size(); i+=2) {
    		String argType = ctx.getChild(i-1).getText();
    		int slot_no = (Integer) symTabStack.lookupLocal(ctx.getChild(i).getText()).getAttribute(SLOT);
    		if(argType.equals("float")) {
    			jFile.println("\tfload " + numArgs++); //load value from argument register
    			jFile.println("\tfstore " + slot_no);  //store argument into register for variable
    		}	
    		else if(argType.equals("int") || argType.equals("bool")) {
    			jFile.println("\tiload " + numArgs++); //load value from argument register
    			jFile.println("\tistore " + slot_no); //store argument into register for variable
    		}	
    		else if(argType.equals("string")) {
    			jFile.println("\taload " + numArgs++); //load value from argument register
    			jFile.println("\tastore " + slot_no); //store argument into register for variable
    		}
    	}
    	
    	return visitChildren(ctx);
    }
    
    //function call
    @Override
    public Integer visitRegularFunctionWithArgs(TitanParser.RegularFunctionWithArgsContext ctx) {
        Integer value = visitChildren(ctx);
        
        //emit function call
        jFile.println("\tinvokestatic " + programId.getName() + "/" + ctx.ID() + symTabStack.lookupLocal(ctx.ID().getText()).getAttribute(FUNCTION_HEADER));
        
        return value;
    }
    
    @Override
    public Integer visitFunctionWithoutArgsDecl(TitanParser.FunctionWithoutArgsDeclContext ctx) {  
    	//emit function header
    	String funcHeader = (String) symTabStack.lookupLocal(ctx.ID().getText()).getAttribute(FUNCTION_HEADER);
    	jFile.println("\n.method static " + ctx.ID().toString() + funcHeader);
    	
    	//push local symbol table for function and visit children
    	functionCall = true;
    	symTabStack.push((SymTab) symTabStack.lookupLocal(ctx.ID().getText()).getAttribute(ROUTINE_SYMTAB));
    	Integer value = visitChildren(ctx);
    	symTabStack.pop();
    	functionCall = false;
    	
    	//emit function return type
    	char returnType = funcHeader.charAt(funcHeader.length() - 1);
    	
    	if(returnType == 'F')
    		jFile.println("\tfreturn\n");
    	else if(returnType == 'V')
    		jFile.println("\treturn\n");
    	else if(returnType == ';')
    		jFile.println("\tareturn\n");
    	else
    		jFile.println("\tireturn\n");
    	
    	numArgs = 0; //reset number of arguments
    	
    	jFile.println(".limit locals 32");
        jFile.println(".limit stack 32");
    	jFile.println(".end method");
    	return value;
    }
    
    //function call
    @Override
    public Integer visitRegularFunctionWithoutArgs(TitanParser.RegularFunctionWithoutArgsContext ctx) {
        Integer value = visitChildren(ctx);
        
        //emit function call
        jFile.println("\tinvokestatic " + programId.getName() + "/" + ctx.ID() + symTabStack.lookup(ctx.ID().getText()).getAttribute(FUNCTION_HEADER));
        
        return value;
    }
}
