package com.titan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TitanVisitorImpl extends TitanBaseVisitor<Object> {

    PrintStream out;

    {
        try {
            out = new PrintStream(
                        new FileOutputStream("out.j", false));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object visitClassName(TitanParser.ClassNameContext ctx) {
        String name = ctx.ID().toString();
        out.println(".class public " + name);
        out.println(".super java/lang/Object");
        visit(ctx.prog());
        return 0;
    }

    @Override
    public Object visitProg(TitanParser.ProgContext ctx) {
        out.println(".method public static main([Ljava/lang/String;)V");
        visit(ctx.block());
        out.println("return");
        out.println(".limit locals 32"); // temporarily set to 32
        out.println(".limit stack 32"); // temporarily set to 32
        out.println(".end method");
        return 0;
    }

    @Override
    public Object visitPrint(TitanParser.PrintContext ctx) {
        out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
        ExpressionType type = (ExpressionType)visit(ctx.expr());
        out.println("invokevirtual java/io/PrintStream/println("+type.getType().toUpperCase()+")V");
        return null;
    }

    private String opTypeToText(int type) {
        switch(type) {
            case TitanLexer.ADD: return "add";
            case TitanLexer.SUB: return "sub";
            case TitanLexer.MUL: return "mul";
            case TitanLexer.DIV: return "div";
            default: return "err";
        }
    }

    @Override
    public Object visitAddSubOp(TitanParser.AddSubOpContext ctx) {
        return arithmeticOp(
                (ExpressionType)visit(ctx.simpleExpression(0)),
                (ExpressionType)visit(ctx.simpleExpression(1)),
                ctx.op.getType()
        );
    }
    @Override
    public Object visitMulDivOp(TitanParser.MulDivOpContext ctx) {
        return arithmeticOp(
                (ExpressionType)visit(ctx.simpleExpression(0)),
                (ExpressionType)visit(ctx.simpleExpression(1)),
                ctx.op.getType()
        );
    }

    private void toFloat(ExpressionType o1, ExpressionType o2) {
        out.println("i2f");
        o1.setType("f");
        o2.setType("f");
    }

    private void iOp(String text) {
        out.println ("i" + text);
    }
    private void fOp(String text) {
        out.println ("f" + text);
    }

    public ExpressionType arithmeticOp(ExpressionType o1, ExpressionType o2, int type) {

        String text = opTypeToText(type);

        if(o2.isInteger() && o1.isFloat()) {
            toFloat(o1, o2);
        }

        if (o1.isInteger() && o2.isFloat()) {
            toFloat(o1, o2);
        }

        if(o1.isInteger() && o2.isInteger()) {
            iOp(text);
            return new ExpressionType("i");
        }
        else {
            fOp(text);
            return new ExpressionType("f");
        }
    }

    @Override
    public Object visitSimpleExprParen(TitanParser.SimpleExprParenContext ctx) {
        return visit(ctx.simpleExpression());
    }

    @Override
    public Object visitLiteral(TitanParser.LiteralContext ctx) {
        Object value = visit(ctx.number());
        return value;
    }

    @Override
    public Object visitIdentifier(TitanParser.IdentifierContext ctx) {
        String id = ctx.ID().toString();
        // lookup id from symbol table and find its slot #
        // determine its type

        // temporary for testing: pretend id is local, has slot # 1 and is an int
        IdentifierLoadStoreSlot ilss = new IdentifierLoadStoreSlot("i", "load", 1);
        out.println(ilss);
        return ilss;
    }

    @Override
    public Object visitInteger(TitanParser.IntegerContext ctx) {
        LoadConstant ldc = new LoadConstant("i", Integer.valueOf(ctx.DIGITS().getText()));
        out.println(ldc);
        return ldc;
    }

    @Override
    public Object visitFloat(TitanParser.FloatContext ctx) {
        LoadConstant ldc = new LoadConstant("f", Float.valueOf(ctx.FLOATINGNUMBER().getText()));
        out.println(ldc);
        return ldc;
    }

    @Override
    public Object visitExponential(TitanParser.ExponentialContext ctx) {
        String str = ctx.EXPNUM().toString();
        String[] parts = str.split("[eE]");
        LoadConstant ldc = new LoadConstant("f", (float)(Float.valueOf(parts[0]) * Math.pow(10, Float.valueOf(parts[1]))));
        out.println(ldc);
        return ldc;
    }
}
