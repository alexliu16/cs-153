// Generated from Titan.g4 by ANTLR 4.7.1
package com.titan;

    import com.titan.intermediate.*;
    import com.titan.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TitanParser}.
 */
public interface TitanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TitanParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(TitanParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(TitanParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TitanParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TitanParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TitanParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TitanParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TitanParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TitanParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(TitanParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(TitanParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(TitanParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(TitanParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(TitanParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(TitanParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOp(TitanParser.MulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOp(TitanParser.MulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(TitanParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(TitanParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterModOp(TitanParser.ModOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitModOp(TitanParser.ModOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TitanParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TitanParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TitanParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TitanParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(TitanParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(TitanParser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterString(TitanParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitString(TitanParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleExprParen}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExprParen(TitanParser.SimpleExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleExprParen}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExprParen(TitanParser.SimpleExprParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(TitanParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(TitanParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(TitanParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(TitanParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(TitanParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(TitanParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolIdentifier}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolIdentifier(TitanParser.BoolIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolIdentifier}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolIdentifier(TitanParser.BoolIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolParen}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolParen(TitanParser.BoolParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolParen}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolParen(TitanParser.BoolParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolOr(TitanParser.BoolOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolOr(TitanParser.BoolOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolAnd(TitanParser.BoolAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolAnd(TitanParser.BoolAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterIfElseBrackets(TitanParser.IfElseBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitIfElseBrackets(TitanParser.IfElseBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterIfElseNoBrackets(TitanParser.IfElseNoBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitIfElseNoBrackets(TitanParser.IfElseNoBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link TitanParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(TitanParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link TitanParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(TitanParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link TitanParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(TitanParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link TitanParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(TitanParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionWithArgsDecl}
	 * labeled alternative in {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWithArgsDecl(TitanParser.FunctionWithArgsDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionWithArgsDecl}
	 * labeled alternative in {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWithArgsDecl(TitanParser.FunctionWithArgsDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionWithoutArgsDecl}
	 * labeled alternative in {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWithoutArgsDecl(TitanParser.FunctionWithoutArgsDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionWithoutArgsDecl}
	 * labeled alternative in {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWithoutArgsDecl(TitanParser.FunctionWithoutArgsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(TitanParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(TitanParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#argDecl}.
	 * @param ctx the parse tree
	 */
	void enterArgDecl(TitanParser.ArgDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#argDecl}.
	 * @param ctx the parse tree
	 */
	void exitArgDecl(TitanParser.ArgDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalDeclaration}
	 * labeled alternative in {@link TitanParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalDeclaration(TitanParser.NormalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalDeclaration}
	 * labeled alternative in {@link TitanParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalDeclaration(TitanParser.NormalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryDeclaration}
	 * labeled alternative in {@link TitanParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterTernaryDeclaration(TitanParser.TernaryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryDeclaration}
	 * labeled alternative in {@link TitanParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitTernaryDeclaration(TitanParser.TernaryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssignment(TitanParser.SimpleAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssignment(TitanParser.SimpleAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryOpAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOpAssignment(TitanParser.TernaryOpAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryOpAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOpAssignment(TitanParser.TernaryOpAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShorthandIncDecAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterShorthandIncDecAssignment(TitanParser.ShorthandIncDecAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShorthandIncDecAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitShorthandIncDecAssignment(TitanParser.ShorthandIncDecAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpecialAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSpecialAssignment(TitanParser.SpecialAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpecialAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSpecialAssignment(TitanParser.SpecialAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#primitives}.
	 * @param ctx the parse tree
	 */
	void enterPrimitives(TitanParser.PrimitivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#primitives}.
	 * @param ctx the parse tree
	 */
	void exitPrimitives(TitanParser.PrimitivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#funcReturnTypes}.
	 * @param ctx the parse tree
	 */
	void enterFuncReturnTypes(TitanParser.FuncReturnTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#funcReturnTypes}.
	 * @param ctx the parse tree
	 */
	void exitFuncReturnTypes(TitanParser.FuncReturnTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#retStat}.
	 * @param ctx the parse tree
	 */
	void enterRetStat(TitanParser.RetStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#retStat}.
	 * @param ctx the parse tree
	 */
	void exitRetStat(TitanParser.RetStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Printf}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintf(TitanParser.PrintfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Printf}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintf(TitanParser.PrintfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularFunctionCallWithArgs}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionCallWithArgs(TitanParser.RegularFunctionCallWithArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularFunctionCallWithArgs}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionCallWithArgs(TitanParser.RegularFunctionCallWithArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularFunctionCallWithoutArgs}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionCallWithoutArgs(TitanParser.RegularFunctionCallWithoutArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularFunctionCallWithoutArgs}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionCallWithoutArgs(TitanParser.RegularFunctionCallWithoutArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link TitanParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStrLit(TitanParser.StrLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link TitanParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStrLit(TitanParser.StrLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#printfexprList}.
	 * @param ctx the parse tree
	 */
	void enterPrintfexprList(TitanParser.PrintfexprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#printfexprList}.
	 * @param ctx the parse tree
	 */
	void exitPrintfexprList(TitanParser.PrintfexprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(TitanParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(TitanParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void enterInteger(TitanParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void exitInteger(TitanParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloat(TitanParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloat(TitanParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exponential}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void enterExponential(TitanParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exponential}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void exitExponential(TitanParser.ExponentialContext ctx);
}