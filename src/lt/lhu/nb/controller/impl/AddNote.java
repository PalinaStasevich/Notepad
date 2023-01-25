package lt.lhu.nb.controller.impl;

import lt.lhu.nb.controller.Command;
import lt.lhu.nb.entity.Note;
import lt.lhu.nb.service.NotesCreateService;
import lt.lhu.nb.service.ServiceProvider;
import lt.lhu.nb.service.exception.ServiceException;

public class AddNote implements Command {

	@Override
	public String execute(String request) {

		String respond = null;
		Note note = null;

		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		NotesCreateService createService = serviceProvider.getCreateService();

		try {
			createService.add(note);
			respond = "Success";
		} catch (ServiceException e) {
			respond = "Error";
		}
		return respond;
	}

}
