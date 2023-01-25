package lt.lhu.nb.dal;

import lt.lhu.nb.dal.exception.DAOException;
import lt.lhu.nb.dal.impl.FileNotesDAO;

public final class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	private NotesDAO notesDAO;

	private DAOProvider() {
		try {
			notesDAO = new FileNotesDAO();
		} catch (DAOException e) {
			throw new RuntimeException();
		}
	}

	public NotesDAO getNotesDAO() {
		return notesDAO;
	}

	public static DAOProvider getInstance() {
		return instance;
	}

}
