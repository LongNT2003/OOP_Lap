package test.cart;



import aims.cart.Cart;
import aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args){
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king", "animation","Royer Allers",87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("star wars", "science fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation","aladin", 18.99f);
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        cart.show_ordered_item();
        cart.searchMedia("the lion king");
        cart.searchMedia(3);
    }
}
