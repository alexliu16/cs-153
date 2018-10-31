// Generated from /Users/thomaspedersen/CS153/TeamProject/cs-153/Titan/src/com/titan/Titan.g4 by ANTLR 4.7
package com.titan;
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
	 * Visit a parse tree produced by the {@code SimpleExp}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExp(TitanParser.SimpleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentExpr(TitanParser.ParentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(TitanParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(TitanParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(TitanParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModOp(TitanParser.ModOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TitanParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenSimpleExpr}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenSimpleExpr(TitanParser.ParenSimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TitanParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(TitanParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(TitanParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBrackets(TitanParser.IfBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNoBrackets(TitanParser.IfNoBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBrackets(TitanParser.ElseBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseNoBrackets(TitanParser.ElseNoBracketsContext ctx);
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
	 * Visit a parse tree produced by {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TitanParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#shorthandAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorthandAssignment(TitanParser.ShorthandAssignmentContext ctx);
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
	 * Visit a parse tree produced by {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TitanParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(TitanParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TitanParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(TitanParser.NumberContext ctx);
}