package com.titan;

import java.io.PrintWriter;
import java.util.ArrayList;

import com.titan.intermediate.*;
import com.titan.intermediate.symtabimpl.*;

import static com.titan.intermediate.symtabimpl.SymTabKeyImpl.DATA_VALUE;
import static com.titan.intermediate.symtabimpl.SymTabKeyImpl.SLOT;

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
    public Integer visitRegularFunction(TitanParser.RegularFunctionContext ctx) {
        localDeclarations = true;
        Integer value = visitChildren(ctx);
        //add code for functions here
        localDeclarations = false;
        return value;
    }

    @Override
    public Integer visitAssignment(TitanParser.AssignmentContext ctx) {
        Integer value = visit(ctx.expr());

        String typeIndicator = (ctx.expr().type == Predefined.integerType) ? "I"
                : (ctx.expr().type == Predefined.realType)    ? "F"
                : "?";
        SymTabEntry local = symTabStack.lookupLocal(ctx.ID().toString());

        if(local != null) {
            jFile.println(";load local value from stack");
            jFile.println("iload " + local.getAttribute(SLOT));
            jFile.println(";Save new value here");
        }
        else {
            // Emit a field put instruction.
            jFile.println("\tputstatic\t" + programName
                    + "/" + ctx.ID().toString()
                    + " " + typeIndicator);
        }

        return value;
    }

    @Override
    public Integer visitDeclaration(TitanParser.DeclarationContext ctx) {
        String name = ctx.ID().getText();
        if(localDeclarations) {
            SymTabEntry entry = symTabStack.lookupLocal(name);
            if(entry != null) {
                char type = entry.getTypeSpec() == Predefined.integerType ? 'i'
                        : entry.getTypeSpec() == Predefined.realType ? 'f' : '?';
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


        SymTabEntry local = symTabStack.lookupLocal(ctx.ID().toString());
        ctx.type = local.getTypeSpec();
        TypeSpec type = ctx.type;

        String typeIndicator = (type == Predefined.integerType) ? "I"
                : (type == Predefined.realType)    ? "F"
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

    @Override
    public Integer visitStringExpr(TitanParser.StringExprContext ctx) {
        jFile.println("ldc " + ctx.getText());
        return 0;
    }

    boolean printfFirstPass = false;
    boolean printfSecondPass = false;
    int printfArgCount = 0;
    @Override
    public Integer visitPrintf(TitanParser.PrintfContext ctx) {
        jFile.println("getstatic java/lang/System/out Ljava/io/PrintStream; ");
        printfFirstPass = true;
        Integer count = visit(ctx.printfexprList());
        printfArgCount = count-1;
        printfFirstPass = false;
        printfSecondPass = true;
        visit(ctx.printfexprList());
        printfSecondPass = false;
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
                jFile.println("invokestatic java/lang/Boolean.valueOf(F)Ljava/lang/Boolean;");
            else
                jFile.println("Failure casting " + ctx.expr().getText() + " to object. Type is " + ctx.expr().type);
            jFile.println("aastore");
            if(value != printfArgCount)
                jFile.println("dup");
        }
        System.out.println(value);
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
}
