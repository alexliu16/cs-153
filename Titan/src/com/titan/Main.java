package com.titan;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("sample.t");

        ANTLRInputStream input = new ANTLRInputStream(is);
        TitanLexer lexer = new TitanLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TitanParser parser = new TitanParser(tokens);
        ParseTree tree = parser.className();

        TitanVisitorPass1 pass1 = new TitanVisitorPass1();
        pass1.visit(tree);

        PrintWriter jFile = pass1.getAssemblyFile();
        TitanVisitorPass2 pass2 = new TitanVisitorPass2(jFile, pass1);
        pass2.visit(tree);
    }
}
