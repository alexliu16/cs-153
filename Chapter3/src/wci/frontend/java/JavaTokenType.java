package wci.frontend.java;

import java.util.HashSet;
import java.util.Hashtable;

import wci.frontend.TokenType;

public enum JavaTokenType implements TokenType {
	 // Reserved words.
	ABSTRACT, DOUBLE, INT, LONG, BREAK, ELSE, SWITCH, CASE,
	ENUM, NATIVE, SUPER, CHAR, EXTENDS, RETURN, THIS, CLASS, FLOAT, SHORT,
	THROW, CONST, FOR, PACKAGE, VOID, CONTINUE, GOTO, PROTECTED, VOLATILE,
	DO, IF, STATIC, WHILE,


    // Special symbols.
	BIT_COMPLEMENT("~"), NOT("!"), PERCENT("%"), BIT_XOR("^"), BIT_AND("&"), STAR("*"), BIT_OR("|"),
	MINUS("-"), PLUS("+"), EQUALS("="), SLASH("/"), COLON(":"), SEMICOLON(";"),
	QUESTION("?"), LESS_THAN("<"), GREATER_THAN(">"), DOT("."), COMMA(","), QUOTE("'"),
	EQUALS_CHECK("=="), NOT_EQUALS("!="), LESS_EQUALS("<="), GREATER_EQUALS(">="),LEFT_PAREN("("), 
	RIGHT_PAREN(")"), LEFT_BRACKET("["), RIGHT_BRACKET("]"), LEFT_BRACE("{"), RIGHT_BRACE("}"),
	INCREMENT("++"), DECREMENT("--"), BIT_LEFT_SHIFT("<<"), BIT_RIGHT_SHIFT(">>"), COMPOUND_ADD("+="),
	COMPOUND_MINUS("-="), COMPOUND_MULTIPLY("*="), COMPOUND_DIVIDE("/="), LOGIC_AND("&&"), LOGIC_OR("||"),
	QUOTATION("\""), COMMENT_ONE_LINE("//"), COMMENT_MULTI_LINE_START("/*"), COMMENT_MULTI_LINE_END("*/"), 
	COMPOUND_BIT_OR("|="), COMPOUND_PERCENT("%="), COMPOUND_BIT_AND("&="), COMPOUND_BIT_XOR("^="),
	COMPOUND_BIT_LEFT_SHIFT("<<="), COMPOUND_BIT_RIGHT_SHIFT(">>="), COMMERCIAL("@"),

    IDENTIFIER, INTEGER, REAL, STRING,
    ERROR, END_OF_FILE;

    private static final int FIRST_RESERVED_INDEX = ABSTRACT.ordinal();
    private static final int LAST_RESERVED_INDEX  = WHILE.ordinal();

    private static final int FIRST_SPECIAL_INDEX = BIT_COMPLEMENT.ordinal();
    private static final int LAST_SPECIAL_INDEX  = COMMERCIAL.ordinal();

    private String text;  // token text

    /**
     * Constructor.
     */
    JavaTokenType()
    {
        this.text = this.toString().toLowerCase();
    }

    /**
     * Constructor.
     * @param text the token text.
     */
    JavaTokenType(String text)
    {
        this.text = text;
    }

    /**
     * Getter.
     * @return the token text.
     */
    public String getText()
    {
        return text;
    }

    // Set of lower-cased Java reserved word text strings.
    public static HashSet<String> RESERVED_WORDS = new HashSet<String>();
    static {
        JavaTokenType values[] = JavaTokenType.values();
        for (int i = FIRST_RESERVED_INDEX; i <= LAST_RESERVED_INDEX; ++i) {
            RESERVED_WORDS.add(values[i].getText().toLowerCase());
        }
    }

    // Hash table of Java special symbols.  Each special symbol's text
    // is the key to its Java token type.
    public static Hashtable<String, JavaTokenType> SPECIAL_SYMBOLS =
        new Hashtable<String, JavaTokenType>();
    static {
        JavaTokenType values[] = JavaTokenType.values();
        for (int i = FIRST_SPECIAL_INDEX; i <= LAST_SPECIAL_INDEX; ++i) {
            SPECIAL_SYMBOLS.put(values[i].getText(), values[i]);
        }
    }
}
