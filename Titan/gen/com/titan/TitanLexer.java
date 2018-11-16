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
		T__17=18, MUL=19, DIV=20, ADD=21, SUB=22, MOD=23, CONST=24, INT=25, BOOL=26, 
		CHAR=27, FLOAT=28, AssignmentOp=29, PLUS_EQ=30, MINUS_EQ=31, MUL_EQ=32, 
		DIV_EQ=33, EXPNUM=34, SHORTHANDASSIGNOP=35, PLUSPLUS=36, MINUSMINUS=37, 
		COMPARISON_OP=38, ID=39, WORD=40, FLOATINGNUMBER=41, DIGITS=42, NEWLINE=43, 
		WHITESPACE=44, LINECOMMENT=45, BLOCKCOMMENT=46, STRINGLIT=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "MUL", "DIV", "ADD", "SUB", "MOD", "CONST", "INT", "BOOL", "CHAR", 
		"FLOAT", "AssignmentOp", "PLUS_EQ", "MINUS_EQ", "MUL_EQ", "DIV_EQ", "EXPNUM", 
		"SHORTHANDASSIGNOP", "PLUSPLUS", "MINUSMINUS", "COMPARISON_OP", "ID", 
		"WORD", "FLOATINGNUMBER", "DIGITS", "NEWLINE", "WHITESPACE", "LINECOMMENT", 
		"BLOCKCOMMENT", "STRINGLIT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u014a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\5\36\u00d6\n\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\5#\u00e6\n#\3#\3#\3#\3$\3$\5$\u00ed\n$\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u00ff\n\'\3(\6(\u0102\n(\r"+
		"(\16(\u0103\3(\3(\7(\u0108\n(\f(\16(\u010b\13(\3)\3)\3*\5*\u0110\n*\3"+
		"*\3*\3*\3*\3*\5*\u0117\n*\3+\6+\u011a\n+\r+\16+\u011b\3,\5,\u011f\n,\3"+
		",\3,\3-\3-\3-\3-\3.\3.\3.\3.\7.\u012b\n.\f.\16.\u012e\13.\3.\3.\3/\3/"+
		"\3/\3/\7/\u0136\n/\f/\16/\u0139\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\7\60\u0144\n\60\f\60\16\60\u0147\13\60\3\60\3\60\3\u0137\2\61\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\t\4\2GGgg\5\2C\\aac|\3\2\62;\4"+
		"\2\13\13\"\"\4\2\f\f\17\17\n\2$$))^^ddhhppttvv\6\2\f\f\17\17$$^^\2\u015e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3"+
		"\2\2\2\5i\3\2\2\2\7n\3\2\2\2\tp\3\2\2\2\13r\3\2\2\2\rt\3\2\2\2\17v\3\2"+
		"\2\2\21y\3\2\2\2\23~\3\2\2\2\25\u0082\3\2\2\2\27\u0087\3\2\2\2\31\u008a"+
		"\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u0097\3\2\2\2!\u0099\3\2"+
		"\2\2#\u009e\3\2\2\2%\u00a5\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b1"+
		"\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61\u00b7\3\2\2\2\63\u00bd\3\2\2"+
		"\2\65\u00c1\3\2\2\2\67\u00c6\3\2\2\29\u00cb\3\2\2\2;\u00d5\3\2\2\2=\u00d7"+
		"\3\2\2\2?\u00da\3\2\2\2A\u00dd\3\2\2\2C\u00e0\3\2\2\2E\u00e5\3\2\2\2G"+
		"\u00ec\3\2\2\2I\u00ee\3\2\2\2K\u00f1\3\2\2\2M\u00fe\3\2\2\2O\u0101\3\2"+
		"\2\2Q\u010c\3\2\2\2S\u0116\3\2\2\2U\u0119\3\2\2\2W\u011e\3\2\2\2Y\u0122"+
		"\3\2\2\2[\u0126\3\2\2\2]\u0131\3\2\2\2_\u013f\3\2\2\2ab\7r\2\2bc\7t\2"+
		"\2cd\7q\2\2de\7i\2\2ef\7t\2\2fg\7c\2\2gh\7o\2\2h\4\3\2\2\2ij\7o\2\2jk"+
		"\7c\2\2kl\7k\2\2lm\7p\2\2m\6\3\2\2\2no\7}\2\2o\b\3\2\2\2pq\7\177\2\2q"+
		"\n\3\2\2\2rs\7*\2\2s\f\3\2\2\2tu\7+\2\2u\16\3\2\2\2vw\7k\2\2wx\7h\2\2"+
		"x\20\3\2\2\2yz\7g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2}\22\3\2\2\2~\177\7h\2"+
		"\2\177\u0080\7q\2\2\u0080\u0081\7t\2\2\u0081\24\3\2\2\2\u0082\u0083\7"+
		"h\2\2\u0083\u0084\7t\2\2\u0084\u0085\7q\2\2\u0085\u0086\7o\2\2\u0086\26"+
		"\3\2\2\2\u0087\u0088\7v\2\2\u0088\u0089\7q\2\2\u0089\30\3\2\2\2\u008a"+
		"\u008b\7h\2\2\u008b\u008c\7w\2\2\u008c\u008d\7p\2\2\u008d\u008e\7e\2\2"+
		"\u008e\u008f\7v\2\2\u008f\u0090\7k\2\2\u0090\u0091\7q\2\2\u0091\u0092"+
		"\7p\2\2\u0092\32\3\2\2\2\u0093\u0094\7.\2\2\u0094\34\3\2\2\2\u0095\u0096"+
		"\7(\2\2\u0096\36\3\2\2\2\u0097\u0098\7?\2\2\u0098 \3\2\2\2\u0099\u009a"+
		"\7x\2\2\u009a\u009b\7q\2\2\u009b\u009c\7k\2\2\u009c\u009d\7f\2\2\u009d"+
		"\"\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\u00a2\7w\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7p\2\2\u00a4$\3\2\2\2\u00a5"+
		"\u00a6\7r\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2"+
		"\u00a9\u00aa\7v\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7*\2\2\u00ac&\3\2\2"+
		"\2\u00ad\u00ae\7,\2\2\u00ae(\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0*\3\2\2"+
		"\2\u00b1\u00b2\7-\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4.\3\2\2\2"+
		"\u00b5\u00b6\7\'\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7"+
		"q\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc\62"+
		"\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\64\3\2\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7q\2\2\u00c4"+
		"\u00c5\7n\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7j\2\2\u00c8"+
		"\u00c9\7c\2\2\u00c9\u00ca\7t\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc"+
		"\u00cd\7n\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7v\2\2"+
		"\u00d0:\3\2\2\2\u00d1\u00d6\5=\37\2\u00d2\u00d6\5? \2\u00d3\u00d6\5A!"+
		"\2\u00d4\u00d6\5C\"\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6<\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8\u00d9"+
		"\7?\2\2\u00d9>\3\2\2\2\u00da\u00db\7/\2\2\u00db\u00dc\7?\2\2\u00dc@\3"+
		"\2\2\2\u00dd\u00de\7,\2\2\u00de\u00df\7?\2\2\u00dfB\3\2\2\2\u00e0\u00e1"+
		"\7\61\2\2\u00e1\u00e2\7?\2\2\u00e2D\3\2\2\2\u00e3\u00e6\5S*\2\u00e4\u00e6"+
		"\5U+\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\t\2\2\2\u00e8\u00e9\5U+\2\u00e9F\3\2\2\2\u00ea\u00ed\5I%\2\u00eb"+
		"\u00ed\5K&\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00edH\3\2\2\2\u00ee"+
		"\u00ef\7-\2\2\u00ef\u00f0\7-\2\2\u00f0J\3\2\2\2\u00f1\u00f2\7/\2\2\u00f2"+
		"\u00f3\7/\2\2\u00f3L\3\2\2\2\u00f4\u00ff\7>\2\2\u00f5\u00f6\7>\2\2\u00f6"+
		"\u00ff\7?\2\2\u00f7\u00ff\7@\2\2\u00f8\u00f9\7@\2\2\u00f9\u00ff\7?\2\2"+
		"\u00fa\u00fb\7?\2\2\u00fb\u00ff\7?\2\2\u00fc\u00fd\7#\2\2\u00fd\u00ff"+
		"\7?\2\2\u00fe\u00f4\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe"+
		"\u00f8\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ffN\3\2\2\2"+
		"\u0100\u0102\5Q)\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0109\3\2\2\2\u0105\u0108\5U+\2\u0106"+
		"\u0108\5Q)\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2"+
		"\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010aP\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010c\u010d\t\3\2\2\u010dR\3\2\2\2\u010e\u0110\5U+\2\u010f\u010e"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\60\2\2"+
		"\u0112\u0117\5U+\2\u0113\u0114\5U+\2\u0114\u0115\7\60\2\2\u0115\u0117"+
		"\3\2\2\2\u0116\u010f\3\2\2\2\u0116\u0113\3\2\2\2\u0117T\3\2\2\2\u0118"+
		"\u011a\t\4\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011cV\3\2\2\2\u011d\u011f\7\17\2\2\u011e\u011d"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\f\2\2\u0121"+
		"X\3\2\2\2\u0122\u0123\t\5\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b-\2\2\u0125"+
		"Z\3\2\2\2\u0126\u0127\7\61\2\2\u0127\u0128\7\61\2\2\u0128\u012c\3\2\2"+
		"\2\u0129\u012b\n\6\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0130\b.\2\2\u0130\\\3\2\2\2\u0131\u0132\7\61\2\2\u0132\u0133\7,\2\2"+
		"\u0133\u0137\3\2\2\2\u0134\u0136\13\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013b\7,\2\2\u013b\u013c\7\61\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013e\b/\2\2\u013e^\3\2\2\2\u013f\u0145\7$\2\2\u0140\u0141"+
		"\7^\2\2\u0141\u0144\t\7\2\2\u0142\u0144\n\b\2\2\u0143\u0140\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7$\2\2\u0149"+
		"`\3\2\2\2\22\2\u00d5\u00e5\u00ec\u00fe\u0103\u0107\u0109\u010f\u0116\u011b"+
		"\u011e\u012c\u0137\u0143\u0145\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}