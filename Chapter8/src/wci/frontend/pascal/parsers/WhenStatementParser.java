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
		WHEN_SET.add(ASSIGN_WHEN);
		WHEN_SET.addAll(StatementParser.STMT_FOLLOW_SET);
		WHEN_SET.add(OTHERWISE);
	}
	
	public ICodeNode parse(Token token)
		throws Exception
	{
		token = nextToken(); // consume the WHEN token
		ICodeNode mainNode = ICodeFactory.createICodeNode(ICodeNodeTypeImpl.IF);
		ICodeNode ifNode = mainNode;
		boolean notDone = true;
		while(notDone) {
			// Parse the expression
			// The If node adopts the expression as a subtree as its first child.
			ExpressionParser expressionParser = new ExpressionParser(this);
			ifNode.addChild(expressionParser.parse(token));

			// Synchronize at the =>
			token = synchronize(WHEN_SET);
			if (token.getType() == ASSIGN_WHEN) {
				token = nextToken(); // consume the =>
			} else {
				errorHandler.flag(token, MISSING_ASSIGNMENT, this);
			}

			// Parse the => token
			// the WHEN node adopts the statement subtree as its second child
			StatementParser statementParser = new StatementParser(this);
			ifNode.addChild(statementParser.parse(token));
			token = currentToken();
			if(token.getType() != SEMICOLON) {
				errorHandler.flag(token, MISSING_SEMICOLON, this);
			} else {
				token = nextToken(); // consume ;
			}

			// Look for OTHERWISE
			if (token.getType() == OTHERWISE) {
				token = nextToken(); // consume OTHERWISE
				// Parse the statement after OTHERWISE token
				// Synchronize at the =>
				token = synchronize(WHEN_SET);
				if (token.getType() == ASSIGN_WHEN) {
					token = nextToken(); // consume the =>
				} else {
					errorHandler.flag(token, MISSING_ASSIGNMENT, this);
				}
				ifNode.addChild(statementParser.parse(token));
				notDone = false;
			} else if (token.getType() == END) { // if found END; set notDone to false and break out of loop
<<<<<<< HEAD
=======
				errorHandler.flag(token, MISSING_OTHERWISE, this);
>>>>>>> master
				notDone = false;
			} else {
				ICodeNode elseNode = ICodeFactory.createICodeNode(ICodeNodeTypeImpl.IF);
				ifNode.addChild(elseNode);
				ifNode = elseNode;
			}
		}
		//sync to end
		token = synchronize(STMT_FOLLOW_SET);
		if(token.getType() == END) {
			nextToken(); // consume END
		}
		else {
			errorHandler.flag(token, MISSING_END, this);
		}
		return mainNode;
	}
}
