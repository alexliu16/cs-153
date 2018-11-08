// Generated from /Users/thomaspedersen/CS153/TeamProject/cs-153/Titan/src/com/titan/Titan.g4 by ANTLR 4.7
package com.titan;
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
		WHITESPACE=44, LINECOMMENT=45, BLOCKCOMMENT=46;
	public static final int
		RULE_className = 0, RULE_prog = 1, RULE_block = 2, RULE_stat = 3, RULE_expr = 4, 
		RULE_simpleExpression = 5, RULE_comparison = 6, RULE_conditional = 7, 
		RULE_loop = 8, RULE_functionDeclaration = 9, RULE_args = 10, RULE_argDecl = 11, 
		RULE_declaration = 12, RULE_assignment = 13, RULE_shorthandAssignment = 14, 
		RULE_primitives = 15, RULE_funcReturnTypes = 16, RULE_retStat = 17, RULE_functionCall = 18, 
		RULE_exprList = 19, RULE_number = 20;
	public static final String[] ruleNames = {
		"className", "prog", "block", "stat", "expr", "simpleExpression", "comparison", 
		"conditional", "loop", "functionDeclaration", "args", "argDecl", "declaration", 
		"assignment", "shorthandAssignment", "primitives", "funcReturnTypes", 
		"retStat", "functionCall", "exprList", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'main'", "'{'", "'}'", "'('", "')'", "'print'", "'if'", 
		"'else'", "'for'", "'from'", "'to'", "'function'", "','", "'&'", "'='", 
		"'void'", "'return'", "'*'", "'/'", "'+'", "'-'", "'%'", "'const'", "'int'", 
		"'bool'", "'char'", "'float'", null, "'+='", "'-='", "'*='", "'/='", null, 
		null, "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", 
		"MOD", "CONST", "INT", "BOOL", "CHAR", "FLOAT", "AssignmentOp", "PLUS_EQ", 
		"MINUS_EQ", "MUL_EQ", "DIV_EQ", "EXPNUM", "SHORTHANDASSIGNOP", "PLUSPLUS", 
		"MINUSMINUS", "COMPARISON_OP", "ID", "WORD", "FLOATINGNUMBER", "DIGITS", 
		"NEWLINE", "WHITESPACE", "LINECOMMENT", "BLOCKCOMMENT"
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
			setState(42);
			match(T__0);
			setState(43);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(44);
				match(NEWLINE);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
			setState(52);
			match(T__1);
			setState(53);
			match(T__2);
			setState(54);
			block();
			setState(55);
			match(T__3);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(56);
				match(NEWLINE);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(62);
				functionDeclaration();
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(63);
					match(NEWLINE);
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(73);
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
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				stat();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__17) | (1L << CONST) | (1L << INT) | (1L << BOOL) | (1L << CHAR) | (1L << FLOAT) | (1L << EXPNUM) | (1L << ID) | (1L << FLOATINGNUMBER) | (1L << DIGITS) | (1L << NEWLINE))) != 0) );
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				expr();
				setState(80);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				retStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
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
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(T__4);
				setState(92);
				expr();
				setState(93);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
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
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	 
		public SimpleExpressionContext() { }
		public void copyFrom(SimpleExpressionContext ctx) {
			super.copyFrom(ctx);
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
	public static class PrintContext extends SimpleExpressionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitPrint(this);
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new PrintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(99);
				match(T__6);
				setState(100);
				expr();
				}
				break;
			case 2:
				{
				_localctx = new SimpleExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(T__4);
				setState(102);
				simpleExpression(0);
				setState(103);
				match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				number();
				}
				break;
			case 5:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivOpContext(new SimpleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(110);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(111);
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
						setState(112);
						simpleExpression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubOpContext(new SimpleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(113);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(114);
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
						setState(115);
						simpleExpression(8);
						}
						break;
					case 3:
						{
						_localctx = new ModOpContext(new SimpleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(116);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(117);
						match(MOD);
						setState(118);
						simpleExpression(7);
						}
						break;
					}
					} 
				}
				setState(123);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				simpleExpression(0);
				setState(125);
				match(COMPARISON_OP);
				setState(126);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__4);
				setState(129);
				simpleExpression(0);
				setState(130);
				match(COMPARISON_OP);
				setState(131);
				simpleExpression(0);
				setState(132);
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
	public static class ElseNoBracketsContext extends ConditionalContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TitanParser.NEWLINE, 0); }
		public ElseNoBracketsContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterElseNoBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitElseNoBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitElseNoBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfNoBracketsContext extends ConditionalContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TitanParser.NEWLINE, 0); }
		public IfNoBracketsContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterIfNoBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitIfNoBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitIfNoBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfBracketsContext extends ConditionalContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TitanParser.NEWLINE, 0); }
		public IfBracketsContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterIfBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitIfBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitIfBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseBracketsContext extends ConditionalContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TitanParser.NEWLINE, 0); }
		public ElseBracketsContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterElseBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitElseBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitElseBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditional);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IfBracketsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__7);
				setState(137);
				expr();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(138);
					match(NEWLINE);
					}
				}

				setState(141);
				match(T__2);
				setState(142);
				block();
				setState(143);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new IfNoBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__7);
				setState(146);
				expr();
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(147);
					match(NEWLINE);
					}
					break;
				}
				setState(150);
				stat();
				}
				break;
			case 3:
				_localctx = new ElseBracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(T__8);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(153);
					match(NEWLINE);
					}
				}

				setState(156);
				match(T__2);
				setState(157);
				block();
				setState(158);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new ElseNoBracketsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(T__8);
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(161);
					match(NEWLINE);
					}
					break;
				}
				setState(164);
				stat();
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
			setState(167);
			match(T__9);
			setState(168);
			match(ID);
			setState(169);
			match(T__10);
			setState(170);
			simpleExpression(0);
			setState(171);
			match(T__11);
			setState(172);
			simpleExpression(0);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(173);
				match(NEWLINE);
				}
			}

			setState(176);
			match(T__2);
			setState(177);
			block();
			setState(178);
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
			setState(180);
			match(T__12);
			setState(181);
			funcReturnTypes();
			setState(182);
			match(ID);
			setState(183);
			match(T__4);
			setState(184);
			args(0);
			setState(185);
			match(T__5);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(186);
				match(NEWLINE);
				}
			}

			setState(189);
			match(T__2);
			setState(190);
			block();
			setState(191);
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
			setState(194);
			argDecl();
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(196);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(197);
					match(T__13);
					setState(198);
					argDecl();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(204);
			primitives();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(205);
				((ArgDeclContext)_localctx).ref = match(T__14);
				}
			}

			setState(208);
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
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(210);
				match(CONST);
				}
			}

			setState(213);
			primitives();
			setState(214);
			match(ID);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(215);
				match(T__15);
				setState(216);
				expr();
				}
			}

			setState(219);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(ID);
				setState(222);
				match(T__15);
				setState(223);
				expr();
				setState(224);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				shorthandAssignment();
				setState(227);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(ID);
				setState(230);
				match(AssignmentOp);
				setState(231);
				expr();
				setState(232);
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
			setState(236);
			match(ID);
			setState(237);
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
			setState(239);
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
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case CHAR:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				primitives();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(T__16);
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
			setState(245);
			match(T__17);
			setState(246);
			expr();
			setState(247);
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
		public TerminalNode ID() { return getToken(TitanParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
			setState(250);
			match(T__4);
			setState(251);
			exprList(0);
			setState(252);
			match(T__5);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exprList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(255);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprList);
					setState(257);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(258);
					match(T__13);
					setState(259);
					expr();
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
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
		enterRule(_localctx, 40, RULE_number);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(DIGITS);
				}
				break;
			case FLOATINGNUMBER:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(FLOATINGNUMBER);
				}
				break;
			case EXPNUM:
				_localctx = new ExponentialContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
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
		case 19:
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
	private boolean exprList_sempred(ExprListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0111\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3"+
		"\7\3C\n\3\f\3\16\3F\13\3\7\3H\n\3\f\3\16\3K\13\3\3\4\6\4N\n\4\r\4\16\4"+
		"O\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6c\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u0089\n\b\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0097\n\t\3\t\3\t\3\t\3\t\5\t\u009d\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00a5\n\t\3\t\5\t\u00a8\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00b1\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00be\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ca"+
		"\n\f\f\f\16\f\u00cd\13\f\3\r\3\r\5\r\u00d1\n\r\3\r\3\r\3\16\5\16\u00d6"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u00dc\n\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ed\n\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\5\22\u00f6\n\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0107\n\25\f\25\16"+
		"\25\u010a\13\25\3\26\3\26\3\26\5\26\u010f\n\26\3\26\2\5\f\26(\27\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\25\26\3\2\27\30\3\2\33"+
		"\36\2\u0123\2,\3\2\2\2\4\66\3\2\2\2\6M\3\2\2\2\bZ\3\2\2\2\nb\3\2\2\2\f"+
		"n\3\2\2\2\16\u0088\3\2\2\2\20\u00a7\3\2\2\2\22\u00a9\3\2\2\2\24\u00b6"+
		"\3\2\2\2\26\u00c3\3\2\2\2\30\u00ce\3\2\2\2\32\u00d5\3\2\2\2\34\u00ec\3"+
		"\2\2\2\36\u00ee\3\2\2\2 \u00f1\3\2\2\2\"\u00f5\3\2\2\2$\u00f7\3\2\2\2"+
		"&\u00fb\3\2\2\2(\u0100\3\2\2\2*\u010e\3\2\2\2,-\7\3\2\2-\61\7)\2\2.\60"+
		"\7-\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2"+
		"\2\63\61\3\2\2\2\64\65\5\4\3\2\65\3\3\2\2\2\66\67\7\4\2\2\678\7\5\2\2"+
		"89\5\6\4\29=\7\6\2\2:<\7-\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2"+
		">I\3\2\2\2?=\3\2\2\2@D\5\24\13\2AC\7-\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2G@\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2"+
		"\2J\5\3\2\2\2KI\3\2\2\2LN\5\b\5\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2"+
		"\2\2P\7\3\2\2\2QR\5\n\6\2RS\7-\2\2S[\3\2\2\2T[\5\34\17\2U[\5\32\16\2V"+
		"[\5\20\t\2W[\5$\23\2X[\5\22\n\2Y[\7-\2\2ZQ\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2"+
		"ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\t\3\2\2\2\\c\5\f\7\2]^\7\7\2"+
		"\2^_\5\n\6\2_`\7\b\2\2`c\3\2\2\2ac\5\16\b\2b\\\3\2\2\2b]\3\2\2\2ba\3\2"+
		"\2\2c\13\3\2\2\2de\b\7\1\2ef\7\t\2\2fo\5\n\6\2gh\7\7\2\2hi\5\f\7\2ij\7"+
		"\b\2\2jo\3\2\2\2ko\5&\24\2lo\5*\26\2mo\7)\2\2nd\3\2\2\2ng\3\2\2\2nk\3"+
		"\2\2\2nl\3\2\2\2nm\3\2\2\2o{\3\2\2\2pq\f\n\2\2qr\t\2\2\2rz\5\f\7\13st"+
		"\f\t\2\2tu\t\3\2\2uz\5\f\7\nvw\f\b\2\2wx\7\31\2\2xz\5\f\7\typ\3\2\2\2"+
		"ys\3\2\2\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\r\3\2\2\2}{\3\2\2"+
		"\2~\177\5\f\7\2\177\u0080\7(\2\2\u0080\u0081\5\f\7\2\u0081\u0089\3\2\2"+
		"\2\u0082\u0083\7\7\2\2\u0083\u0084\5\f\7\2\u0084\u0085\7(\2\2\u0085\u0086"+
		"\5\f\7\2\u0086\u0087\7\b\2\2\u0087\u0089\3\2\2\2\u0088~\3\2\2\2\u0088"+
		"\u0082\3\2\2\2\u0089\17\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008d\5\n\6"+
		"\2\u008c\u008e\7-\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\7\5\2\2\u0090\u0091\5\6\4\2\u0091\u0092\7\6\2\2\u0092"+
		"\u00a8\3\2\2\2\u0093\u0094\7\n\2\2\u0094\u0096\5\n\6\2\u0095\u0097\7-"+
		"\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\5\b\5\2\u0099\u00a8\3\2\2\2\u009a\u009c\7\13\2\2\u009b\u009d\7"+
		"-\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\7\5\2\2\u009f\u00a0\5\6\4\2\u00a0\u00a1\7\6\2\2\u00a1\u00a8\3\2"+
		"\2\2\u00a2\u00a4\7\13\2\2\u00a3\u00a5\7-\2\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\5\b\5\2\u00a7\u008a\3\2"+
		"\2\2\u00a7\u0093\3\2\2\2\u00a7\u009a\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8"+
		"\21\3\2\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\7)\2\2\u00ab\u00ac\7\r\2\2"+
		"\u00ac\u00ad\5\f\7\2\u00ad\u00ae\7\16\2\2\u00ae\u00b0\5\f\7\2\u00af\u00b1"+
		"\7-\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\7\5\2\2\u00b3\u00b4\5\6\4\2\u00b4\u00b5\7\6\2\2\u00b5\23\3\2\2"+
		"\2\u00b6\u00b7\7\17\2\2\u00b7\u00b8\5\"\22\2\u00b8\u00b9\7)\2\2\u00b9"+
		"\u00ba\7\7\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bd\7\b\2\2\u00bc\u00be\7"+
		"-\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\7\5\2\2\u00c0\u00c1\5\6\4\2\u00c1\u00c2\7\6\2\2\u00c2\25\3\2\2"+
		"\2\u00c3\u00c4\b\f\1\2\u00c4\u00c5\5\30\r\2\u00c5\u00cb\3\2\2\2\u00c6"+
		"\u00c7\f\3\2\2\u00c7\u00c8\7\20\2\2\u00c8\u00ca\5\30\r\2\u00c9\u00c6\3"+
		"\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\27\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\5 \21\2\u00cf\u00d1\7\21\2"+
		"\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3"+
		"\7)\2\2\u00d3\31\3\2\2\2\u00d4\u00d6\7\32\2\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\5 \21\2\u00d8\u00db\7)"+
		"\2\2\u00d9\u00da\7\22\2\2\u00da\u00dc\5\n\6\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7-\2\2\u00de\33\3\2\2\2"+
		"\u00df\u00e0\7)\2\2\u00e0\u00e1\7\22\2\2\u00e1\u00e2\5\n\6\2\u00e2\u00e3"+
		"\7-\2\2\u00e3\u00ed\3\2\2\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\7-\2\2\u00e6"+
		"\u00ed\3\2\2\2\u00e7\u00e8\7)\2\2\u00e8\u00e9\7\37\2\2\u00e9\u00ea\5\n"+
		"\6\2\u00ea\u00eb\7-\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00df\3\2\2\2\u00ec"+
		"\u00e4\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ed\35\3\2\2\2\u00ee\u00ef\7)\2\2"+
		"\u00ef\u00f0\7%\2\2\u00f0\37\3\2\2\2\u00f1\u00f2\t\4\2\2\u00f2!\3\2\2"+
		"\2\u00f3\u00f6\5 \21\2\u00f4\u00f6\7\23\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6#\3\2\2\2\u00f7\u00f8\7\24\2\2\u00f8\u00f9\5\n\6\2"+
		"\u00f9\u00fa\7-\2\2\u00fa%\3\2\2\2\u00fb\u00fc\7)\2\2\u00fc\u00fd\7\7"+
		"\2\2\u00fd\u00fe\5(\25\2\u00fe\u00ff\7\b\2\2\u00ff\'\3\2\2\2\u0100\u0101"+
		"\b\25\1\2\u0101\u0102\5\n\6\2\u0102\u0108\3\2\2\2\u0103\u0104\f\3\2\2"+
		"\u0104\u0105\7\20\2\2\u0105\u0107\5\n\6\2\u0106\u0103\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109)\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010f\7,\2\2\u010c\u010f\7+\2\2\u010d\u010f\7$\2"+
		"\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f+"+
		"\3\2\2\2\34\61=DIOZbny{\u0088\u008d\u0096\u009c\u00a4\u00a7\u00b0\u00bd"+
		"\u00cb\u00d0\u00d5\u00db\u00ec\u00f5\u0108\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}