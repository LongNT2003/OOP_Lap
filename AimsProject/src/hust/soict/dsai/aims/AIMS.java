package aims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import aims.cart.Cart;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;
import aims.media.Media;
import aims.store.Store;

public class AIMS{
    private static Scanner scanner = new Scanner(System.in);
	private static Store store;
    private static Cart cart;
	public static void main(String[] args) {
		store = new Store();
        cart = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		store.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
				"Animation", 18.99f);
		store.addMedia(dvd3);
		showMenu();	
	}
    public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
        System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
        int option = scanner.nextInt();
		scanner.nextLine();
		switch (option){
			case 1:
				viewStore();
				break;
			case 2:
				updateStore();
				break;
			case 3:
				seeCurrentCart();
				break;
			case 0:
				System.out.println("You are exitted.");
				break;
		}
		
	}
    //option 1
    private static void viewStore(){
		for (Media item: store.getItemsInStore()){
			System.out.println(item);
		}
		storeMenu();
	}
    public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
        scanner.nextLine();

		switch (option){
			case 1:
				seeMediaDetail();
				break;
			case 2:
				addMedia2Cart();
				break;
			case 3:
				playMedia();
				break;
			case 4:
				currentCart();
				break;
			case 0:
				showMenu();
				break;
		}
		storeMenu();
    }
    //option 1.1
    private static void seeMediaDetail(){
			System.out.println("Enter title of media: ");
			String title = scanner.nextLine();
			boolean isInStore = false;
			for (Media media: store.getItemsInStore()){
				if (media.getTitle().equals(title)){
					Media yourMedia = media;
					isInStore = true;
					System.out.println(media);
					mediaDetailsMenu(yourMedia);
				}
			}
			if (!isInStore){
				System.out.println("This media is not in the store.");
				
			}
			storeMenu();
	}
    public static void mediaDetailsMenu(Media media) {
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Add to cart");
			System.out.println("2. Play");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");

			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option){
				case 1:
					cart.addMedia(media);
					break;
				case 2:
					if (media instanceof CompactDisc){
						CompactDisc castMedia = (CompactDisc) media;
						castMedia.play();
					} else if ( media instanceof DigitalVideoDisc){
						DigitalVideoDisc castMedia = (DigitalVideoDisc) media;
						castMedia.play();
					} else {
						System.out.println("This media can not display.");
						mediaDetailsMenu(media);
					}
				case 0:
					
					break;
			}
			storeMenu();
		}
        //Option 1.2
		private static void addMedia2Cart(){
			for (Media media: store.getItemsInStore()){
				System.out.println(media);
			}
			System.out.println("Enter title of media to add:");
			String yourTitle = scanner.nextLine();
			boolean isInStore = false;
			for (Media media: store.getItemsInStore()){
				if (media.getTitle().equals(yourTitle)){
					cart.addMedia(media);
					isInStore = true;
				}
				
			}
			if (!isInStore){
				System.out.println("This is not valid title");
				
			}
			storeMenu();
		}
    //option 1.3
    private static void playMedia(){
			System.out.println("Enter the title of media to play");
			String yourTitle = scanner.nextLine();
			boolean isInStore = false;
			for (Media media: store.getItemsInStore()){
				if (media.getTitle().equals(yourTitle)){
					isInStore = true;
					if (media instanceof CompactDisc){
						CompactDisc castMedia = (CompactDisc) media;
						castMedia.play();
					} else if ( media instanceof DigitalVideoDisc){
						DigitalVideoDisc castMedia = (DigitalVideoDisc) media;
						castMedia.play();
					} else {
						System.out.println("This media can not play");
					}
				}
			}
			if (!isInStore){
				System.out.println("Can not find media with this title");
			}
			storeMenu();
		}
    //Option 1.4
		private static void currentCart(){
			cart.show_ordered_item();
		}
   

}