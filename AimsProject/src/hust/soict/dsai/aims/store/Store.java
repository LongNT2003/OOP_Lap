package aims.store;
import java.util.ArrayList;

import media.DigitalVideoDisc;
import media.Media;

public class Store{
    public ArrayList<Media> itemsInStore = new ArrayList<Media>(); 
    public void addMedia(Media media) {
        boolean checking = false;
        for (int i=0; i<itemsInStore.size(); i++) {
            if (media.equals(itemsInStore.get(i))) {
                System.out.println("This media has already been in the store.");
                checking = true;
                break;
            }
            else {
                checking = false;
            }
        }
        if (checking==false) {
            itemsInStore.add(media);
        }
    }
    public void removeMedia(Media media) {
        boolean checking = false;
        for (int i=0; i<itemsInStore.size(); i++) {
            if (media.equals(itemsInStore.get(i))) {
                itemsInStore.remove(media);
                checking = true;
                break;
            }
            else {
                checking = false;
            }
        }
        if (checking==false) {
            System.out.println("This media is not in the store.");
        }
    }
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public boolean searchTitle(String title){
            for (Media media: itemsInStore){
                if (media.getTitle().equals(title)){
                    return true;
                }
            }
            return false;
    
    }
    public void display(){
        for (Media media: itemsInStore){
            System.out.println(media);
        }
    }
}
