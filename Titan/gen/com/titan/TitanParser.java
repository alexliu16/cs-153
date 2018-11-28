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
		CHAR=27, FLOAT=28, STRING=29, BOOLVALUES=30, BOOLAND=31, BOOLOR=32, AssignmentOp=33, 
		PLUS_EQ=34, MINUS_EQ=35, MUL_EQ=36, DIV_EQ=37, EXPNUM=38, SHORTHANDASSIGNOP=39, 
		PLUSPLUS=40, MINUSMINUS=41, COMPARISON_OP=42, ID=43, WORD=44, FLOATINGNUMBER=45, 
		DIGITS=46, NEWLINE=47, WHITESPACE=48, LINECOMMENT=49, BLOCKCOMMENT=50, 
		STRINGLIT=51;
	public static final int
		RULE_className = 0, RULE_prog = 1, RULE_block = 2, RULE_stat = 3, RULE_expr = 4, 
		RULE_simpleExpression = 5, RULE_comparison = 6, RULE_boolExprs = 7, RULE_conditional = 8, 
		RULE_loop = 9, RULE_functionDeclaration = 10, RULE_args = 11, RULE_argDecl = 12, 
		RULE_declaration = 13, RULE_assignment = 14, RULE_shorthandAssignment = 15, 
		RULE_primitives = 16, RULE_funcReturnTypes = 17, RULE_retStat = 18, RULE_functionCall = 19, 
		RULE_stringExpr = 20, RULE_printfexprList = 21, RULE_exprList = 22, RULE_number = 23;
	public static final String[] ruleNames = {
		"className", "prog", "block", "stat", "expr", "simpleExpression", "comparison", 
		"boolExprs", "conditional", "loop", "functionDeclaration", "args", "argDecl", 
		"declaration", "assignment", "shorthandAssignment", "primitives", "funcReturnTypes", 
		"retStat", "functionCall", "stringExpr", "printfexprList", "exprList", 
		"number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'main'", "'{'", "'}'", "'('", "')'", "'if'", "'else'", 
		"'for'", "'from'", "'to'", "'function'", "','", "'&'", "'='", "'void'", 
		"'return'", "'printf('", "'*'", "'/'", "'+'", "'-'", "'%'", "'const'", 
		"'int'", "'bool'", "'char'", "'float'", "'string'", null, "'&&'", "'||'", 
		null, "'+='", "'-='", "'*='", "'/='", null, null, "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", 
		"MOD", "CONST", "INT", "BOOL", "CHAR", "FLOAT", "STRING", "BOOLVALUES", 
		"BOOLAND", "BOOLOR", "AssignmentOp", "PLUS_EQ", "MINUS_EQ", "MUL_EQ", 
		"DIV_EQ", "EXPNUM", "SHORTHANDASSIGNOP", "PLUSPLUS", "MINUSMINUS", "COMPARISON_OP", 
		"ID", "WORD", "FLOATINGNUMBER", "DIGITS", "NEWLINE", "WHITESPACE", "LINECOMMENT", 
		"BLOCKCOMMENT", "STRINGLIT"
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
			setState(48);
			match(T__0);
			setState(49);
			match(ID);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(50);
				match(NEWLINE);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
			setState(58);
			match(T__1);
			setState(59);
			match(T__2);
			setState(60);
			block();
			setState(61);
			match(T__3);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(62);
				match(NEWLINE);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(68);
				functionDeclaration();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(69);
					match(NEWLINE);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(79);
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
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				stat();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__16) | (1L << T__17) | (1L << CONST) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLVALUES) | (1L << EXPNUM) | (1L << ID) | (1L << FLOATINGNUMBER) | (1L << DIGITS) | (1L << NEWLINE) | (1L << STRINGLIT))) != 0) );
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				expr();
				setState(86);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				retStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
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
	public static class BoolExprContext extends ExprContext {
		public BoolExprsContext boolExprs() {
			return getRuleContext(BoolExprsContext.class,0);
		}
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitBoolExpr(this);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SimpleExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				simpleExpression(0);
				}
				break;
			case 2:
				_localctx = new BoolExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				boolExprs(0);
				}
				break;
			case 3:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(T__4);
				setState(99);
				expr();
				setState(100);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105);
				stringExpr();
				}
				break;
			case 2:
				{
				_localctx = new SimpleExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(T__4);
				setState(107);
				simpleExpression(0);
				setState(108);
				match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				number();
				}
				break;
			case 5:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivOpContext(new SimpleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(115);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(116);
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
						setState(117);
						simpleExpression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubOpContext(new SimpleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(118);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(119);
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
						setState(120);
						simpleExpression(8);
						}
						break;
					case 3:
						{
						_localctx = new ModOpContext(new SimpleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(121);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(122);
						match(MOD);
						setState(123);
						simpleExpression(7);
						}
						break;
					}
					} 
				}
				setState(128);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				simpleExpression(0);
				setState(130);
				match(COMPARISON_OP);
				setState(131);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__4);
				setState(134);
				simpleExpression(0);
				setState(135);
				match(COMPARISON_OP);
				setState(136);
				simpleExpression(0);
				setState(137);
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

	public static class BoolExprsContext extends ParserRuleContext {
		public TypeSpec type = null;
		public BoolExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprs; }
	 
		public BoolExprsContext() { }
		public void copyFrom(BoolExprsContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class BoolLiteralContext extends BoolExprsContext {
		public TerminalNode BOOLVALUES() { return getToken(TitanParser.BOOLVALUES, 0); }
		public BoolLiteralContext(BoolExprsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExprContext extends BoolExprsContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ComparisonExprContext(BoolExprsContext ctx) { copyFrom(ctx); }
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
	public static class BoolIdentifierContext extends BoolExprsContext {
		public TerminalNode ID() { return getToken(TitanParser.ID, 0); }
		public BoolIdentifierContext(BoolExprsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterBoolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitBoolIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitBoolIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolParenContext extends BoolExprsContext {
		public BoolExprsContext boolExprs() {
			return getRuleContext(BoolExprsContext.class,0);
		}
		public BoolParenContext(BoolExprsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterBoolParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitBoolParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitBoolParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolOrContext extends BoolExprsContext {
		public Token op;
		public List<BoolExprsContext> boolExprs() {
			return getRuleContexts(BoolExprsContext.class);
		}
		public BoolExprsContext boolExprs(int i) {
			return getRuleContext(BoolExprsContext.class,i);
		}
		public TerminalNode BOOLOR() { return getToken(TitanParser.BOOLOR, 0); }
		public BoolOrContext(BoolExprsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterBoolOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitBoolOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitBoolOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAndContext extends BoolExprsContext {
		public Token op;
		public List<BoolExprsContext> boolExprs() {
			return getRuleContexts(BoolExprsContext.class);
		}
		public BoolExprsContext boolExprs(int i) {
			return getRuleContext(BoolExprsContext.class,i);
		}
		public TerminalNode BOOLAND() { return getToken(TitanParser.BOOLAND, 0); }
		public BoolAndContext(BoolExprsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).enterBoolAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitanListener ) ((TitanListener)listener).exitBoolAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitanVisitor ) return ((TitanVisitor<? extends T>)visitor).visitBoolAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprsContext boolExprs() throws RecognitionException {
		return boolExprs(0);
	}

	private BoolExprsContext boolExprs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprsContext _localctx = new BoolExprsContext(_ctx, _parentState);
		BoolExprsContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_boolExprs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new BoolParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(142);
				match(T__4);
				setState(143);
				boolExprs(0);
				setState(144);
				match(T__5);
				}
				break;
			case 2:
				{
				_localctx = new BoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(BOOLVALUES);
				}
				break;
			case 3:
				{
				_localctx = new BoolIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new ComparisonExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				comparison();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BoolAndContext(new BoolExprsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExprs);
						setState(151);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(152);
						((BoolAndContext)_localctx).op = match(BOOLAND);
						setState(153);
						boolExprs(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolOrContext(new BoolExprsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExprs);
						setState(154);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(155);
						((BoolOrContext)_localctx).op = match(BOOLOR);
						setState(156);
						boolExprs(5);
						}
						break;
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public BoolExprsContext boolExprs() {
			return getRuleContext(BoolExprsContext.class,0);
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
		public BoolExprsContext boolExprs() {
			return getRuleContext(BoolExprsContext.class,0);
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
		enterRule(_localctx, 16, RULE_conditional);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new IfElseBracketsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(T__6);
				setState(163);
				boolExprs(0);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(164);
					match(NEWLINE);
					}
				}

				setState(167);
				match(T__2);
				setState(168);
				block();
				setState(169);
				match(T__3);
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(170);
						match(NEWLINE);
						}
					}

					setState(173);
					match(T__7);
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(174);
						match(NEWLINE);
						}
					}

					setState(177);
					match(T__2);
					setState(178);
					block();
					setState(179);
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
				setState(183);
				match(T__6);
				setState(184);
				boolExprs(0);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(185);
					match(NEWLINE);
					}
					break;
				}
				setState(188);
				stat();
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(189);
						match(NEWLINE);
						}
					}

					setState(192);
					match(T__7);
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(193);
						match(NEWLINE);
						}
						break;
					}
					setState(196);
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
		enterRule(_localctx, 18, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__8);
			setState(202);
			match(ID);
			setState(203);
			match(T__9);
			setState(204);
			simpleExpression(0);
			setState(205);
			match(T__10);
			setState(206);
			simpleExpression(0);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(207);
				match(NEWLINE);
				}
			}

			setState(210);
			match(T__2);
			setState(211);
			block();
			setState(212);
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
		enterRule(_localctx, 20, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__11);
			setState(215);
			funcReturnTypes();
			setState(216);
			match(ID);
			setState(217);
			match(T__4);
			setState(218);
			args(0);
			setState(219);
			match(T__5);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(220);
				match(NEWLINE);
				}
			}

			setState(223);
			match(T__2);
			setState(224);
			block();
			setState(225);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(228);
			argDecl();
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(230);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(231);
					match(T__12);
					setState(232);
					argDecl();
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 24, RULE_argDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			primitives();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(239);
				((ArgDeclContext)_localctx).ref = match(T__13);
				}
			}

			setState(242);
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
		enterRule(_localctx, 26, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(244);
				match(CONST);
				}
			}

			setState(247);
			primitives();
			setState(248);
			match(ID);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(249);
				match(T__14);
				setState(250);
				expr();
				}
			}

			setState(253);
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
		enterRule(_localctx, 28, RULE_assignment);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(ID);
				setState(256);
				match(T__14);
				setState(257);
				expr();
				setState(258);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				shorthandAssignment();
				setState(261);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(ID);
				setState(264);
				match(AssignmentOp);
				setState(265);
				expr();
				setState(266);
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
		enterRule(_localctx, 30, RULE_shorthandAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(271);
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
		public TerminalNode STRING() { return getToken(TitanParser.STRING, 0); }
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
		enterRule(_localctx, 32, RULE_primitives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_funcReturnTypes);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				primitives();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
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
		enterRule(_localctx, 36, RULE_retStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__16);
			setState(280);
			expr();
			setState(281);
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
		enterRule(_localctx, 38, RULE_functionCall);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				_localctx = new PrintfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__17);
				setState(284);
				printfexprList(0);
				setState(285);
				match(T__5);
				}
				break;
			case ID:
				_localctx = new RegularFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(ID);
				setState(288);
				match(T__4);
				setState(289);
				exprList(0);
				setState(290);
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
		enterRule(_localctx, 40, RULE_stringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_printfexprList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(297);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrintfexprListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_printfexprList);
					setState(299);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(300);
					match(T__12);
					setState(301);
					expr();
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_exprList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprList);
					setState(310);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(311);
					match(T__12);
					setState(312);
					expr();
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 46, RULE_number);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(DIGITS);
				}
				break;
			case FLOATINGNUMBER:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(FLOATINGNUMBER);
				}
				break;
			case EXPNUM:
				_localctx = new ExponentialContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
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
		case 7:
			return boolExprs_sempred((BoolExprsContext)_localctx, predIndex);
		case 11:
			return args_sempred((ArgsContext)_localctx, predIndex);
		case 21:
			return printfexprList_sempred((PrintfexprListContext)_localctx, predIndex);
		case 22:
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
	private boolean boolExprs_sempred(BoolExprsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean printfexprList_sempred(PrintfexprListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exprList_sempred(ExprListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0146\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3"+
		"B\n\3\f\3\16\3E\13\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\7\3N\n\3\f\3\16\3"+
		"Q\13\3\3\4\6\4T\n\4\r\4\16\4U\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"a\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7t\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7"+
		"\u0082\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u00a0\n\t\f\t\16\t\u00a3\13\t\3\n\3\n\3\n\5\n\u00a8\n\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00ae\n\n\3\n\3\n\5\n\u00b2\n\n\3\n\3\n\3\n\3\n\5\n\u00b8\n\n\3"+
		"\n\3\n\3\n\5\n\u00bd\n\n\3\n\3\n\5\n\u00c1\n\n\3\n\3\n\5\n\u00c5\n\n\3"+
		"\n\5\n\u00c8\n\n\5\n\u00ca\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00d3\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e0"+
		"\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ec\n\r\f\r\16\r\u00ef"+
		"\13\r\3\16\3\16\5\16\u00f3\n\16\3\16\3\16\3\17\5\17\u00f8\n\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00fe\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u010f\n\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\5\23\u0118\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0127\n\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u0131\n\27\f\27\16\27\u0134\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u013c\n\30\f\30\16\30\u013f\13\30\3\31\3\31\3\31\5\31"+
		"\u0144\n\31\3\31\2\7\f\20\30,.\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\5\3\2\25\26\3\2\27\30\4\2\33\34\36\37\2\u015e\2\62\3"+
		"\2\2\2\4<\3\2\2\2\6S\3\2\2\2\b`\3\2\2\2\nh\3\2\2\2\fs\3\2\2\2\16\u008d"+
		"\3\2\2\2\20\u0097\3\2\2\2\22\u00c9\3\2\2\2\24\u00cb\3\2\2\2\26\u00d8\3"+
		"\2\2\2\30\u00e5\3\2\2\2\32\u00f0\3\2\2\2\34\u00f7\3\2\2\2\36\u010e\3\2"+
		"\2\2 \u0110\3\2\2\2\"\u0113\3\2\2\2$\u0117\3\2\2\2&\u0119\3\2\2\2(\u0126"+
		"\3\2\2\2*\u0128\3\2\2\2,\u012a\3\2\2\2.\u0135\3\2\2\2\60\u0143\3\2\2\2"+
		"\62\63\7\3\2\2\63\67\7-\2\2\64\66\7\61\2\2\65\64\3\2\2\2\669\3\2\2\2\67"+
		"\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\5\4\3\2;\3\3\2\2\2<=\7"+
		"\4\2\2=>\7\5\2\2>?\5\6\4\2?C\7\6\2\2@B\7\61\2\2A@\3\2\2\2BE\3\2\2\2CA"+
		"\3\2\2\2CD\3\2\2\2DO\3\2\2\2EC\3\2\2\2FJ\5\26\f\2GI\7\61\2\2HG\3\2\2\2"+
		"IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MF\3\2\2\2NQ\3\2\2\2"+
		"OM\3\2\2\2OP\3\2\2\2P\5\3\2\2\2QO\3\2\2\2RT\5\b\5\2SR\3\2\2\2TU\3\2\2"+
		"\2US\3\2\2\2UV\3\2\2\2V\7\3\2\2\2WX\5\n\6\2XY\7\61\2\2Ya\3\2\2\2Za\5\36"+
		"\20\2[a\5\34\17\2\\a\5\22\n\2]a\5&\24\2^a\5\24\13\2_a\7\61\2\2`W\3\2\2"+
		"\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\t\3\2"+
		"\2\2bi\5\f\7\2ci\5\20\t\2de\7\7\2\2ef\5\n\6\2fg\7\b\2\2gi\3\2\2\2hb\3"+
		"\2\2\2hc\3\2\2\2hd\3\2\2\2i\13\3\2\2\2jk\b\7\1\2kt\5*\26\2lm\7\7\2\2m"+
		"n\5\f\7\2no\7\b\2\2ot\3\2\2\2pt\5(\25\2qt\5\60\31\2rt\7-\2\2sj\3\2\2\2"+
		"sl\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\u0080\3\2\2\2uv\f\n\2\2vw\t"+
		"\2\2\2w\177\5\f\7\13xy\f\t\2\2yz\t\3\2\2z\177\5\f\7\n{|\f\b\2\2|}\7\31"+
		"\2\2}\177\5\f\7\t~u\3\2\2\2~x\3\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\r\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\5\f\7\2\u0084\u0085\7,\2\2\u0085\u0086\5\f\7\2\u0086\u008e\3\2"+
		"\2\2\u0087\u0088\7\7\2\2\u0088\u0089\5\f\7\2\u0089\u008a\7,\2\2\u008a"+
		"\u008b\5\f\7\2\u008b\u008c\7\b\2\2\u008c\u008e\3\2\2\2\u008d\u0083\3\2"+
		"\2\2\u008d\u0087\3\2\2\2\u008e\17\3\2\2\2\u008f\u0090\b\t\1\2\u0090\u0091"+
		"\7\7\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\b\2\2\u0093\u0098\3\2\2\2"+
		"\u0094\u0098\7 \2\2\u0095\u0098\7-\2\2\u0096\u0098\5\16\b\2\u0097\u008f"+
		"\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u00a1\3\2\2\2\u0099\u009a\f\7\2\2\u009a\u009b\7!\2\2\u009b\u00a0\5\20"+
		"\t\b\u009c\u009d\f\6\2\2\u009d\u009e\7\"\2\2\u009e\u00a0\5\20\t\7\u009f"+
		"\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\21\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5"+
		"\7\t\2\2\u00a5\u00a7\5\20\t\2\u00a6\u00a8\7\61\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab"+
		"\5\6\4\2\u00ab\u00b7\7\6\2\2\u00ac\u00ae\7\61\2\2\u00ad\u00ac\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\7\n\2\2\u00b0\u00b2"+
		"\7\61\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2"+
		"\u00b3\u00b4\7\5\2\2\u00b4\u00b5\5\6\4\2\u00b5\u00b6\7\6\2\2\u00b6\u00b8"+
		"\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ca\3\2\2\2\u00b9"+
		"\u00ba\7\t\2\2\u00ba\u00bc\5\20\t\2\u00bb\u00bd\7\61\2\2\u00bc\u00bb\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c7\5\b\5\2\u00bf"+
		"\u00c1\7\61\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c4\7\n\2\2\u00c3\u00c5\7\61\2\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\5\b\5\2\u00c7\u00c0\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00a4\3\2\2\2\u00c9"+
		"\u00b9\3\2\2\2\u00ca\23\3\2\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00cd\7-\2"+
		"\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\5\f\7\2\u00cf\u00d0\7\r\2\2\u00d0\u00d2"+
		"\5\f\7\2\u00d1\u00d3\7\61\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\5\2\2\u00d5\u00d6\5\6\4\2\u00d6\u00d7"+
		"\7\6\2\2\u00d7\25\3\2\2\2\u00d8\u00d9\7\16\2\2\u00d9\u00da\5$\23\2\u00da"+
		"\u00db\7-\2\2\u00db\u00dc\7\7\2\2\u00dc\u00dd\5\30\r\2\u00dd\u00df\7\b"+
		"\2\2\u00de\u00e0\7\61\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\7\5\2\2\u00e2\u00e3\5\6\4\2\u00e3\u00e4\7\6"+
		"\2\2\u00e4\27\3\2\2\2\u00e5\u00e6\b\r\1\2\u00e6\u00e7\5\32\16\2\u00e7"+
		"\u00ed\3\2\2\2\u00e8\u00e9\f\3\2\2\u00e9\u00ea\7\17\2\2\u00ea\u00ec\5"+
		"\32\16\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\31\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\5\"\22"+
		"\2\u00f1\u00f3\7\20\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5\33\3\2\2\2\u00f6\u00f8\7\32\2"+
		"\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa"+
		"\5\"\22\2\u00fa\u00fd\7-\2\2\u00fb\u00fc\7\21\2\2\u00fc\u00fe\5\n\6\2"+
		"\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100"+
		"\7\61\2\2\u0100\35\3\2\2\2\u0101\u0102\7-\2\2\u0102\u0103\7\21\2\2\u0103"+
		"\u0104\5\n\6\2\u0104\u0105\7\61\2\2\u0105\u010f\3\2\2\2\u0106\u0107\5"+
		" \21\2\u0107\u0108\7\61\2\2\u0108\u010f\3\2\2\2\u0109\u010a\7-\2\2\u010a"+
		"\u010b\7#\2\2\u010b\u010c\5\n\6\2\u010c\u010d\7\61\2\2\u010d\u010f\3\2"+
		"\2\2\u010e\u0101\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u0109\3\2\2\2\u010f"+
		"\37\3\2\2\2\u0110\u0111\7-\2\2\u0111\u0112\7)\2\2\u0112!\3\2\2\2\u0113"+
		"\u0114\t\4\2\2\u0114#\3\2\2\2\u0115\u0118\5\"\22\2\u0116\u0118\7\22\2"+
		"\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118%\3\2\2\2\u0119\u011a"+
		"\7\23\2\2\u011a\u011b\5\n\6\2\u011b\u011c\7\61\2\2\u011c\'\3\2\2\2\u011d"+
		"\u011e\7\24\2\2\u011e\u011f\5,\27\2\u011f\u0120\7\b\2\2\u0120\u0127\3"+
		"\2\2\2\u0121\u0122\7-\2\2\u0122\u0123\7\7\2\2\u0123\u0124\5.\30\2\u0124"+
		"\u0125\7\b\2\2\u0125\u0127\3\2\2\2\u0126\u011d\3\2\2\2\u0126\u0121\3\2"+
		"\2\2\u0127)\3\2\2\2\u0128\u0129\7\65\2\2\u0129+\3\2\2\2\u012a\u012b\b"+
		"\27\1\2\u012b\u012c\5\n\6\2\u012c\u0132\3\2\2\2\u012d\u012e\f\3\2\2\u012e"+
		"\u012f\7\17\2\2\u012f\u0131\5\n\6\2\u0130\u012d\3\2\2\2\u0131\u0134\3"+
		"\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133-\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0136\b\30\1\2\u0136\u0137\5\n\6\2\u0137\u013d\3\2\2\2"+
		"\u0138\u0139\f\3\2\2\u0139\u013a\7\17\2\2\u013a\u013c\5\n\6\2\u013b\u0138"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"/\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0144\7\60\2\2\u0141\u0144\7/\2\2"+
		"\u0142\u0144\7(\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142"+
		"\3\2\2\2\u0144\61\3\2\2\2%\67CJOU`hs~\u0080\u008d\u0097\u009f\u00a1\u00a7"+
		"\u00ad\u00b1\u00b7\u00bc\u00c0\u00c4\u00c7\u00c9\u00d2\u00df\u00ed\u00f2"+
		"\u00f7\u00fd\u010e\u0117\u0126\u0132\u013d\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}