package lt.lhu.nb.controller.impl;

import lt.lhu.nb.controller.Command;

public class View implements Command {
	
	private final char paramDelimeter = ' ';

	@Override
	public String execute(String request) {

		String message = request.substring(request.indexOf(paramDelimeter));

		if (message != null) {
			System.out.println(message);
		} else {
			System.out.println("Fail");
		}
		return null;
	}

}
