package aims.media;
import java.util.ArrayList;
public class CompactDisc extends Media implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public String getArtist() {
        return artist;
    }
    public CompactDisc(int id, String title, String category,float cost, String artist,ArrayList<Track> tracks){
        super();
        this.artist=artist;
        this.tracks=tracks;
    }
    public CompactDisc(int id, String title, String category, float cost, String artist) {
        super(id, title,category, cost);
        this.artist = artist;
    }
    public void addTrack(Track order){
        if (tracks.contains(order)){System.out.println("track already in list of tracks");}
        else{tracks.add(order);System.out.println("track was added to list");}
    }
    public void removeTrack(Track order){
        if (tracks.contains(order)){tracks.remove(order);System.out.println("track was removed from list");}
        else{System.out.println("track does not on the list");}
    }
    public int getLength(){
        int tracks_length=0;
        for (Track item : tracks){
            tracks_length=tracks_length+item.getLength();
        }
        return tracks_length;
    }
    @Override
    public void play(){
        for (Track item : tracks){
            System.out.println(item.toString());
            item.play();
        }
    }
    public String toString() {
        return "CD info: " + this.getId()
        + " - " + this.getTitle()
		+ " - " + this.getCategory()
		+ " - " + this.getArtist()
		+ " - " + this.tracks
		+ ": " + this.getCost() + " $";
	}
}
