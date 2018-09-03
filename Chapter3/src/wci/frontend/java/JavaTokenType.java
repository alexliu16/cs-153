package wci.frontend.java;

import java.util.HashSet;
import java.util.Hashtable;

import wci.frontend.TokenType;

// TODO: Modify reserved words/symbols for Java - this was copied/pasted from PascalTokenType

public enum JavaTokenType implements TokenType {
	 // Reserved words.
    AND, ARRAY, BEGIN, CASE, CONST, DIV, DO, DOWNTO, ELSE, END,
    FILE, FOR, FUNCTION, GOTO, IF, IN, LABEL,
    OF, OR, PACKED, PROCEDURE, PROGRAM, RECORD, REPEAT, SET,
    THEN, TO, TYPE, UNTIL, VAR, WHILE, WITH,

    // Special symbols.
    PLUS("+"), PLUS_EQ("+="), PLUS_PLUS("++"), MINUS("-"), MINUS_EQ("-="), MINUS_MINUS("--"), STAR("*"),
    TIMES_EQ("*="), DIVIDE("/"), DIVIDE_EQ("/="), DOT("."), COMMA(","), SEMICOLON(";"), COLON(":"),
    EQUALS("="), EQUALS_CHECK("=="), TILDE("~"), TILDE_EQ("~="), NOT("!"), NOT_EQUALS("!="), LESS_THAN("<"),
    SHIFT_LEFT("<<"), SHIFT_LEFT_EQ("<<="), LESS_EQUALS("<="), GREATER_EQUALS(">="), SHIFT_RIGHT(">>"),
    SHIFT_RIGHT_EQ(">>="), GREATER_THAN(">"), LEFT_PAREN("("), RIGHT_PAREN(")"), LEFT_BRACKET("["),
    RIGHT_BRACKET("]"), LEFT_BRACE("{"), RIGHT_BRACE("}"), XOR("^"), XOR_EQ("^="), AND_BIT("&"), AND_BIT_EQ("&="),
    OR_BIT("|"), OR_BIT_EQ("|="), AND_BOOL("&&"), OR_BOOL("||"), MOD("%"), MOD_EQ("%="), AD("@"), QUESTION_MARK("?"),

    IDENTIFIER, INTEGER, REAL, STRING,
    ERROR, END_OF_FILE;

    private static final int FIRST_RESERVED_INDEX = AND.ordinal();
    private static final int LAST_RESERVED_INDEX  = WITH.ordinal();

    private static final int FIRST_SPECIAL_INDEX = PLUS.ordinal();
    private static final int LAST_SPECIAL_INDEX  = QUESTION_MARK.ordinal();

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
