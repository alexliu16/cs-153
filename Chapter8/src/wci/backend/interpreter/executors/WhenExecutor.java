package wci.backend.interpreter.executors;

import java.util.ArrayList;

import java.util.HashMap;

import wci.intermediate.*;
import wci.backend.interpreter.*;

import static wci.intermediate.icodeimpl.ICodeNodeTypeImpl.*;
import static wci.intermediate.icodeimpl.ICodeKeyImpl.*;
import static wci.backend.interpreter.RuntimeErrorCode.*;

public class WhenExecutor extends StatementExecutor {

	public WhenExecutor(Executor parent) {
		super(parent);
	}
	
	/**
	 * Executes a when statement
	 * @param node the root node of the statement
	 * @return null
	 */
	public Object execute(ICodeNode node) {
		ArrayList<ICodeNode> children = node.getChildren();
		return null;
	}
}
