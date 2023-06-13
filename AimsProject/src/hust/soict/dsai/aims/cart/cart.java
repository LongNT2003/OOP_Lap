package aims.cart;
import java.util.ArrayList;

import aims.media.Media;
public class Cart {
    public static final int MAX_ORDERED=20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public void addMedia(Media media){
        boolean checking=true;
        for (Media item : itemsOrdered){
            if (item.equals(media)){
                System.out.println("media already in cart!");
                checking=false;
                break;
            }
        }
        if (checking){itemsOrdered.add(media);}
    }
    public void removeMedia(Media media){
        if (itemsOrdered.contains(media)){itemsOrdered.remove(media);}
        else{System.out.println("item has never been in cart");}
    }
    public float totalCost(){
        float price =0f;
        for (Media disc: itemsOrdered){
            price=price+ disc.getCost();
        }
        return price;
    }
    public void show_ordered_item(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int i =1;
        for (Media item : itemsOrdered){
            System.out.println(i + ". " + item.toString());
            i++;
        }
        System.out.println("Total cost: "+totalCost());
    }
    public void searchMedia(int identify){
        boolean found = false;
        for (Media item : itemsOrdered){
            if (item.getId()==identify){
                found=true;
                System.out.println(item.toString());
                break;
                }
        }
        if (!found){
            System.out.println("no match is found.");
        }
    }
    public void searchMedia(String title_search){
        boolean found = false;
        for (Media item : itemsOrdered){
            if (item.getTitle().equals(title_search)){
                found=true;
                System.out.println(item.toString());
                break;
                }
        }
        if (!found){
            System.out.println("no match is found");
        }
    }
    
}
