package wci.frontend.java.tokens;

import wci.frontend.*;
import wci.frontend.java.*;

import static wci.frontend.java.JavaTokenType.*;


public class JavaWordToken extends JavaToken {

	/**
	 * Constructor.
	 * @param source The source from where to fetch the token's characters.
	 * @throws Exception If error occurs.
	 */
	public JavaWordToken(Source source) throws Exception {
		
		super(source);
		
	}
	// Get word characters (letter or digit)
	protected void extract() throws Exception {
		
		StringBuilder textBuffer = new StringBuilder();
		char currentChar = currentChar();			
		
		// Consume characters
		while(Character.isLetterOrDigit(currentChar) || currentChar == '_') {
			textBuffer.append(currentChar);
			currentChar = nextChar();
		}
		
		text = textBuffer.toString();
		
		// Is it a reserved word or an identifier?
		// Reserved words are case sensitive
		type = (RESERVED_WORDS.contains(text))
				? JavaTokenType.valueOf(text.toUpperCase())	// reserved word
				: IDENTIFIER; //identifier
	}
}
