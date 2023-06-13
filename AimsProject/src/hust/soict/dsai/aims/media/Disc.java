package aims.media;

public class Disc extends Media {
    private String director;
    private int length;
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public Disc() {
		super();
	}
		
	public Disc(int id, String title) {
		super();
	}
	public Disc(int id, String title, String category) {
		super();
	}
	public Disc(int id, String title, String category, float cost) {
		super();
	}
	public Disc(int id, String title, String category, String director, float cost) {
		super();
        this.director = director;
	}
	public Disc(int id, String title, String category, String director, int length, float cost) {
		super();
        this.director = director;
        this.length = length;
	}
    
}
