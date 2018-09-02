package wci.frontend.java;

import wci.frontend.*;
import wci.frontend.java.tokens.*;

import static wci.frontend.Source.EOF;

/**
 * JavaScanner
 * The Java Scanner.
 * @author Alex Liu, Jonathan Su, Thomas Pedersen, Kenny Huynh
 *
 */
public class JavaScanner extends Scanner {
	/**
	 * Constructor
	 * @param source the source to be used for the scanner
	 */
	public JavaScanner(Source source) {
		super(source);
	}

	
	@Override
	protected Token extractToken() throws Exception {
		skipWhiteSpace();
		Token token;
		char currentChar = currentChar();
		// Construct next token. The current char determines token type.
		if (currentChar == EOF) {
			token = new EofToken(source);
		}
		else if (Character.isDigit(currentChar)) {
			token = new JavaNumberToken(source);
		}
		// TO-DO: need to add JavaWord/Character/String/SpecialSymbol/Error Token classes
//		else if (Character.isLetter(currentChar)) {
//			token = new JavaWordToken(source);
//		}
//		else if (currentChar == '\'') {
//			// token = new JavaCharacterToken(source);
//		}
//		else if (currentChar == '"') {
//			// token = new JavaStringToken(source);
//		}
//		else if (JavaTokenType.SPECIAL_SYMBOLS
//				.containsKey(Character.toString(currentChar)))
//		{
//			token = new JavaSpecialSymbolToken(source);
//		}
//		else 
//		{
//			token = new JavaErrorToken(source, INVALID_CHARACTER, Character.toString(currentChar));
//		}
		
		return token;
	}
	
	/**
	 * Skips whitespace characters by consuming them. Comments are also considered whitespace.
	 * @throws Exception if exception occurs
	 */
	private void skipWhiteSpace() throws Exception {
		char currentChar = currentChar();
		while (Character.isWhitespace(currentChar) || currentChar == '/') {
			// start of a comment?
			if (currentChar == '/') {
				char nextChar = nextChar();
				if (nextChar == '/' || nextChar == '*') {
					do {
						currentChar = nextChar();
					} while ((currentChar != '/') && (currentChar != EOF));
					
					// found closing? (two options, */ or end of line)
					if (currentChar == '/' || currentChar == EOF) {
						currentChar = nextChar();
					}
				}
			} else {
				// not a comment
				currentChar = nextChar(); // consume whitespace character
			}
		}
	}
}