// Generated from Titan.g4 by ANTLR 4.4
package com.titan;

    import com.titan.intermediate.*;
    import com.titan.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TitanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TitanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull TitanParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Printf}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintf(@NotNull TitanParser.PrintfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseNoBrackets(@NotNull TitanParser.IfElseNoBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(@NotNull TitanParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpecialAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialAssignment(@NotNull TitanParser.SpecialAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#funcReturnTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncReturnTypes(@NotNull TitanParser.FuncReturnTypesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(@NotNull TitanParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolIdentifier}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolIdentifier(@NotNull TitanParser.BoolIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull TitanParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exponential}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponential(@NotNull TitanParser.ExponentialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull TitanParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExprParen}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExprParen(@NotNull TitanParser.SimpleExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignment(@NotNull TitanParser.SimpleAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseBrackets(@NotNull TitanParser.IfElseBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(@NotNull TitanParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(@NotNull TitanParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModOp(@NotNull TitanParser.ModOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#primitives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitives(@NotNull TitanParser.PrimitivesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull TitanParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(@NotNull TitanParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull TitanParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#printfexprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintfexprList(@NotNull TitanParser.PrintfexprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull TitanParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull TitanParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularFunctionWithoutArgs}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionWithoutArgs(@NotNull TitanParser.RegularFunctionWithoutArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolParen}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParen(@NotNull TitanParser.BoolParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionWithArgsDecl}
	 * labeled alternative in {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithArgsDecl(@NotNull TitanParser.FunctionWithArgsDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(@NotNull TitanParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionWithoutArgsDecl}
	 * labeled alternative in {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithoutArgsDecl(@NotNull TitanParser.FunctionWithoutArgsDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull TitanParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(@NotNull TitanParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShorthandIncDecAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorthandIncDecAssignment(@NotNull TitanParser.ShorthandIncDecAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull TitanParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull TitanParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull TitanParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#argDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgDecl(@NotNull TitanParser.ArgDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull TitanParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull TitanParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(@NotNull TitanParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularFunctionWithArgs}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionWithArgs(@NotNull TitanParser.RegularFunctionWithArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(@NotNull TitanParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(@NotNull TitanParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#retStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStat(@NotNull TitanParser.RetStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOr(@NotNull TitanParser.BoolOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAnd(@NotNull TitanParser.BoolAndContext ctx);
}