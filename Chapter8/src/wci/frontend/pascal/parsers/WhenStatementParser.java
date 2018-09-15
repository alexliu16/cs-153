package wci.frontend.pascal.parsers;

import java.util.EnumSet;

import wci.frontend.*;
import wci.frontend.pascal.*;
import wci.intermediate.*;
import wci.intermediate.icodeimpl.*;

import static wci.frontend.pascal.PascalTokenType.*;
import static wci.frontend.pascal.PascalTokenType.WHEN;
import static wci.frontend.pascal.PascalTokenType.OTHERWISE;
import static wci.frontend.pascal.PascalTokenType.NOT;
import static wci.frontend.pascal.PascalErrorCode.*;
import static wci.intermediate.icodeimpl.ICodeNodeTypeImpl.*;
import static wci.intermediate.icodeimpl.ICodeKeyImpl.*;

public class WhenStatementParser extends StatementParser {

	public WhenStatementParser(PascalParserTD parent) {
		super(parent);
	}
	
	// create WHEN set and add WHEN, OTHERWISE, and FOLLOW_SET
	protected static final EnumSet<PascalTokenType> WHEN_SET =
			StatementParser.STMT_START_SET.clone();
	static {
		WHEN_SET.add(WHEN);
		WHEN_SET.add(PascalTokenType.SPECIAL_SYMBOLS.get("ASSIGN"));
		WHEN_SET.addAll(StatementParser.STMT_FOLLOW_SET);
		WHEN_SET.add(OTHERWISE);
	}
	
	public ICodeNode parse(Token token)
		throws Exception
	{
		token = nextToken(); // consume the WHEN token
		
		// create a WHEN node
		ICodeNode whenNode = ICodeFactory.createICodeNode(ICodeNodeTypeImpl.WHEN);
		
		// Parse the expression
		// The WHEN node adopts the expression as a subtree as its first child.
		ExpressionParser expressionParser = new ExpressionParser(this);
		whenNode.addChild(expressionParser.parse(token));
		
		// Synchronize at the =>
		token = synchronize(WHEN_SET);
		if (token.getType() == PascalTokenType.SPECIAL_SYMBOLS.get("ASSIGN")) {
			token = nextToken(); // consume the =>
		} else {
			errorHandler.flag(token, MISSING_ASSIGNMENT, this);
		}
		
		// Parse the => token
		// the WHEN node adopts the statement subtree as its second child
		StatementParser statementParser = new StatementParser(this);
		whenNode.addChild(statementParser.parse(token));
		token = currentToken();
		
		// Look for OTHERWISE
		if (token.getType() == OTHERWISE) {
			
			// Parse the statement after OTHERWISE token
			// the WHEN node adopts the statement subtree as its third child
			whenNode.addChild(statementParser.parse(token));
		}
		return whenNode;	
	}
}
