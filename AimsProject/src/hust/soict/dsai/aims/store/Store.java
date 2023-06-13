package aims.store;
import java.util.ArrayList;
import java.util.List;

import media.DigitalVideoDisc;

public class Store {
    private List<DigitalVideoDisc> itemsINStore;
    public Store(){
        itemsINStore = new ArrayList<>();
    }   
    public void addDVD(DigitalVideoDisc dvd){
        itemsINStore.add(dvd);
    } 
    public void removeDVD(DigitalVideoDisc dvd){
        itemsINStore.remove(dvd);
    } 
}
