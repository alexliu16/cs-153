// Generated from /Users/thomaspedersen/CS153/TeamProject/cs-153/Titan/src/com/titan/Titan.g4 by ANTLR 4.7
package com.titan;

    import com.titan.intermediate.*;
    import com.titan.intermediate.symtabimpl.*;

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
	 * Visit a parse tree produced by {@link TitanParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(TitanParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TitanParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TitanParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(TitanParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(TitanParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(TitanParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(TitanParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(TitanParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(TitanParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModOp(TitanParser.ModOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TitanParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TitanParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(TitanParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(TitanParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExprParen}
	 * labeled alternative in {@link TitanParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExprParen(TitanParser.SimpleExprParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(TitanParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(TitanParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(TitanParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolIdentifier}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolIdentifier(TitanParser.BoolIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolParen}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParen(TitanParser.BoolParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOr(TitanParser.BoolOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link TitanParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAnd(TitanParser.BoolAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseBrackets(TitanParser.IfElseBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseNoBrackets(TitanParser.IfElseNoBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(TitanParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(TitanParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(TitanParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#argDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgDecl(TitanParser.ArgDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TitanParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignment(TitanParser.SimpleAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShorthandIncDecAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorthandIncDecAssignment(TitanParser.ShorthandIncDecAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpecialAssignment}
	 * labeled alternative in {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialAssignment(TitanParser.SpecialAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#primitives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitives(TitanParser.PrimitivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#funcReturnTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncReturnTypes(TitanParser.FuncReturnTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#retStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStat(TitanParser.RetStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Printf}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintf(TitanParser.PrintfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularFunction}
	 * labeled alternative in {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(TitanParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(TitanParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#printfexprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintfexprList(TitanParser.PrintfexprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(TitanParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(TitanParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(TitanParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exponential}
	 * labeled alternative in {@link TitanParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponential(TitanParser.ExponentialContext ctx);
}