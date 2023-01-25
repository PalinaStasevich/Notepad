package lt.lhu.nb.service.exception;

import lt.lhu.nb.dal.exception.DAOException;

public class ServiceException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String message, DAOException e) {
		super(message);
	}

	public ServiceException(DAOException e) {
		super(e);
	}
	
	public ServiceException(Exception e) {
		super(e);
	}

}
