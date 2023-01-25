package lt.lhu.nb.entity;

import java.util.Date;
import java.util.Objects;

public class Note {

	private Date date;
	private String content;

	public Note() {

	}

	public Note(Date date, String content) {
		super();
		this.date = date;
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, date);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		return Objects.equals(content, other.content) && Objects.equals(date, other.date);
	}

	@Override
	public String toString() {
		return "Note [date=" + date + ", content=" + content + "]";
	}

}
