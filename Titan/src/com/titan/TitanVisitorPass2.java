package com.titan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TitanVisitorPass2 extends TitanBaseVisitor<Object> {

    PrintWriter jfile;

    public TitanVisitorPass2(PrintWriter jfile) {
        this.jfile = jfile;
    }

    @Override
    public Object visitClassName(TitanParser.ClassNameContext ctx) {
        String name = ctx.ID().toString();
        return 0;
    }

    @Override
    public Object visitProg(TitanParser.ProgContext ctx) {
        jfile.println(".method public static main([Ljava/lang/String;)V");
        visit(ctx.block());
        jfile.println("return");
        jfile.println(".limit locals 32"); // temporarily set to 32
        jfile.println(".limit stack 32"); // temporarily set to 32
        jfile.println(".end method");
        return 0;
    }

    @Override
    public Object visitPrint(TitanParser.PrintContext ctx) {
        jfile.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
        ExpressionType type = (ExpressionType)visit(ctx.expr());
        jfile.println("invokevirtual java/io/PrintStream/println("+type.getType().toUpperCase()+")V");
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
        jfile.println("i2f");
        o1.setType("f");
        o2.setType("f");
    }

    private void iOp(String text) {
        jfile.println ("i" + text);
    }
    private void fOp(String text) {
        jfile.println ("f" + text);
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
        jfile.println(ilss);
        return ilss;
    }

    @Override
    public Object visitInteger(TitanParser.IntegerContext ctx) {
        LoadConstant ldc = new LoadConstant("i", Integer.valueOf(ctx.DIGITS().getText()));
        jfile.println(ldc);
        return ldc;
    }

    @Override
    public Object visitFloat(TitanParser.FloatContext ctx) {
        LoadConstant ldc = new LoadConstant("f", Float.valueOf(ctx.FLOATINGNUMBER().getText()));
        jfile.println(ldc);
        return ldc;
    }

    @Override
    public Object visitExponential(TitanParser.ExponentialContext ctx) {
        String str = ctx.EXPNUM().toString();
        String[] parts = str.split("[eE]");
        LoadConstant ldc = new LoadConstant("f", (float)(Float.valueOf(parts[0]) * Math.pow(10, Float.valueOf(parts[1]))));
        jfile.println(ldc);
        return ldc;
    }
}
