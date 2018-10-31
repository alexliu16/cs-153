package com.titan;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("sample.t");

        ANTLRInputStream input = new ANTLRInputStream(is);
        TitanLexer lexer = new TitanLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TitanParser parser = new TitanParser(tokens);
        ParseTree tree = parser.prog();

        tokens.getTokens().forEach(t -> System.out.println(t.getText()));
        System.out.println(tree.toStringTree(parser));

    }
}
