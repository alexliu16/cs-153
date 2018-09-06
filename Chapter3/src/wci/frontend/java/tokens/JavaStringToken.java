package wci.frontend.java.tokens;

import wci.frontend.*;
import wci.frontend.java.*;

import static wci.frontend.Source.EOF;
import static wci.frontend.java.JavaTokenType.*;
import static wci.frontend.java.JavaErrorCode.*;

public class JavaStringToken extends JavaToken {

	/**
	 * Constructor
	 * @param source The Source from where to fetch the token's chars.
	 * @throws Exception if error occurs...
	 */
	public JavaStringToken(Source source) throws Exception{

		super(source);

	}

    /**
     * Extract a Java string token from source.
     * @throws Exception if an error occurred.
     */
    protected void extract()
        throws Exception
    {
        StringBuilder textBuffer = new StringBuilder();
        StringBuilder valueBuffer = new StringBuilder();

        char currentChar = nextChar();  // consume initial quote
        textBuffer.append('\"');

        // Get string characters.
        do {
            // Replace any whitespace with a blank.
            if (Character.isWhitespace(currentChar)) {
                currentChar = ' ';
            }

            // Append escaped quote (\")
        		// Properly handle double-quote, if right after
            if ((currentChar == '\\') && (peekChar() == '\"')) {
            	textBuffer.append("\\\"");
            	valueBuffer.append("\\\"");
            	currentChar = nextChar();  // consume character
            	currentChar = nextChar();  // consume character
            }
            // Append non-quote characters
            else if ((currentChar != '\"') && (currentChar != EOF)) {
                textBuffer.append(currentChar);
                valueBuffer.append(currentChar);
                currentChar = nextChar();  // consume character
            }

            // Quote?  Each pair of adjacent quotes represents a double-quote.
            if (currentChar == '\"') {
                while ((currentChar == '\"') && (peekChar() == '\"')) {
                    textBuffer.append("\"\"");
                    valueBuffer.append(currentChar); // append double-quote
                    currentChar = nextChar();        // consume pair of quotes
                    currentChar = nextChar();
                }
            }

        } while ((currentChar != '\"') && (currentChar != EOF));

        if (currentChar == '\"') {
            nextChar();  // consume final quote
            textBuffer.append('\"');

            type = STRING;
            value = valueBuffer.toString();
        }
        else {
            type = ERROR;
            value = UNEXPECTED_EOF;
        }

        text = textBuffer.toString();
    }

}
