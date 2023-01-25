package lt.lhu.nb.service;

import lt.lhu.nb.entity.Note;
import lt.lhu.nb.service.exception.ServiceException;

public interface NotesCreateService {
	
	void add(Note n) throws ServiceException;
	
}
