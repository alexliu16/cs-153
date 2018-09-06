package wci.frontend.java;

// TODO: Need to modify for Java, this was copied/pasted from PascalErrorCode
public enum JavaErrorCode {
	    CASE_CONSTANT_REUSED("CASE constant reused"),
	    IDENTIFIER_REDEFINED("Redefined identifier"),
	    IDENTIFIER_UNDEFINED("Undefined identifier"),
	    INCOMPATIBLE_ASSIGNMENT("Incompatible assignment"),
	    INCOMPATIBLE_TYPES("Incompatible types"),
	    INVALID_ASSIGNMENT("Invalid assignment statement"),
	    INVALID_CHARACTER("Invalid character"),
	    INVALID_CONSTANT("Invalid constant"),
	    INVALID_EXPONENT("Invalid exponent"),
	    INVALID_EXPRESSION("Invalid expression"),
	    INVALID_FIELD("Invalid field"),
	    INVALID_FRACTION("Invalid fraction"),
	    INVALID_IDENTIFIER_USAGE("Invalid identifier usage"),
	    INVALID_INDEX_TYPE("Invalid index type"),
	    INVALID_NUMBER("Invalid number"),
	    INVALID_STATEMENT("Invalid statement"),
	    INVALID_TARGET("Invalid assignment target"),
	    INVALID_TYPE("Invalid type"),
	    MIN_GT_MAX("Min limit greater than max limit"),
	    MISSING_COLON("Missing :"),
	    MISSING_COMMA("Missing ,"),
	    MISSING_CONSTANT("Missing constant"),
	    MISSING_DO("Missing do"),
	    MISSING_PUBLIC("Missing public"),
	    MISSING_STATIC("Missin static"),
	    MISSING_CLASS("Missing class"),
	    MISSING_FOR("Invalid for control variable"),
	    MISSING_EQUALS("Missing ="),
	    MISSING_IDENTIFIER("Missing identifier"),
	    MISSING_LEFT_BRACKET("Missing ["),
	    MISSING_PERIOD("Missing ."),
	    MISSING_RIGHT_BRACKET("Missing ]"),
	    MISSING_RIGHT_PAREN("Missing )"),
	    MISSING_SEMICOLON("Missing ;"),
	    MISSING_VARIABLE("Missing variable"),
	    NOT_CONSTANT_IDENTIFIER("Not a constant identifier"),
	    NOT_TYPE_IDENTIFIER("Not a type identifier"),
	    RANGE_INTEGER("Integer literal out of range"),
	    RANGE_REAL("Real literal out of range"),
	    STACK_OVERFLOW("Stack overflow"),
	    TOO_MANY_LEVELS("Nesting level too deep"),
	    TOO_MANY_SUBSCRIPTS("Too many subscripts"),
	    UNEXPECTED_EOF("Unexpected end of file"),
	    UNEXPECTED_TOKEN("Unexpected token"),
	    UNIMPLEMENTED("Unimplemented feature"),
	    UNRECOGNIZABLE("Unrecognizable input"),
	    WRONG_NUMBER_OF_PARMS("Wrong number of actual parameters"),

	    // Fatal errors.
	    IO_ERROR(-101, "Object I/O error"),
	    TOO_MANY_ERRORS(-102, "Too many syntax errors");

	    private int status;      // exit status
	    private String message;  // error message

	    /**
	     * Constructor.
	     * @param message the error message.
	     */
	    JavaErrorCode(String message)
	    {
	        this.status = 0;
	        this.message = message;
	    }

	    /**
	     * Constructor.
	     * @param status the exit status.
	     * @param message the error message.
	     */
	    JavaErrorCode(int status, String message)
	    {
	        this.status = status;
	        this.message = message;
	    }

	    /**
	     * Getter.
	     * @return the exit status.
	     */
	    public int getStatus()
	    {
	        return status;
	    }

	    /**
	     * @return the message.
	     */
	    public String toString()
	    {
	        return message;
	    }
}
