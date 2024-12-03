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
