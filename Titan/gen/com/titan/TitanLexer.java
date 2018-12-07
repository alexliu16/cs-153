// Generated from /Users/thomaspedersen/CS153/TeamProject/cs-153/Titan/src/com/titan/Titan.g4 by ANTLR 4.7
package com.titan;

    import com.titan.intermediate.*;
    import com.titan.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TitanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, MUL=20, DIV=21, ADD=22, SUB=23, MOD=24, CONST=25, 
		INT=26, BOOL=27, CHAR=28, FLOAT=29, STRING=30, BOOLVALUES=31, BOOLAND=32, 
		BOOLOR=33, AssignmentOp=34, PLUS_EQ=35, MINUS_EQ=36, MUL_EQ=37, DIV_EQ=38, 
		EXPNUM=39, SHORTHANDASSIGNOP=40, PLUSPLUS=41, MINUSMINUS=42, COMPARISON_OP=43, 
		ID=44, WORD=45, FLOATINGNUMBER=46, DIGITS=47, NEWLINE=48, WHITESPACE=49, 
		LINECOMMENT=50, BLOCKCOMMENT=51, STRINGLIT=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "MUL", "DIV", "ADD", "SUB", "MOD", "CONST", "INT", "BOOL", 
		"CHAR", "FLOAT", "STRING", "BOOLVALUES", "BOOLAND", "BOOLOR", "AssignmentOp", 
		"PLUS_EQ", "MINUS_EQ", "MUL_EQ", "DIV_EQ", "EXPNUM", "SHORTHANDASSIGNOP", 
		"PLUSPLUS", "MINUSMINUS", "COMPARISON_OP", "ID", "WORD", "FLOATINGNUMBER", 
		"DIGITS", "NEWLINE", "WHITESPACE", "LINECOMMENT", "BLOCKCOMMENT", "STRINGLIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'main'", "'{'", "'}'", "'('", "')'", "'if'", "'else'", 
		"'for'", "'from'", "'to'", "'function'", "'()'", "','", "'&'", "'='", 
		"'void'", "'return'", "'printf('", "'*'", "'/'", "'+'", "'-'", "'%'", 
		"'const'", "'int'", "'bool'", "'char'", "'float'", "'string'", null, "'&&'", 
		"'||'", null, "'+='", "'-='", "'*='", "'/='", null, null, "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", 
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


	public TitanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Titan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u016f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00ef\n \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3#\5#\u00fb\n#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\5(\u010b\n(\3(\3(\3(\3)\3)\5)\u0112\n)\3*\3*\3*\3+\3+\3+"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0124\n,\3-\6-\u0127\n-\r-\16-\u0128"+
		"\3-\3-\7-\u012d\n-\f-\16-\u0130\13-\3.\3.\3/\5/\u0135\n/\3/\3/\3/\3/\3"+
		"/\5/\u013c\n/\3\60\6\60\u013f\n\60\r\60\16\60\u0140\3\61\5\61\u0144\n"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0150\n\63"+
		"\f\63\16\63\u0153\13\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u015b\n\64"+
		"\f\64\16\64\u015e\13\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7"+
		"\65\u0169\n\65\f\65\16\65\u016c\13\65\3\65\3\65\3\u015c\2\66\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\t\4\2GGgg\5"+
		"\2C\\aac|\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\n\2$$))^^ddhhppttvv\6\2"+
		"\f\f\17\17$$^^\2\u0184\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\3k\3\2\2\2\5s\3\2\2\2\7x\3\2\2\2\tz\3\2\2\2\13|\3\2\2\2\r~\3\2\2\2"+
		"\17\u0080\3\2\2\2\21\u0083\3\2\2\2\23\u0088\3\2\2\2\25\u008c\3\2\2\2\27"+
		"\u0091\3\2\2\2\31\u0094\3\2\2\2\33\u009d\3\2\2\2\35\u00a0\3\2\2\2\37\u00a2"+
		"\3\2\2\2!\u00a4\3\2\2\2#\u00a6\3\2\2\2%\u00ab\3\2\2\2\'\u00b2\3\2\2\2"+
		")\u00ba\3\2\2\2+\u00bc\3\2\2\2-\u00be\3\2\2\2/\u00c0\3\2\2\2\61\u00c2"+
		"\3\2\2\2\63\u00c4\3\2\2\2\65\u00ca\3\2\2\2\67\u00ce\3\2\2\29\u00d3\3\2"+
		"\2\2;\u00d8\3\2\2\2=\u00de\3\2\2\2?\u00ee\3\2\2\2A\u00f0\3\2\2\2C\u00f3"+
		"\3\2\2\2E\u00fa\3\2\2\2G\u00fc\3\2\2\2I\u00ff\3\2\2\2K\u0102\3\2\2\2M"+
		"\u0105\3\2\2\2O\u010a\3\2\2\2Q\u0111\3\2\2\2S\u0113\3\2\2\2U\u0116\3\2"+
		"\2\2W\u0123\3\2\2\2Y\u0126\3\2\2\2[\u0131\3\2\2\2]\u013b\3\2\2\2_\u013e"+
		"\3\2\2\2a\u0143\3\2\2\2c\u0147\3\2\2\2e\u014b\3\2\2\2g\u0156\3\2\2\2i"+
		"\u0164\3\2\2\2kl\7r\2\2lm\7t\2\2mn\7q\2\2no\7i\2\2op\7t\2\2pq\7c\2\2q"+
		"r\7o\2\2r\4\3\2\2\2st\7o\2\2tu\7c\2\2uv\7k\2\2vw\7p\2\2w\6\3\2\2\2xy\7"+
		"}\2\2y\b\3\2\2\2z{\7\177\2\2{\n\3\2\2\2|}\7*\2\2}\f\3\2\2\2~\177\7+\2"+
		"\2\177\16\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7h\2\2\u0082\20\3\2\2"+
		"\2\u0083\u0084\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087"+
		"\7g\2\2\u0087\22\3\2\2\2\u0088\u0089\7h\2\2\u0089\u008a\7q\2\2\u008a\u008b"+
		"\7t\2\2\u008b\24\3\2\2\2\u008c\u008d\7h\2\2\u008d\u008e\7t\2\2\u008e\u008f"+
		"\7q\2\2\u008f\u0090\7o\2\2\u0090\26\3\2\2\2\u0091\u0092\7v\2\2\u0092\u0093"+
		"\7q\2\2\u0093\30\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7w\2\2\u0096\u0097"+
		"\7p\2\2\u0097\u0098\7e\2\2\u0098\u0099\7v\2\2\u0099\u009a\7k\2\2\u009a"+
		"\u009b\7q\2\2\u009b\u009c\7p\2\2\u009c\32\3\2\2\2\u009d\u009e\7*\2\2\u009e"+
		"\u009f\7+\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7.\2\2\u00a1\36\3\2\2\2\u00a2"+
		"\u00a3\7(\2\2\u00a3 \3\2\2\2\u00a4\u00a5\7?\2\2\u00a5\"\3\2\2\2\u00a6"+
		"\u00a7\7x\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7f\2\2"+
		"\u00aa$\3\2\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7v\2"+
		"\2\u00ae\u00af\7w\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7p\2\2\u00b1&\3\2"+
		"\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6"+
		"\7p\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7*\2\2\u00b9"+
		"(\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7\61\2\2\u00bd"+
		",\3\2\2\2\u00be\u00bf\7-\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1\60"+
		"\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7v\2\2"+
		"\u00c9\64\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7"+
		"v\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7d\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1"+
		"\7q\2\2\u00d1\u00d2\7n\2\2\u00d28\3\2\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5"+
		"\7j\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7t\2\2\u00d7:\3\2\2\2\u00d8\u00d9"+
		"\7h\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd<\3\2\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7v\2\2\u00e0"+
		"\u00e1\7t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7i\2\2"+
		"\u00e4>\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7w\2"+
		"\2\u00e8\u00ef\7g\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec"+
		"\7n\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ef\7g\2\2\u00ee\u00e5\3\2\2\2\u00ee"+
		"\u00e9\3\2\2\2\u00ef@\3\2\2\2\u00f0\u00f1\7(\2\2\u00f1\u00f2\7(\2\2\u00f2"+
		"B\3\2\2\2\u00f3\u00f4\7~\2\2\u00f4\u00f5\7~\2\2\u00f5D\3\2\2\2\u00f6\u00fb"+
		"\5G$\2\u00f7\u00fb\5I%\2\u00f8\u00fb\5K&\2\u00f9\u00fb\5M\'\2\u00fa\u00f6"+
		"\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"F\3\2\2\2\u00fc\u00fd\7-\2\2\u00fd\u00fe\7?\2\2\u00feH\3\2\2\2\u00ff\u0100"+
		"\7/\2\2\u0100\u0101\7?\2\2\u0101J\3\2\2\2\u0102\u0103\7,\2\2\u0103\u0104"+
		"\7?\2\2\u0104L\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u0107\7?\2\2\u0107N"+
		"\3\2\2\2\u0108\u010b\5]/\2\u0109\u010b\5_\60\2\u010a\u0108\3\2\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\t\2\2\2\u010d\u010e\5_"+
		"\60\2\u010eP\3\2\2\2\u010f\u0112\5S*\2\u0110\u0112\5U+\2\u0111\u010f\3"+
		"\2\2\2\u0111\u0110\3\2\2\2\u0112R\3\2\2\2\u0113\u0114\7-\2\2\u0114\u0115"+
		"\7-\2\2\u0115T\3\2\2\2\u0116\u0117\7/\2\2\u0117\u0118\7/\2\2\u0118V\3"+
		"\2\2\2\u0119\u0124\7>\2\2\u011a\u011b\7>\2\2\u011b\u0124\7?\2\2\u011c"+
		"\u0124\7@\2\2\u011d\u011e\7@\2\2\u011e\u0124\7?\2\2\u011f\u0120\7?\2\2"+
		"\u0120\u0124\7?\2\2\u0121\u0122\7#\2\2\u0122\u0124\7?\2\2\u0123\u0119"+
		"\3\2\2\2\u0123\u011a\3\2\2\2\u0123\u011c\3\2\2\2\u0123\u011d\3\2\2\2\u0123"+
		"\u011f\3\2\2\2\u0123\u0121\3\2\2\2\u0124X\3\2\2\2\u0125\u0127\5[.\2\u0126"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012e\3\2\2\2\u012a\u012d\5_\60\2\u012b\u012d\5[.\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012fZ\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\t\3\2\2"+
		"\u0132\\\3\2\2\2\u0133\u0135\5_\60\2\u0134\u0133\3\2\2\2\u0134\u0135\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7\60\2\2\u0137\u013c\5_\60\2\u0138"+
		"\u0139\5_\60\2\u0139\u013a\7\60\2\2\u013a\u013c\3\2\2\2\u013b\u0134\3"+
		"\2\2\2\u013b\u0138\3\2\2\2\u013c^\3\2\2\2\u013d\u013f\t\4\2\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"`\3\2\2\2\u0142\u0144\7\17\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0144\u0145\3\2\2\2\u0145\u0146\7\f\2\2\u0146b\3\2\2\2\u0147\u0148\t"+
		"\5\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b\62\2\2\u014ad\3\2\2\2\u014b\u014c"+
		"\7\61\2\2\u014c\u014d\7\61\2\2\u014d\u0151\3\2\2\2\u014e\u0150\n\6\2\2"+
		"\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\b\63\2\2"+
		"\u0155f\3\2\2\2\u0156\u0157\7\61\2\2\u0157\u0158\7,\2\2\u0158\u015c\3"+
		"\2\2\2\u0159\u015b\13\2\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015f\u0160\7,\2\2\u0160\u0161\7\61\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\b\64\2\2\u0163h\3\2\2\2\u0164\u016a\7$\2\2\u0165\u0166\7^\2\2\u0166"+
		"\u0169\t\7\2\2\u0167\u0169\n\b\2\2\u0168\u0165\3\2\2\2\u0168\u0167\3\2"+
		"\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7$\2\2\u016ej\3\2\2\2\23"+
		"\2\u00ee\u00fa\u010a\u0111\u0123\u0128\u012c\u012e\u0134\u013b\u0140\u0143"+
		"\u0151\u015c\u0168\u016a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}