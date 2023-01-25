package lt.lhu.nb.controller.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import lt.lhu.nb.controller.Command;
import lt.lhu.nb.entity.Note;
import lt.lhu.nb.service.NotesFindService;
import lt.lhu.nb.service.ServiceProvider;
import lt.lhu.nb.service.exception.ServiceException;

public class DataSearch implements Command {

	@Override
	public String execute(String request) {

		String respond = "";
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		NotesFindService notesFindService = serviceProvider.getFindService();
		String note = request.substring(request.indexOf(' ') + 1);
		List<Note> notes = new ArrayList<Note>();
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		try {
			notes = notesFindService.findByContent(note);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		if (!notes.isEmpty()) {
			for (Note n : notes) {
				respond += n.getContent() + " " + format.format(n.getDate()) + "\n";
			}
		} else {
			respond = null;
		}
		return respond;

	}

}
