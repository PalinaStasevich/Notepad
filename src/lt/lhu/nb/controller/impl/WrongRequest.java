package lt.lhu.nb.controller.impl;

import lt.lhu.nb.controller.Command;

public class WrongRequest implements Command {

	@Override
	public String execute(String request) {
		String respond = "Wrong command";
		return respond;
	}

}
