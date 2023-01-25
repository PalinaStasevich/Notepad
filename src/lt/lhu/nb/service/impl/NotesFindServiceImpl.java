package lt.lhu.nb.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lt.lhu.nb.dal.DAOProvider;
import lt.lhu.nb.dal.NotesDAO;
import lt.lhu.nb.dal.exception.DAOException;
import lt.lhu.nb.entity.Note;
import lt.lhu.nb.service.NotesFindService;
import lt.lhu.nb.service.exception.ServiceException;

public class NotesFindServiceImpl implements NotesFindService {

	@Override
	public List<Note> findByContent(String content) throws ServiceException{

		DAOProvider provider = DAOProvider.getInstance();

		NotesDAO notesDAO = provider.getNotesDAO();

		List<Note> sourceList;

		try {
			sourceList = notesDAO.load();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		List<Note> notes = new ArrayList<Note>();

		for (Note note : sourceList) {
			if (note.getContent().contains(content)) {
				notes.add(note);
			}
		}
		return notes;
	}

	@Override
	public List<Note> findByDate(Date date) throws ServiceException {

		DAOProvider provider = DAOProvider.getInstance();

		NotesDAO notesDAO = provider.getNotesDAO();

		List<Note> sourceList;

		try {
			sourceList = notesDAO.load();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		List<Note> notes = new ArrayList<Note>();

		for (Note note : sourceList) {
			if (note.getDate().equals(date)) {
				notes.add(note);
			}
		}

		return notes;
	}
}
