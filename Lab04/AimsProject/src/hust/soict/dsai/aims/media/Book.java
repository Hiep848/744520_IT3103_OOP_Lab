package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	void addAuthor(String name) {
		boolean exists = false;
		for (String s: this.authors) {
			if (s.equals(name)) {
				exists = true;
				break;
			}
		}
		if (!exists) {
			this.authors.add(name);
		}
	}
	
	void removeAuthor(String name) {
		boolean exists = false;
		int removeId = -1;
		for (String s: this.authors) {
			if (s.equals(name)) {
				exists = true;
				break;
			}
			removeId++;
		}
		if (exists) {
			this.authors.remove(removeId);
		}
	}
}
