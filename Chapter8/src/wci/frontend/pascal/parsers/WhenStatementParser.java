package wci.frontend.pascal.parsers;

import java.util.EnumSet;

import java.util.HashMap;

import wci.frontend.*;
import wci.frontend.pascal.*;
import wci.intermediate.*;
import wci.intermediate.icodeimpl.*;

import static wci.frontend.pascal.PascalTokenType.*;
import static wci.frontend.pascal.PascalTokenType.NOT;
import static wci.frontend.pascal.PascalErrorCode.*;
import static wci.intermediate.icodeimpl.ICodeNodeTypeImpl.*;
import static wci.intermediate.icodeimpl.ICodeKeyImpl.*;

public class WhenStatementParser extends StatementParser {

	public WhenStatementParser(PascalParserTD parent) {
		super(parent);
	}

}
