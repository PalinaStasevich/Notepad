package lt.lhu.nb.controller;

import java.util.HashMap;
import java.util.Map;

import lt.lhu.nb.controller.impl.AddNote;
import lt.lhu.nb.controller.impl.DataSearch;
import lt.lhu.nb.controller.impl.View;
import lt.lhu.nb.controller.impl.WrongRequest;

public class CommandProvider {

	private final Map<CommandName, Command> repository = new HashMap<>();

	CommandProvider() {

		repository.put(CommandName.DATA_SEARCH, new DataSearch());
		repository.put(CommandName.VIEW, new View());
		repository.put(CommandName.ADD_NOTE, new AddNote());
		repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
	}

	Command getCommand(String name) {
		CommandName commandName = null;
		Command command = null;

		try {
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			command = repository.get(CommandName.WRONG_REQUEST);
		}
		return command;
	}

}
