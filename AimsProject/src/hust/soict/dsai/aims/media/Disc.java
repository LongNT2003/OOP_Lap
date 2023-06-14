package aims.media;

public class Disc extends Media {
    private String director;
    private int length;
	
    public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public Disc() {
		super();
	}
	public Disc(int id) {
		super(id);
	}
	public Disc(int id, String title) {
		super(id, title);
	}
	public Disc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.director = director;
		this.length = length;
	}
	public Disc(int id, String title, String category) {
		super(id,title,category);
	}
	public Disc(int id, String title, String category, float cost) {
		super(id,title,category,cost);
	}
	public Disc(int id, String title, String category, String director, float cost) {
		super(id,title,category,cost);
        this.director = director;
	}
	public Disc(int id, String title, String category, String director, int length, float cost) {
		super(id,title,category,cost);
        this.director = director;
        this.length = length;
	}
    
}
