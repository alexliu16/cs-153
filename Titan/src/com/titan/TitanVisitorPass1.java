package com.titan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TitanVisitorPass1 extends TitanBaseVisitor<Object> {

    PrintWriter jfile;

    {
        try {
            jfile = new PrintWriter(
                        new FileOutputStream("out.j", false));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object visitClassName(TitanParser.ClassNameContext ctx) {
        String name = ctx.ID().toString();
        jfile.println(".class public " + name);
        jfile.println(".super java/lang/Object");
        visit(ctx.prog());
        return 0;
    }

    @Override
    public Object visitProg(TitanParser.ProgContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public Object visitPrint(TitanParser.PrintContext ctx) {
        return null;
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

    /*
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
        */
    return null;
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
        //jfile.println(ilss);
        return ilss;
    }

    @Override
    public Object visitInteger(TitanParser.IntegerContext ctx) {
        LoadConstant ldc = new LoadConstant("i", Integer.valueOf(ctx.DIGITS().getText()));
        //jfile.println(ldc);
        return ldc;
    }

    @Override
    public Object visitFloat(TitanParser.FloatContext ctx) {
        LoadConstant ldc = new LoadConstant("f", Float.valueOf(ctx.FLOATINGNUMBER().getText()));
        //jfile.println(ldc);
        return ldc;
    }

    @Override
    public Object visitExponential(TitanParser.ExponentialContext ctx) {
        String str = ctx.EXPNUM().toString();
        String[] parts = str.split("[eE]");
        LoadConstant ldc = new LoadConstant("f", (float)(Float.valueOf(parts[0]) * Math.pow(10, Float.valueOf(parts[1]))));
        //jfile.println(ldc);
        return ldc;
    }

    public PrintWriter getAssemblyFile() {
        return jfile;
    }
}
