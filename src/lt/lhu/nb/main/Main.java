package lt.lhu.nb.main;

import lt.lhu.nb.controller.Controller;
import lt.lhu.nb.view.impl.NoteViewImpl;

public class Main {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		
		NoteViewImpl notesView = new NoteViewImpl();
		
		System.out.println(controller.executeTask("ADD_NOTE"));

	}

}
