// Generated from Titan.g4 by ANTLR 4.4
package com.titan;

    import com.titan.intermediate.*;
    import com.titan.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TitanParser}.
 */
public interface TitanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull TitanParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull TitanParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Printf}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintf(@NotNull TitanParser.PrintfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Printf}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintf(@NotNull TitanParser.PrintfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterIfElseNoBrackets(@NotNull TitanParser.IfElseNoBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitIfElseNoBrackets(@NotNull TitanParser.IfElseNoBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(@NotNull TitanParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(@NotNull TitanParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpecialAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSpecialAssignment(@NotNull TitanParser.SpecialAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpecialAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSpecialAssignment(@NotNull TitanParser.SpecialAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#funcReturnTypes}.
	 * @param ctx the parse tree
	 */
	void enterFuncReturnTypes(@NotNull TitanParser.FuncReturnTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#funcReturnTypes}.
	 * @param ctx the parse tree
	 */
	void exitFuncReturnTypes(@NotNull TitanParser.FuncReturnTypesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(@NotNull TitanParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(@NotNull TitanParser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolIdentifier}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolIdentifier(@NotNull TitanParser.BoolIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolIdentifier}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolIdentifier(@NotNull TitanParser.BoolIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(@NotNull TitanParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(@NotNull TitanParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exponential}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void enterExponential(@NotNull TitanParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exponential}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void exitExponential(@NotNull TitanParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull TitanParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull TitanParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleExprParen}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExprParen(@NotNull TitanParser.SimpleExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleExprParen}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExprParen(@NotNull TitanParser.SimpleExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssignment(@NotNull TitanParser.SimpleAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssignment(@NotNull TitanParser.SimpleAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterIfElseBrackets(@NotNull TitanParser.IfElseBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitIfElseBrackets(@NotNull TitanParser.IfElseBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(@NotNull TitanParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(@NotNull TitanParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(@NotNull TitanParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(@NotNull TitanParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterModOp(@NotNull TitanParser.ModOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitModOp(@NotNull TitanParser.ModOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#primitives}.
	 * @param ctx the parse tree
	 */
	void enterPrimitives(@NotNull TitanParser.PrimitivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#primitives}.
	 * @param ctx the parse tree
	 */
	void exitPrimitives(@NotNull TitanParser.PrimitivesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull TitanParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull TitanParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(@NotNull TitanParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(@NotNull TitanParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull TitanParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull TitanParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#printfexprList}.
	 * @param ctx the parse tree
	 */
	void enterPrintfexprList(@NotNull TitanParser.PrintfexprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#printfexprList}.
	 * @param ctx the parse tree
	 */
	void exitPrintfexprList(@NotNull TitanParser.PrintfexprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull TitanParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull TitanParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull TitanParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull TitanParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularFunctionWithoutArgs}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionWithoutArgs(@NotNull TitanParser.RegularFunctionWithoutArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularFunctionWithoutArgs}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionWithoutArgs(@NotNull TitanParser.RegularFunctionWithoutArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolParen}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolParen(@NotNull TitanParser.BoolParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolParen}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolParen(@NotNull TitanParser.BoolParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionWithArgsDecl}
	 * labeled alternative in {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWithArgsDecl(@NotNull TitanParser.FunctionWithArgsDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionWithArgsDecl}
	 * labeled alternative in {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWithArgsDecl(@NotNull TitanParser.FunctionWithArgsDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOp(@NotNull TitanParser.MulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOp(@NotNull TitanParser.MulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionWithoutArgsDecl}
	 * labeled alternative in {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWithoutArgsDecl(@NotNull TitanParser.FunctionWithoutArgsDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionWithoutArgsDecl}
	 * labeled alternative in {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWithoutArgsDecl(@NotNull TitanParser.FunctionWithoutArgsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull TitanParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull TitanParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull TitanParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull TitanParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShorthandIncDecAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterShorthandIncDecAssignment(@NotNull TitanParser.ShorthandIncDecAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShorthandIncDecAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitShorthandIncDecAssignment(@NotNull TitanParser.ShorthandIncDecAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull TitanParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull TitanParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull TitanParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull TitanParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull TitanParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull TitanParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#argDecl}.
	 * @param ctx the parse tree
	 */
	void enterArgDecl(@NotNull TitanParser.ArgDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#argDecl}.
	 * @param ctx the parse tree
	 */
	void exitArgDecl(@NotNull TitanParser.ArgDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull TitanParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull TitanParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull TitanParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull TitanParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloat(@NotNull TitanParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloat(@NotNull TitanParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularFunctionWithArgs}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionWithArgs(@NotNull TitanParser.RegularFunctionWithArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularFunctionWithArgs}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionWithArgs(@NotNull TitanParser.RegularFunctionWithArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(@NotNull TitanParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(@NotNull TitanParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(@NotNull TitanParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(@NotNull TitanParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#retStat}.
	 * @param ctx the parse tree
	 */
	void enterRetStat(@NotNull TitanParser.RetStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#retStat}.
	 * @param ctx the parse tree
	 */
	void exitRetStat(@NotNull TitanParser.RetStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolOr(@NotNull TitanParser.BoolOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolOr(@NotNull TitanParser.BoolOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolAnd(@NotNull TitanParser.BoolAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolAnd(@NotNull TitanParser.BoolAndContext ctx);
}