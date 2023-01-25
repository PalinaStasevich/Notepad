package lt.lhu.nb.dal;

import java.util.List;

import lt.lhu.nb.dal.exception.DAOException;
import lt.lhu.nb.entity.Note;

public interface NotesDAO {

	List<Note> load() throws DAOException;

	void save(Note note) throws DAOException;

}
