package lt.lhu.nb.service;

import lt.lhu.nb.service.impl.NotesCreateServiceImpl;
import lt.lhu.nb.service.impl.NotesFindServiceImpl;

public class ServiceProvider {
	
	private static final ServiceProvider instance = new ServiceProvider();

	private final NotesCreateService createService = new NotesCreateServiceImpl();
	private final NotesFindService findService = new NotesFindServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public NotesCreateService getCreateService() {
		return createService;
	}

	public NotesFindService getFindService() {
		return findService;
	}

}
