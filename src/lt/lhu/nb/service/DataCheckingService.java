package lt.lhu.nb.service;

import java.util.Date;

import lt.lhu.nb.entity.Note;
import lt.lhu.nb.service.exception.ServiceException;

public interface DataCheckingService {

	boolean noteIsNotNull(Note note) throws ServiceException;

	boolean contentIsNotNull(String content) throws ServiceException;

	boolean dateIsNotNull(Date date) throws ServiceException;

}
