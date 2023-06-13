package test.store;

import aims.store.Store;
import media.DigitalVideoDisc;



public class StoreTest {
    public static void main(String[] args){
        Store store1 = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king", "animation","Royer Allers",87, 19.95f);
        store1.addDVD(dvd1);
        store1.removeDVD(dvd1);
    }
}
