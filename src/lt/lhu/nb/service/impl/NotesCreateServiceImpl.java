package lt.lhu.nb.service.impl;

import lt.lhu.nb.dal.DAOProvider;
import lt.lhu.nb.dal.NotesDAO;
import lt.lhu.nb.dal.exception.DAOException;
import lt.lhu.nb.entity.Note;
import lt.lhu.nb.service.NotesCreateService;
import lt.lhu.nb.service.exception.ServiceException;

public class NotesCreateServiceImpl implements NotesCreateService {

	@Override
	public void add(Note n) throws ServiceException {

		DAOProvider provider = DAOProvider.getInstance();

		NotesDAO notesDAO = provider.getNotesDAO();

		DataCheckingServiceImpl dataCheckingServiceImpl = new DataCheckingServiceImpl();

		if (dataCheckingServiceImpl.contentIsNotNull(n.getContent())) {
			try {
				notesDAO.save(n);
			} catch (DAOException e) {
				throw new ServiceException("Note is not saved", e);
			}
			
		}
	}
}
