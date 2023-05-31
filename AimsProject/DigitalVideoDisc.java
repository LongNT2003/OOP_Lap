package LAP2;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public static int nbDigitalVideoDiscs = 0;
    public int id;
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
    public void setTitle(String title1){
        this.title=title1;
    }
    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }
    public float getCost(){
        return cost;
    }
}
