package media;
import java.util.ArrayList;
// import java.util.List;
public class CompactDisc extends Media implements Playable {
    private String artist;
    private ArrayList<Track> tracks;
    public String getArtist() {
        return artist;
    }
    public CompactDisc(int id, String title, String category,float cost, String artist){
        super();
        this.artist=artist;
        tracks= new ArrayList<>();
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
    public void play(){
        for (Track item : tracks){
            System.out.println(item.getTitle());
            item.play();
        }
    }
}
