package wci.frontend.java.tokens;

import static wci.frontend.Source.EOF;
import static wci.frontend.pascal.PascalErrorCode.UNEXPECTED_EOF;
import static wci.frontend.pascal.PascalTokenType.ERROR;

import wci.frontend.Source;
import wci.frontend.java.JavaToken;
import static wci.frontend.java.JavaErrorCode.INVALID_CHARACTER;
import static wci.frontend.java.JavaTokenType.CHARACTER;

public class JavaCharacterToken extends JavaToken {

	/**
     * Constructor.
     * @param source the source from where to fetch the token's characters.
     * @throws Exception if an error occurred.
     */
    public JavaCharacterToken(Source source)
        throws Exception
    {
        super(source);
    }

	/**
	 * Extract a Java character token from the source.
	 * 
	 * @throws Exception
	 *             if an error occurred.
	 */
	protected void extract() throws Exception {
		StringBuilder textBuffer = new StringBuilder();
		StringBuilder valueBuffer = new StringBuilder();
		
		boolean escapeChar = false; 

		char currentChar = nextChar(); // consume initial quote
		textBuffer.append('\'');
		valueBuffer.append('\'');
		
		if(currentChar != '\'') {
			textBuffer.append(currentChar);
			valueBuffer.append(currentChar);
			
			if(currentChar == '\\') {
				currentChar = nextChar();
				textBuffer.append(currentChar);
				valueBuffer.append(currentChar);
				escapeChar = true;
			}

			currentChar = nextChar();
		}
		else { 
			//next character cannot be quote
			//''' and '' are both invalid
			type = ERROR;
			value = INVALID_CHARACTER;
		}

		if (currentChar == '\'') {
			nextChar(); // consume final quote
			textBuffer.append('\'');
			valueBuffer.append('\'');
			
			type = CHARACTER;
			value = valueBuffer.toString();
		}
		else if(escapeChar) {
			type = ERROR;
			value = INVALID_CHARACTER;
		}
		else {
			type = ERROR;
			value = UNEXPECTED_EOF;
		}

		text = textBuffer.toString();
	}

}
