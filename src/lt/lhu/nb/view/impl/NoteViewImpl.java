package lt.lhu.nb.view.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import lt.lhu.nb.entity.Note;
import lt.lhu.nb.view.NoteView;

public class NoteViewImpl implements NoteView {

	@Override
	public void view(List<Note> note) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		for (Note n : note) {
			System.out.println(n.getContent() + " " + format.format(n.getDate()));
		}
		
	}

}
