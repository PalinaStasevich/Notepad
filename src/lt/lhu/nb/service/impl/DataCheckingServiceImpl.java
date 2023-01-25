package lt.lhu.nb.service.impl;

import java.util.Date;

import lt.lhu.nb.entity.Note;
import lt.lhu.nb.service.DataCheckingService;
import lt.lhu.nb.service.exception.ServiceException;

public class DataCheckingServiceImpl implements DataCheckingService {

	@Override
	public boolean noteIsNotNull(Note note) throws ServiceException {
		if (note != null) {
			return true;
		}
		throw new ServiceException("Received note is null");
	}

	@Override
	public boolean contentIsNotNull(String content) throws ServiceException {
		if (content != null) {
			return true;
		}
		throw new ServiceException("Received content is null");
	}

	@Override
	public boolean dateIsNotNull(Date date) throws ServiceException {
		if (date != null) {
			return true;
		}
		throw new ServiceException("Received date is null");
	}

}
