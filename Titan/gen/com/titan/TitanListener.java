// Generated from /Users/thomaspedersen/CS153/TeamProject/cs-153/Titan/src/com/titan/Titan.g4 by ANTLR 4.7
package com.titan;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TitanParser}.
 */
public interface TitanListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by the {@code SimpleExp}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExp(TitanParser.SimpleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleExp}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExp(TitanParser.SimpleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentExpr(TitanParser.ParentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentExpr(TitanParser.ParentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(TitanParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link TitanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(TitanParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOp(TitanParser.MulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOp(TitanParser.MulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(TitanParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(TitanParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterModOp(TitanParser.ModOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitModOp(TitanParser.ModOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TitanParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TitanParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenSimpleExpr}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenSimpleExpr(TitanParser.ParenSimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenSimpleExpr}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenSimpleExpr(TitanParser.ParenSimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TitanParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TitanParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(TitanParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link TitanParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(TitanParser.AddSubOpContext ctx);
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
	 * Enter a parse tree produced by the {@code IfBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterIfBrackets(TitanParser.IfBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitIfBrackets(TitanParser.IfBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterIfNoBrackets(TitanParser.IfNoBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitIfNoBrackets(TitanParser.IfNoBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterElseBrackets(TitanParser.ElseBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitElseBrackets(TitanParser.ElseBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterElseNoBrackets(TitanParser.ElseNoBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseNoBrackets}
	 * labeled alternative in {@link TitanParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitElseNoBrackets(TitanParser.ElseNoBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(TitanParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(TitanParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(TitanParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(TitanParser.FunctionDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link TitanParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TitanParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TitanParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TitanParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TitanParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitanParser#shorthandAssignment}.
	 * @param ctx the parse tree
	 */
	void enterShorthandAssignment(TitanParser.ShorthandAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#shorthandAssignment}.
	 * @param ctx the parse tree
	 */
	void exitShorthandAssignment(TitanParser.ShorthandAssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TitanParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TitanParser.FunctionCallContext ctx);
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
	 * Enter a parse tree produced by {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(TitanParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitanParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(TitanParser.NumberContext ctx);
}