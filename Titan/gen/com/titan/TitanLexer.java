// Generated from /Users/thomaspedersen/CS153/TeamProject/cs-153/Titan/src/com/titan/Titan.g4 by ANTLR 4.7
package com.titan;
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, MUL=17, 
		DIV=18, ADD=19, SUB=20, MOD=21, CONST=22, INT=23, BOOL=24, CHAR=25, FLOAT=26, 
		AssignmentOp=27, PLUS_EQ=28, MINUS_EQ=29, MUL_EQ=30, DIV_EQ=31, EXPNUM=32, 
		SHORTHANDASSIGNOP=33, PLUSPLUS=34, MINUSMINUS=35, COMPARISON_OP=36, ID=37, 
		WORD=38, FLOATINGNUMBER=39, DIGITS=40, NEWLINE=41, WHITESPACE=42, LINECOMMENT=43, 
		BLOCKCOMMENT=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "MUL", "DIV", 
		"ADD", "SUB", "MOD", "CONST", "INT", "BOOL", "CHAR", "FLOAT", "AssignmentOp", 
		"PLUS_EQ", "MINUS_EQ", "MUL_EQ", "DIV_EQ", "EXPNUM", "SHORTHANDASSIGNOP", 
		"PLUSPLUS", "MINUSMINUS", "COMPARISON_OP", "ID", "WORD", "FLOATINGNUMBER", 
		"DIGITS", "NEWLINE", "WHITESPACE", "LINECOMMENT", "BLOCKCOMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'{'", "'}'", "'('", "')'", "'if'", "'else'", "'for'", 
		"'from'", "'to'", "'function'", "','", "'&'", "'='", "'void'", "'return'", 
		"'*'", "'/'", "'+'", "'-'", "'%'", "'const'", "'int'", "'bool'", "'char'", 
		"'float'", null, "'+='", "'-='", "'*='", "'/='", null, null, "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "MOD", "CONST", 
		"INT", "BOOL", "CHAR", "FLOAT", "AssignmentOp", "PLUS_EQ", "MINUS_EQ", 
		"MUL_EQ", "DIV_EQ", "EXPNUM", "SHORTHANDASSIGNOP", "PLUSPLUS", "MINUSMINUS", 
		"COMPARISON_OP", "ID", "WORD", "FLOATINGNUMBER", "DIGITS", "NEWLINE", 
		"WHITESPACE", "LINECOMMENT", "BLOCKCOMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0129\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u00c0\n\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\5!\u00d0\n!\3"+
		"!\3!\3!\3\"\3\"\5\"\u00d7\n\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u00e9\n%\3&\6&\u00ec\n&\r&\16&\u00ed\3&\3&\7&\u00f2\n&\f&\16"+
		"&\u00f5\13&\3\'\3\'\3(\5(\u00fa\n(\3(\3(\3(\3(\3(\5(\u0101\n(\3)\6)\u0104"+
		"\n)\r)\16)\u0105\3*\5*\u0109\n*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\7,\u0115"+
		"\n,\f,\16,\u0118\13,\3,\3,\3-\3-\3-\3-\7-\u0120\n-\f-\16-\u0123\13-\3"+
		"-\3-\3-\3-\3-\3\u0121\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\7\4\2GGgg"+
		"\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\2\u013b\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5`\3\2\2\2\7b\3\2\2\2\td\3\2\2\2\13f\3\2"+
		"\2\2\rh\3\2\2\2\17k\3\2\2\2\21p\3\2\2\2\23t\3\2\2\2\25y\3\2\2\2\27|\3"+
		"\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2"+
		"\2\2!\u0090\3\2\2\2#\u0097\3\2\2\2%\u0099\3\2\2\2\'\u009b\3\2\2\2)\u009d"+
		"\3\2\2\2+\u009f\3\2\2\2-\u00a1\3\2\2\2/\u00a7\3\2\2\2\61\u00ab\3\2\2\2"+
		"\63\u00b0\3\2\2\2\65\u00b5\3\2\2\2\67\u00bf\3\2\2\29\u00c1\3\2\2\2;\u00c4"+
		"\3\2\2\2=\u00c7\3\2\2\2?\u00ca\3\2\2\2A\u00cf\3\2\2\2C\u00d6\3\2\2\2E"+
		"\u00d8\3\2\2\2G\u00db\3\2\2\2I\u00e8\3\2\2\2K\u00eb\3\2\2\2M\u00f6\3\2"+
		"\2\2O\u0100\3\2\2\2Q\u0103\3\2\2\2S\u0108\3\2\2\2U\u010c\3\2\2\2W\u0110"+
		"\3\2\2\2Y\u011b\3\2\2\2[\\\7o\2\2\\]\7c\2\2]^\7k\2\2^_\7p\2\2_\4\3\2\2"+
		"\2`a\7}\2\2a\6\3\2\2\2bc\7\177\2\2c\b\3\2\2\2de\7*\2\2e\n\3\2\2\2fg\7"+
		"+\2\2g\f\3\2\2\2hi\7k\2\2ij\7h\2\2j\16\3\2\2\2kl\7g\2\2lm\7n\2\2mn\7u"+
		"\2\2no\7g\2\2o\20\3\2\2\2pq\7h\2\2qr\7q\2\2rs\7t\2\2s\22\3\2\2\2tu\7h"+
		"\2\2uv\7t\2\2vw\7q\2\2wx\7o\2\2x\24\3\2\2\2yz\7v\2\2z{\7q\2\2{\26\3\2"+
		"\2\2|}\7h\2\2}~\7w\2\2~\177\7p\2\2\177\u0080\7e\2\2\u0080\u0081\7v\2\2"+
		"\u0081\u0082\7k\2\2\u0082\u0083\7q\2\2\u0083\u0084\7p\2\2\u0084\30\3\2"+
		"\2\2\u0085\u0086\7.\2\2\u0086\32\3\2\2\2\u0087\u0088\7(\2\2\u0088\34\3"+
		"\2\2\2\u0089\u008a\7?\2\2\u008a\36\3\2\2\2\u008b\u008c\7x\2\2\u008c\u008d"+
		"\7q\2\2\u008d\u008e\7k\2\2\u008e\u008f\7f\2\2\u008f \3\2\2\2\u0090\u0091"+
		"\7t\2\2\u0091\u0092\7g\2\2\u0092\u0093\7v\2\2\u0093\u0094\7w\2\2\u0094"+
		"\u0095\7t\2\2\u0095\u0096\7p\2\2\u0096\"\3\2\2\2\u0097\u0098\7,\2\2\u0098"+
		"$\3\2\2\2\u0099\u009a\7\61\2\2\u009a&\3\2\2\2\u009b\u009c\7-\2\2\u009c"+
		"(\3\2\2\2\u009d\u009e\7/\2\2\u009e*\3\2\2\2\u009f\u00a0\7\'\2\2\u00a0"+
		",\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7p\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7v\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7n\2\2\u00af\62\3\2\2\2\u00b0"+
		"\u00b1\7e\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7t\2\2"+
		"\u00b4\64\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7"+
		"q\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7v\2\2\u00ba\66\3\2\2\2\u00bb\u00c0"+
		"\59\35\2\u00bc\u00c0\5;\36\2\u00bd\u00c0\5=\37\2\u00be\u00c0\5? \2\u00bf"+
		"\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c08\3\2\2\2\u00c1\u00c2\7-\2\2\u00c2\u00c3\7?\2\2\u00c3:\3\2\2"+
		"\2\u00c4\u00c5\7/\2\2\u00c5\u00c6\7?\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7"+
		",\2\2\u00c8\u00c9\7?\2\2\u00c9>\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc"+
		"\7?\2\2\u00cc@\3\2\2\2\u00cd\u00d0\5O(\2\u00ce\u00d0\5Q)\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2"+
		"\u00d3\5Q)\2\u00d3B\3\2\2\2\u00d4\u00d7\5E#\2\u00d5\u00d7\5G$\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7D\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9"+
		"\u00da\7-\2\2\u00daF\3\2\2\2\u00db\u00dc\7/\2\2\u00dc\u00dd\7/\2\2\u00dd"+
		"H\3\2\2\2\u00de\u00e9\7>\2\2\u00df\u00e0\7>\2\2\u00e0\u00e9\7?\2\2\u00e1"+
		"\u00e9\7@\2\2\u00e2\u00e3\7@\2\2\u00e3\u00e9\7?\2\2\u00e4\u00e5\7?\2\2"+
		"\u00e5\u00e9\7?\2\2\u00e6\u00e7\7#\2\2\u00e7\u00e9\7?\2\2\u00e8\u00de"+
		"\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8"+
		"\u00e4\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9J\3\2\2\2\u00ea\u00ec\5M\'\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f3\3\2\2\2\u00ef\u00f2\5Q)\2\u00f0\u00f2\5M\'\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4L\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\t\3\2\2"+
		"\u00f7N\3\2\2\2\u00f8\u00fa\5Q)\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\60\2\2\u00fc\u0101\5Q)\2\u00fd"+
		"\u00fe\5Q)\2\u00fe\u00ff\7\60\2\2\u00ff\u0101\3\2\2\2\u0100\u00f9\3\2"+
		"\2\2\u0100\u00fd\3\2\2\2\u0101P\3\2\2\2\u0102\u0104\t\4\2\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"R\3\2\2\2\u0107\u0109\7\17\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2"+
		"\u0109\u010a\3\2\2\2\u010a\u010b\7\f\2\2\u010bT\3\2\2\2\u010c\u010d\t"+
		"\5\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b+\2\2\u010fV\3\2\2\2\u0110\u0111"+
		"\7\61\2\2\u0111\u0112\7\61\2\2\u0112\u0116\3\2\2\2\u0113\u0115\n\6\2\2"+
		"\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\b,\2\2\u011a"+
		"X\3\2\2\2\u011b\u011c\7\61\2\2\u011c\u011d\7,\2\2\u011d\u0121\3\2\2\2"+
		"\u011e\u0120\13\2\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\7,\2\2\u0125\u0126\7\61\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b-"+
		"\2\2\u0128Z\3\2\2\2\20\2\u00bf\u00cf\u00d6\u00e8\u00ed\u00f1\u00f3\u00f9"+
		"\u0100\u0105\u0108\u0116\u0121\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}