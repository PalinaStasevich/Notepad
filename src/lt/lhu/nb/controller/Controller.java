package lt.lhu.nb.controller;

import java.text.ParseException;

public class Controller {
	
	private final CommandProvider provider = new CommandProvider();

	private final char paramDelimeter = ' ';

	public String executeTask(String request) throws ParseException {
		String commandName;
		Command executionCommand;

		commandName = request.substring(0, request.indexOf(paramDelimeter));
		executionCommand = provider.getCommand(commandName);

		String response;
		response = executionCommand.execute(request);

		return response;
	}
}
