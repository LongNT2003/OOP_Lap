package aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    // private int id;
    // private String title;
    // private String category;
    // private float cost;
    private String director;
    private int length;
    
    public static int nbDigitalVideoDiscs = 0;
    public DigitalVideoDisc(String title){
        super();
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title,String category, float cost){
        super();
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title,String category,String director,int length, float cost){
        super();
        this.director=director;
        this.length = length;
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
        
    }
    public DigitalVideoDisc(String title,String category,String director, float cost){
        super();
        this.director=director;
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);

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
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }
    public void play(){
        System.out.println("p");
    }
}
