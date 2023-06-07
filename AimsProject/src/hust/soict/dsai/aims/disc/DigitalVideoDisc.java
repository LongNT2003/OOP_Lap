package LAP2;

public class DigitalVideoDisc {
    
    private String category;
    private String director;
    private int length;
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }
    private float cost;
    public static int nbDigitalVideoDiscs = 0;
    public int id;
    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public DigitalVideoDisc(String title){
        this.title=title;
        nbDigitalVideoDiscs++;
        id=nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title,String category, float cost){
        this.title=title;
        this.category=category;
        this.cost=cost;
        nbDigitalVideoDiscs++;
        id=nbDigitalVideoDiscs;
        
    }
    public DigitalVideoDisc(String title,String category,String director,int length, float cost){
        this.director=director;
        this.title=title;
        this.category=category;
        this.cost=cost;
        this.length=length;
        nbDigitalVideoDiscs++;
        id=nbDigitalVideoDiscs;
        
    }
    public DigitalVideoDisc(String title,String category,String director, float cost){
        this.director=director;
        this.title=title;
        this.category=category;
        this.cost=cost;
        nbDigitalVideoDiscs++;
        id=nbDigitalVideoDiscs;
        
    }
}
