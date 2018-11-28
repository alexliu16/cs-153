// Generated from /Users/thomaspedersen/CS153/TeamProject/cs-153/Titan/src/com/titan/Titan.g4 by ANTLR 4.7
package com.titan;

    import com.titan.intermediate.*;
    import com.titan.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TitanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, MUL=19, DIV=20, ADD=21, SUB=22, MOD=23, CONST=24, INT=25, BOOL=26, 
		CHAR=27, FLOAT=28, AssignmentOp=29, PLUS_EQ=30, MINUS_EQ=31, MUL_EQ=32, 
		DIV_EQ=33, EXPNUM=34, SHORTHANDASSIGNOP=35, PLUSPLUS=36, MINUSMINUS=37, 
		COMPARISON_OP=38, ID=39, WORD=40, FLOATINGNUMBER=41, DIGITS=42, NEWLINE=43, 
		WHITESPACE=44, LINECOMMENT=45, BLOCKCOMMENT=46, STRINGLIT=47;
	public static final int
		RULE_className = 0, RULE_prog = 1, RULE_block = 2, RULE_stat = 3, RULE_expr = 4, 
		RULE_simpleExpression = 5, RULE_comparison = 6, RULE_conditional = 7, 
		RULE_loop = 8, RULE_functionDeclaration = 9, RULE_args = 10, RULE_argDecl = 11, 
		RULE_declaration = 12, RULE_assignment = 13, RULE_shorthandAssignment = 14, 
		RULE_primitives = 15, RULE_funcReturnTypes = 16, RULE_retStat = 17, RULE_functionCall = 18, 
		RULE_stringExpr = 19, RULE_printfexprList = 20, RULE_exprList = 21, RULE_number = 22;
	public static final String[] ruleNames = {
		"className", "prog", "block", "stat", "expr", "simpleExpression", "comparison", 
		"conditional", "loop", "functionDeclaration", "args", "argDecl", "declaration", 
		"assignment", "shorthandAssignment", "primitives", "funcReturnTypes", 
		"retStat", "functionCall", "stringExpr", "printfexprList", "exprList", 
		"number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'main'", "'{'", "'}'", "'('", "')'", "'if'", "'else'", 
		"'for'", "'from'", "'to'", "'function'", "','", "'&'", "'='", "'void'", 
		"'return'", "'printf('", "'*'", "'/'", "'+'", "'-'", "'%'", "'const'", 
		"'int'", "'bool'", "'char'", "'float'", null, "'+='", "'-='", "'*='", 
		"'/='", null, null, "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", 
		"MOD", "CONST", "INT", "BOOL", "CHAR", "FLOAT", "AssignmentOp", "PLUS_EQ", 
		"MINUS_EQ", "MUL_EQ", "DIV_EQ", "EXPNUM", "SHORTHANDASSIGNOP", "PLUSPLUS", 
		"MINUSMINUS", "COMPARISON_OP", "ID", "WORD", "FLOATINGNUMBER", "DIGITS", 
		"NEWLINE", "WHITESPACE", "LINECOMMENT", "BLOCKCOMMENT", "STRINGLIT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Titan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TitanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TitanParser.ID, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TitanParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TitanParser.NEWLINE, i);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			match(ID);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(48);
				match(NEWLINE);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			prog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TitanParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TitanParser.NEWLINE, i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__1);
			setState(57);
			match(T__2);
			setState(58);
			block();
			setState(59);
			match(T__3);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(60);
				match(NEWLINE);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(66);
				functionDeclaration();
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(67);
					match(NEWLINE);
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				stat();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__16) | (1L << T__17) | (1L << CONST) | (1L << INT) | (1L << BOOL) | (1L << CHAR) | (1L << FLOAT) | (1L << EXPNUM) | (1L << ID) | (1L << FLOATINGNUMBER) | (1L << DIGITS) | (1L << NEWLINE) | (1L << STRINGLIT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TitanParser.NEWLINE, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public RetStatContext retStat() {
			return getRuleContext(RetStatContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				expr();
				setState(84);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				retStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TypeSpec type = null;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class SimpleExprContext extends ExprContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExprContext extends ExprContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SimpleExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				simpleExpression(0);
				}
				break;
			case 2:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__4);
				setState(96);
				expr();
				setState(97);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new ComparisonExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				comparison();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public TypeSpec type = null;
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	 
		public SimpleExpressionContext() { }
		public void copyFrom(SimpleExpressionContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class MulDivOpContext extends SimpleExpressionContext {
		public Token op;
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(TitanParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TitanParser.DIV, 0); }
		public MulDivOpContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterMulDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitMulDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitMulDivOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends SimpleExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModOpContext extends SimpleExpressionContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(TitanParser.MOD, 0); }
		public ModOpContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterModOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitModOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitModOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends SimpleExpressionContext {
		public TerminalNode ID() { return getToken(TitanParser.ID, 0); }
		public IdentifierContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralContext extends SimpleExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LiteralContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubOpContext extends SimpleExpressionContext {
		public Token op;
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(TitanParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TitanParser.SUB, 0); }
		public AddSubOpContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterAddSubOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitAddSubOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitAddSubOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends SimpleExpressionContext {
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public StringContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleExprParenContext extends SimpleExpressionContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExprParenContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterSimpleExprParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitSimpleExprParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitSimpleExprParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		return simpleExpression(0);
	}

	private SimpleExpressionContext simpleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, _parentState);
		SimpleExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_simpleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				stringExpr();
				}
				break;
			case 2:
				{
				_localctx = new SimpleExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(T__4);
				setState(105);
				simpleExpression(0);
				setState(106);
				match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				number();
				}
				break;
			case 5:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivOpContext(new SimpleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(113);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(114);
						((MulDivOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						simpleExpression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubOpContext(new SimpleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(116);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(117);
						((AddSubOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(118);
						simpleExpression(8);
						}
						break;
					case 3:
						{
						_localctx = new ModOpContext(new SimpleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(119);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(120);
						match(MOD);
						setState(121);
						simpleExpression(7);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode COMPARISON_OP() { return getToken(TitanParser.COMPARISON_OP, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparison);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				simpleExpression(0);
				setState(128);
				match(COMPARISON_OP);
				setState(129);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__4);
				setState(132);
				simpleExpression(0);
				setState(133);
				match(COMPARISON_OP);
				setState(134);
				simpleExpression(0);
				setState(135);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	 
		public ConditionalContext() { }
		public void copyFrom(ConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElseNoBracketsContext extends ConditionalContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TitanParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TitanParser.NEWLINE, i);
		}
		public IfElseNoBracketsContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterIfElseNoBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitIfElseNoBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitIfElseNoBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseBracketsContext extends ConditionalContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TitanParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TitanParser.NEWLINE, i);
		}
		public IfElseBracketsContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterIfElseBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitIfElseBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitIfElseBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditional);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IfElseBracketsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__6);
				setState(140);
				expr();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(141);
					match(NEWLINE);
					}
				}

				setState(144);
				match(T__2);
				setState(145);
				block();
				setState(146);
				match(T__3);
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(147);
						match(NEWLINE);
						}
					}

					setState(150);
					match(T__7);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(151);
						match(NEWLINE);
						}
					}

					setState(154);
					match(T__2);
					setState(155);
					block();
					setState(156);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new IfElseNoBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__6);
				setState(161);
				expr();
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(162);
					match(NEWLINE);
					}
					break;
				}
				setState(165);
				stat();
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(166);
						match(NEWLINE);
						}
					}

					setState(169);
					match(T__7);
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(170);
						match(NEWLINE);
						}
						break;
					}
					setState(173);
					stat();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TitanParser.ID, 0); }
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TitanParser.NEWLINE, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__8);
			setState(179);
			match(ID);
			setState(180);
			match(T__9);
			setState(181);
			simpleExpression(0);
			setState(182);
			match(T__10);
			setState(183);
			simpleExpression(0);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(184);
				match(NEWLINE);
				}
			}

			setState(187);
			match(T__2);
			setState(188);
			block();
			setState(189);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FuncReturnTypesContext funcReturnTypes() {
			return getRuleContext(FuncReturnTypesContext.class,0);
		}
		public TerminalNode ID() { return getToken(TitanParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TitanParser.NEWLINE, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__11);
			setState(192);
			funcReturnTypes();
			setState(193);
			match(ID);
			setState(194);
			match(T__4);
			setState(195);
			args(0);
			setState(196);
			match(T__5);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(197);
				match(NEWLINE);
				}
			}

			setState(200);
			match(T__2);
			setState(201);
			block();
			setState(202);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public ArgDeclContext argDecl() {
			return getRuleContext(ArgDeclContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		return args(0);
	}

	private ArgsContext args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsContext _localctx = new ArgsContext(_ctx, _parentState);
		ArgsContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(205);
			argDecl();
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(207);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(208);
					match(T__12);
					setState(209);
					argDecl();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgDeclContext extends ParserRuleContext {
		public Token ref;
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public TerminalNode ID() { return getToken(TitanParser.ID, 0); }
		public ArgDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterArgDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitArgDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitArgDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDeclContext argDecl() throws RecognitionException {
		ArgDeclContext _localctx = new ArgDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			primitives();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(216);
				((ArgDeclContext)_localctx).ref = match(T__13);
				}
			}

			setState(219);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public TerminalNode ID() { return getToken(TitanParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(TitanParser.NEWLINE, 0); }
		public TerminalNode CONST() { return getToken(TitanParser.CONST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(221);
				match(CONST);
				}
			}

			setState(224);
			primitives();
			setState(225);
			match(ID);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(226);
				match(T__14);
				setState(227);
				expr();
				}
			}

			setState(230);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TitanParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TitanParser.NEWLINE, 0); }
		public ShorthandAssignmentContext shorthandAssignment() {
			return getRuleContext(ShorthandAssignmentContext.class,0);
		}
		public TerminalNode AssignmentOp() { return getToken(TitanParser.AssignmentOp, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(ID);
				setState(233);
				match(T__14);
				setState(234);
				expr();
				setState(235);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				shorthandAssignment();
				setState(238);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(ID);
				setState(241);
				match(AssignmentOp);
				setState(242);
				expr();
				setState(243);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShorthandAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TitanParser.ID, 0); }
		public TerminalNode SHORTHANDASSIGNOP() { return getToken(TitanParser.SHORTHANDASSIGNOP, 0); }
		public ShorthandAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shorthandAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterShorthandAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitShorthandAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitShorthandAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShorthandAssignmentContext shorthandAssignment() throws RecognitionException {
		ShorthandAssignmentContext _localctx = new ShorthandAssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_shorthandAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ID);
			setState(248);
			match(SHORTHANDASSIGNOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitivesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TitanParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(TitanParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(TitanParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(TitanParser.FLOAT, 0); }
		public PrimitivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterPrimitives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitPrimitives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitPrimitives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitivesContext primitives() throws RecognitionException {
		PrimitivesContext _localctx = new PrimitivesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << CHAR) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncReturnTypesContext extends ParserRuleContext {
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public FuncReturnTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcReturnTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterFuncReturnTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitFuncReturnTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitFuncReturnTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncReturnTypesContext funcReturnTypes() throws RecognitionException {
		FuncReturnTypesContext _localctx = new FuncReturnTypesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcReturnTypes);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case CHAR:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				primitives();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TitanParser.NEWLINE, 0); }
		public RetStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterRetStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitRetStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitRetStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetStatContext retStat() throws RecognitionException {
		RetStatContext _localctx = new RetStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_retStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__16);
			setState(257);
			expr();
			setState(258);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TypeSpec type = null;
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class PrintfContext extends FunctionCallContext {
		public PrintfexprListContext printfexprList() {
			return getRuleContext(PrintfexprListContext.class,0);
		}
		public PrintfContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterPrintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitPrintf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitPrintf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegularFunctionContext extends FunctionCallContext {
		public TerminalNode ID() { return getToken(TitanParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public RegularFunctionContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionCall);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				_localctx = new PrintfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__17);
				setState(261);
				printfexprList(0);
				setState(262);
				match(T__5);
				}
				break;
			case ID:
				_localctx = new RegularFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(ID);
				setState(265);
				match(T__4);
				setState(266);
				exprList(0);
				setState(267);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringExprContext extends ParserRuleContext {
		public TerminalNode STRINGLIT() { return getToken(TitanParser.STRINGLIT, 0); }
		public StringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExprContext stringExpr() throws RecognitionException {
		StringExprContext _localctx = new StringExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(STRINGLIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintfexprListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintfexprListContext printfexprList() {
			return getRuleContext(PrintfexprListContext.class,0);
		}
		public PrintfexprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printfexprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterPrintfexprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitPrintfexprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitPrintfexprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintfexprListContext printfexprList() throws RecognitionException {
		return printfexprList(0);
	}

	private PrintfexprListContext printfexprList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrintfexprListContext _localctx = new PrintfexprListContext(_ctx, _parentState);
		PrintfexprListContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_printfexprList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(274);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrintfexprListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_printfexprList);
					setState(276);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(277);
					match(T__12);
					setState(278);
					expr();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		return exprList(0);
	}

	private ExprListContext exprList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprListContext _localctx = new ExprListContext(_ctx, _parentState);
		ExprListContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_exprList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprList);
					setState(287);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(288);
					match(T__12);
					setState(289);
					expr();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TypeSpec type = null;
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class IntegerContext extends NumberContext {
		public TerminalNode DIGITS() { return getToken(TitanParser.DIGITS, 0); }
		public IntegerContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends NumberContext {
		public TerminalNode FLOATINGNUMBER() { return getToken(TitanParser.FLOATINGNUMBER, 0); }
		public FloatContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentialContext extends NumberContext {
		public TerminalNode EXPNUM() { return getToken(TitanParser.EXPNUM, 0); }
		public ExponentialContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterExponential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitExponential(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitExponential(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_number);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(DIGITS);
				}
				break;
			case FLOATINGNUMBER:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(FLOATINGNUMBER);
				}
				break;
			case EXPNUM:
				_localctx = new ExponentialContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(EXPNUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return simpleExpression_sempred((SimpleExpressionContext)_localctx, predIndex);
		case 10:
			return args_sempred((ArgsContext)_localctx, predIndex);
		case 20:
			return printfexprList_sempred((PrintfexprListContext)_localctx, predIndex);
		case 21:
			return exprList_sempred((ExprListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleExpression_sempred(SimpleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean printfexprList_sempred(PrintfexprListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exprList_sempred(ExprListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u012f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f"+
		"\3\16\3C\13\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\7\3L\n\3\f\3\16\3O\13\3"+
		"\3\4\6\4R\n\4\r\4\16\4S\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7r\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\t\3\t\3\t\5"+
		"\t\u0091\n\t\3\t\3\t\3\t\3\t\5\t\u0097\n\t\3\t\3\t\5\t\u009b\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00a1\n\t\3\t\3\t\3\t\5\t\u00a6\n\t\3\t\3\t\5\t\u00aa\n"+
		"\t\3\t\3\t\5\t\u00ae\n\t\3\t\5\t\u00b1\n\t\5\t\u00b3\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00bc\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00c9\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00d5\n\f\f\f\16\f\u00d8\13\f\3\r\3\r\5\r\u00dc\n\r\3\r\3\r\3\16"+
		"\5\16\u00e1\n\16\3\16\3\16\3\16\3\16\5\16\u00e7\n\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f8"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u0101\n\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0110\n\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u011a\n\26\f\26\16\26\u011d\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0125\n\27\f\27\16\27\u0128\13"+
		"\27\3\30\3\30\3\30\5\30\u012d\n\30\3\30\2\6\f\26*,\31\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\2\5\3\2\25\26\3\2\27\30\3\2\33\36\2\u0143"+
		"\2\60\3\2\2\2\4:\3\2\2\2\6Q\3\2\2\2\b^\3\2\2\2\nf\3\2\2\2\fq\3\2\2\2\16"+
		"\u008b\3\2\2\2\20\u00b2\3\2\2\2\22\u00b4\3\2\2\2\24\u00c1\3\2\2\2\26\u00ce"+
		"\3\2\2\2\30\u00d9\3\2\2\2\32\u00e0\3\2\2\2\34\u00f7\3\2\2\2\36\u00f9\3"+
		"\2\2\2 \u00fc\3\2\2\2\"\u0100\3\2\2\2$\u0102\3\2\2\2&\u010f\3\2\2\2(\u0111"+
		"\3\2\2\2*\u0113\3\2\2\2,\u011e\3\2\2\2.\u012c\3\2\2\2\60\61\7\3\2\2\61"+
		"\65\7)\2\2\62\64\7-\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\5\4\3\29\3\3\2\2\2:;\7\4\2\2;<\7"+
		"\5\2\2<=\5\6\4\2=A\7\6\2\2>@\7-\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2BM\3\2\2\2CA\3\2\2\2DH\5\24\13\2EG\7-\2\2FE\3\2\2\2GJ\3\2\2\2HF"+
		"\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KD\3\2\2\2LO\3\2\2\2MK\3\2\2\2M"+
		"N\3\2\2\2N\5\3\2\2\2OM\3\2\2\2PR\5\b\5\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2T\7\3\2\2\2UV\5\n\6\2VW\7-\2\2W_\3\2\2\2X_\5\34\17\2Y_\5\32"+
		"\16\2Z_\5\20\t\2[_\5$\23\2\\_\5\22\n\2]_\7-\2\2^U\3\2\2\2^X\3\2\2\2^Y"+
		"\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\t\3\2\2\2`g\5\f\7\2"+
		"ab\7\7\2\2bc\5\n\6\2cd\7\b\2\2dg\3\2\2\2eg\5\16\b\2f`\3\2\2\2fa\3\2\2"+
		"\2fe\3\2\2\2g\13\3\2\2\2hi\b\7\1\2ir\5(\25\2jk\7\7\2\2kl\5\f\7\2lm\7\b"+
		"\2\2mr\3\2\2\2nr\5&\24\2or\5.\30\2pr\7)\2\2qh\3\2\2\2qj\3\2\2\2qn\3\2"+
		"\2\2qo\3\2\2\2qp\3\2\2\2r~\3\2\2\2st\f\n\2\2tu\t\2\2\2u}\5\f\7\13vw\f"+
		"\t\2\2wx\t\3\2\2x}\5\f\7\nyz\f\b\2\2z{\7\31\2\2{}\5\f\7\t|s\3\2\2\2|v"+
		"\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\r\3\2\2\2"+
		"\u0080~\3\2\2\2\u0081\u0082\5\f\7\2\u0082\u0083\7(\2\2\u0083\u0084\5\f"+
		"\7\2\u0084\u008c\3\2\2\2\u0085\u0086\7\7\2\2\u0086\u0087\5\f\7\2\u0087"+
		"\u0088\7(\2\2\u0088\u0089\5\f\7\2\u0089\u008a\7\b\2\2\u008a\u008c\3\2"+
		"\2\2\u008b\u0081\3\2\2\2\u008b\u0085\3\2\2\2\u008c\17\3\2\2\2\u008d\u008e"+
		"\7\t\2\2\u008e\u0090\5\n\6\2\u008f\u0091\7-\2\2\u0090\u008f\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\5\2\2\u0093\u0094\5\6"+
		"\4\2\u0094\u00a0\7\6\2\2\u0095\u0097\7-\2\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\7\n\2\2\u0099\u009b\7-"+
		"\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\7\5\2\2\u009d\u009e\5\6\4\2\u009e\u009f\7\6\2\2\u009f\u00a1\3\2"+
		"\2\2\u00a0\u0096\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00b3\3\2\2\2\u00a2"+
		"\u00a3\7\t\2\2\u00a3\u00a5\5\n\6\2\u00a4\u00a6\7-\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00b0\5\b\5\2\u00a8"+
		"\u00aa\7-\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ad\7\n\2\2\u00ac\u00ae\7-\2\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\5\b\5\2\u00b0\u00a9\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u008d\3\2\2\2\u00b2"+
		"\u00a2\3\2\2\2\u00b3\21\3\2\2\2\u00b4\u00b5\7\13\2\2\u00b5\u00b6\7)\2"+
		"\2\u00b6\u00b7\7\f\2\2\u00b7\u00b8\5\f\7\2\u00b8\u00b9\7\r\2\2\u00b9\u00bb"+
		"\5\f\7\2\u00ba\u00bc\7-\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\7\5\2\2\u00be\u00bf\5\6\4\2\u00bf\u00c0\7\6"+
		"\2\2\u00c0\23\3\2\2\2\u00c1\u00c2\7\16\2\2\u00c2\u00c3\5\"\22\2\u00c3"+
		"\u00c4\7)\2\2\u00c4\u00c5\7\7\2\2\u00c5\u00c6\5\26\f\2\u00c6\u00c8\7\b"+
		"\2\2\u00c7\u00c9\7-\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\7\5\2\2\u00cb\u00cc\5\6\4\2\u00cc\u00cd\7\6"+
		"\2\2\u00cd\25\3\2\2\2\u00ce\u00cf\b\f\1\2\u00cf\u00d0\5\30\r\2\u00d0\u00d6"+
		"\3\2\2\2\u00d1\u00d2\f\3\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d5\5\30\r\2"+
		"\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\27\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\5 \21\2\u00da"+
		"\u00dc\7\20\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3"+
		"\2\2\2\u00dd\u00de\7)\2\2\u00de\31\3\2\2\2\u00df\u00e1\7\32\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\5 "+
		"\21\2\u00e3\u00e6\7)\2\2\u00e4\u00e5\7\21\2\2\u00e5\u00e7\5\n\6\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7-"+
		"\2\2\u00e9\33\3\2\2\2\u00ea\u00eb\7)\2\2\u00eb\u00ec\7\21\2\2\u00ec\u00ed"+
		"\5\n\6\2\u00ed\u00ee\7-\2\2\u00ee\u00f8\3\2\2\2\u00ef\u00f0\5\36\20\2"+
		"\u00f0\u00f1\7-\2\2\u00f1\u00f8\3\2\2\2\u00f2\u00f3\7)\2\2\u00f3\u00f4"+
		"\7\37\2\2\u00f4\u00f5\5\n\6\2\u00f5\u00f6\7-\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00ea\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8\35\3\2\2"+
		"\2\u00f9\u00fa\7)\2\2\u00fa\u00fb\7%\2\2\u00fb\37\3\2\2\2\u00fc\u00fd"+
		"\t\4\2\2\u00fd!\3\2\2\2\u00fe\u0101\5 \21\2\u00ff\u0101\7\22\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101#\3\2\2\2\u0102\u0103\7\23\2\2"+
		"\u0103\u0104\5\n\6\2\u0104\u0105\7-\2\2\u0105%\3\2\2\2\u0106\u0107\7\24"+
		"\2\2\u0107\u0108\5*\26\2\u0108\u0109\7\b\2\2\u0109\u0110\3\2\2\2\u010a"+
		"\u010b\7)\2\2\u010b\u010c\7\7\2\2\u010c\u010d\5,\27\2\u010d\u010e\7\b"+
		"\2\2\u010e\u0110\3\2\2\2\u010f\u0106\3\2\2\2\u010f\u010a\3\2\2\2\u0110"+
		"\'\3\2\2\2\u0111\u0112\7\61\2\2\u0112)\3\2\2\2\u0113\u0114\b\26\1\2\u0114"+
		"\u0115\5\n\6\2\u0115\u011b\3\2\2\2\u0116\u0117\f\3\2\2\u0117\u0118\7\17"+
		"\2\2\u0118\u011a\5\n\6\2\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c+\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\u011e\u011f\b\27\1\2\u011f\u0120\5\n\6\2\u0120\u0126\3\2\2\2\u0121\u0122"+
		"\f\3\2\2\u0122\u0123\7\17\2\2\u0123\u0125\5\n\6\2\u0124\u0121\3\2\2\2"+
		"\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127-\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0129\u012d\7,\2\2\u012a\u012d\7+\2\2\u012b"+
		"\u012d\7$\2\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2"+
		"\2\2\u012d/\3\2\2\2\"\65AHMS^fq|~\u008b\u0090\u0096\u009a\u00a0\u00a5"+
		"\u00a9\u00ad\u00b0\u00b2\u00bb\u00c8\u00d6\u00db\u00e0\u00e6\u00f7\u0100"+
		"\u010f\u011b\u0126\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}