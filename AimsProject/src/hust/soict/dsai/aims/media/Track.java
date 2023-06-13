package aims.media;

public class Track implements Playable{
    private String title;
    private int length;
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public Track(String title) {
        this.title = title;
    }
    @Override
    public void play(){
        System.out.println("p");
    }
    public String toString() {
        return "Name: " + this.getTitle() + "; Length: " + this.getLength();
    }
    @Override
    public boolean equals(Object o) {
		if (o instanceof Track) {
			Track abc = (Track) o;
			return this.getTitle().equals(abc.getTitle()) && this.getLength()==abc.getLength();
		}
		else {
			return false;
		}
	}
}
