package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media implements Playable {
	private String title;
	private String category;
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	public DigitalVideoDisc(String title) {
		this(title, null, null, 0, 0);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		this(title, category, null, 0, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title, category, director, 0, cost);
	}
	public DigitalVideoDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	public DigitalVideoDisc(int id, String title, String category, String director, float cost) {
		super(id, title, category, cost);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(DigitalVideoDisc.nbDigitalVideoDiscs++, title, category, cost);
		this.director = director;
		this.length = length;
	}
	public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
		super(id, title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	public String toString() {
		return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
	}
	
	public boolean isMatch(String title) {
		return this.title.equals(title);
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
