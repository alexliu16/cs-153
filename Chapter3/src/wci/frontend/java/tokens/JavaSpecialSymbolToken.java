package wci.frontend.java.tokens;

import wci.frontend.*;
import wci.frontend.java.JavaToken;

import static wci.frontend.java.JavaTokenType.*;
import static wci.frontend.java.JavaErrorCode.*;

/**
 * <h1>JavaSpecialSymbolToken</h1>
 *
 * <p> Java special symbol tokens.</p>
 */
public class JavaSpecialSymbolToken extends JavaToken
{
    /**
     * Constructor.
     * @param source the source from where to fetch the token's characters.
     * @throws Exception if an error occurred.
     */
    public JavaSpecialSymbolToken(Source source)
            throws Exception
    {
        super(source);
    }

    /**
     * Extract a Java special symbol token from the source.
     * @throws Exception if an error occurred.
     */
    protected void extract()
            throws Exception
    {
        char currentChar = currentChar();

        text = Character.toString(currentChar);
        type = null;

        switch (currentChar) {

            // Single-character special symbols.
            case ',': case ';':  case '\'': case '(':  case ')': case '?': case ':':
            case '[':  case ']':  case '{':  case '}':  case '.': case '@':{
                nextChar();  // consume character
                break;
            }

            // x or x=
            case '*': case '/': case '=': case '!': case '%': case '~': case '^': {
                currentChar = nextChar();
                if(currentChar == '=') {
                    text += currentChar;
                    nextChar();
                }
                break;
            }
            // x, xx, x=
            case '+': case '-': case '&': case '|': {
                char ch = currentChar;
                currentChar = nextChar();
                if(currentChar == '=' || currentChar == ch) {
                    text += currentChar;
                    nextChar();
                }

                break;
            }

            // x, x=, xx=
            case '<': case '>': {
                char ch = currentChar;
                currentChar = nextChar();  // consume ch

                if (currentChar == '=') {
                    text += currentChar;
                    nextChar();  // consume '='
                }
                else if (currentChar == ch) {
                    text += currentChar;
                    currentChar = nextChar();  // consume ch
                    if(currentChar == '=') {
                        text += currentChar;
                        nextChar(); // consume '='
                    }
                }
                break;
            }

            default: {
                nextChar();  // consume bad character
                type = ERROR;
                value = INVALID_CHARACTER;
            }
        }

        // Set the type if it wasn't an error.
        if (type == null) {
            type = SPECIAL_SYMBOLS.get(text);
        }
    }
}
