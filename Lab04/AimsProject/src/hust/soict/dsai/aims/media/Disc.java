package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;
	private String director;
	private static int nbDiscs = 0;
	
	public Disc() {
		super();
	}
	
	public Disc(String title, String category, String director, int length, float cost) {
		super (nbDiscs++, title, category, cost);
		this.length = length;
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public static int getNbDiscs() {
		return nbDiscs;
	}

	public static void setNbDiscs(int nbDiscs) {
		Disc.nbDiscs = nbDiscs;
	}
	
	
}
