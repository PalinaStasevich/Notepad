package lt.lhu.nb.service;

import java.util.Date;
import java.util.List;

import lt.lhu.nb.entity.Note;
import lt.lhu.nb.service.exception.ServiceException;

public interface NotesFindService {
	
	List<Note> findByContent(String content) throws ServiceException;
	
	List<Note> findByDate(Date date) throws ServiceException;

}
