package com.titan;

import java.io.PrintWriter;

import com.titan.intermediate.*;
import com.titan.intermediate.symtabimpl.*;

public class TitanVisitorPass2 extends TitanBaseVisitor<Integer>
{
    String programName;
    private PrintWriter jFile;

    public TitanVisitorPass2(PrintWriter jFile)
    {
        this.jFile = jFile;
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

        Integer value = visitChildren(ctx);

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

        return value;
    }


    @Override
    public Integer visitAssignment(TitanParser.AssignmentContext ctx) {
        Integer value = visit(ctx.expr());

        String typeIndicator = (ctx.expr().type == Predefined.integerType) ? "I"
                : (ctx.expr().type == Predefined.realType)    ? "F"
                : "?";
        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                +  "/" + ctx.ID().toString()
                + " " + typeIndicator);

        return value;
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
        TypeSpec type = ctx.type;

        String typeIndicator = (type == Predefined.integerType) ? "I"
                : (type == Predefined.realType)    ? "F"
                :                                    "?";

        // Emit a field get instruction.
        jFile.println("\tgetstatic\t" + programName +
                "/" + variableName + " " + typeIndicator);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitStringExpr(TitanParser.StringExprContext ctx) {
        jFile.println("ldc " + ctx.getText() + " ; load string constant");
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
        jFile.println("; count of printf is " + count);
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
            else
                jFile.println("Failure casting to object");
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
}
