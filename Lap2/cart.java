

import java.util.ArrayList;
import java.util.List;

public class cart {
    public static final int MAX_NUMBERS_ORDERED=20;
    private List<DigitalVideoDisc> qtyOrdered; 
    public cart(){
        qtyOrdered = new ArrayList<>();
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered.size()<20){    
            qtyOrdered.add(disc);
            System.out.println(disc.getTitle()+" has been added to the cart");
        }else{
            System.out.println("your cart full");
        }    
        }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered.contains(disc)){    
            qtyOrdered.remove(disc);
            System.out.println(disc.getTitle()+" has been removed to the cart");
        }else{
            System.out.println(disc.getTitle()+" is not in cart");
        }    
    }
    public float totalCost(){
        float price =0f;
        for (DigitalVideoDisc disc: qtyOrdered){
            price=price+ disc.getCost();
        }
        return price;
    }
    
}
