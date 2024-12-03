package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String artist, List<Track> tracks) {
		super();
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public boolean addTrack(track newTrack) {
		if (this.tracks.contains(newTrack)) {
			return false;
		} else {
			this.tracks.add(newTrack);
			return true;
		}
	}
	
	public boolean removeTrack(Track track) {
		if(this.tracks.contains(track)) {
			this.tracks.remove(track);
			return true;
		} else {
			return false;
		}
	}
	
	
	public int getLength() {
		int totalLength = 0;
		for (Track track : this.tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}
	
	@Override
	public String toString() {
		String res = this.getId() + ". Compact Disc (CD): \n";
		if (this.getTitle() != null) {
			res += "Title: " + this.getTitle() + "\n";
		}
		if (this.getCategory() != null) {
			res += "Category: " + this.getCategory() + "\n";
		}
		if (this.getDirector() != null) {
			res += "Director: " + this.getDirector() + "\n";
		}
		if (this.getLength() != 0) {
			res += "Total legnth: " + this.getLength() + "\n";
		}
		if (this.getCost() != 0.0f) {
			res += "Cost: " + this.getCost();
		}
		return res;
	}
}