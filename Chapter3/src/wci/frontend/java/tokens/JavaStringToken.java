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

            // Append escaped characters
            if (currentChar == '\\') {
            	
            	char nextChar = peekChar();
            	
            	switch (nextChar) {
            		case 'n': { // '\n'
            			textBuffer.append("\\n");
            			valueBuffer.append("\n");
            			break;
            		}
            		case 't': { // '\t'
            			textBuffer.append("\\t");
            			valueBuffer.append("\t");
            			break;
            		}
            		case '\"': { // '\"'
            			textBuffer.append("\\\"");
                    	valueBuffer.append("\"");
                    	break;
            		}
            		case '\\': { // '\\'
            			textBuffer.append("\\\\");
                    	valueBuffer.append("\\");
                    	break;
            		}
            	}
 
            	currentChar = nextChar();  // consume character
            	currentChar = nextChar();  // consume character
            }
            // Append non-quote characters
            else if ((currentChar != '\"') && (currentChar != EOF)) {
                textBuffer.append(currentChar);
                valueBuffer.append(currentChar);
                currentChar = nextChar();  // consume character
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
