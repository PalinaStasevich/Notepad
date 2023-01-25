package lt.lhu.nb.dal.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import lt.lhu.nb.dal.NotesDAO;
import lt.lhu.nb.dal.exception.DAOException;
import lt.lhu.nb.entity.Note;

public class FileNotesDAO implements NotesDAO {

	private List<Note> notes = new ArrayList<Note>();

	private static final String SOURCE_PATH = ".\\resourses\\notes.txt";

	public FileNotesDAO() {

	}

	@Override
	public List<Note> load() throws DAOException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try (FileReader fr = new FileReader(SOURCE_PATH); BufferedReader reader = new BufferedReader(fr);) {
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				Note note = new Note();

				String date = reader.readLine();
				note.setDate(sdf.parse(date));

				String textNote = reader.readLine();
				note.setContent(textNote);

				notes.add(note);
			}

		} catch (IOException e) {
			throw new DAOException("error message", e);
		} catch (ParseException e) {
			throw new DAOException("error message", e);
		}
		return notes;
	}

	@Override
	public void save(Note note) {
		notes.add(note);
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(SOURCE_PATH));
			SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
			for (Note n : notes) {
				writer.write(n.getContent() + " " + format.format(n.getDate()) + "\n");
			}
		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				throw new DAOException(e);
			}
		}

	}
}
