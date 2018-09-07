package wci.frontend.java.tokens;

import static wci.frontend.java.JavaErrorCode.INVALID_ESCAPE_CHARACTER;
import static wci.frontend.java.JavaErrorCode.UNEXPECTED_EOF;
import static wci.frontend.java.JavaTokenType.ERROR;

import wci.frontend.Source;
import wci.frontend.java.JavaToken;

import java.util.HashMap;

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

	//This helps convert the characters '\' and 'n' to the single char '\n' etc.
	//Also used to check for any illegal character escapes
	static HashMap<String, Character> escapeCharMap = new HashMap<>();
	static {
		escapeCharMap.put("\\n", '\n');
		escapeCharMap.put("\\t", '\t');
		escapeCharMap.put("\\'", '\'');
		escapeCharMap.put("\\\\", '\\');
		escapeCharMap.put("\\b", '\b');
		escapeCharMap.put("\\r", '\r');
		escapeCharMap.put("\\\"", '\"');
		escapeCharMap.put("\\f", '\f');
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

			type = CHARACTER;
			if(escapeChar) {
				if(escapeCharMap.containsKey(valueBuffer.toString())) {
					value = "'" + valueBuffer.toString() + "'";
				}
				else {
					//not a good escape char
					type = ERROR;
					value = INVALID_ESCAPE_CHARACTER;
				}
			}
			else {
				value = valueBuffer.toString();
			}
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
