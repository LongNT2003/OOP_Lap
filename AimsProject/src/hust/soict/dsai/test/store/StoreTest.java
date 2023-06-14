package test.store;

import aims.media.DigitalVideoDisc;
import aims.store.Store;



public class StoreTest {
    public static void main(String[] args){
        Store store1 = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king", "animation","Royer Allers",87, 19.95f);
        store1.addMedia(dvd1);
        store1.removeMedia(dvd1);
    }
}
