package LAP2;

import java.util.ArrayList;
import java.util.List;

public class cart {
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
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
            if (qtyOrdered.size()<(20-dvdList.length)){    
                for (DigitalVideoDisc item : dvdList){
                    qtyOrdered.add(item);
                    System.out.println(item.getTitle()+" has been added to the cart");
                };
                
            }else{
                System.out.println("your cart full");
            }
            
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
            if (qtyOrdered.size()<20){    
                qtyOrdered.add(dvd1);
                qtyOrdered.add(dvd2);
                System.out.println(dvd1.getTitle()+" and "+dvd2.getTitle()+" has been added to the cart");
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
    public void show_ordered_item(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (DigitalVideoDisc item : qtyOrdered){
            System.out.println(item.id+". DVD"+" - "+item.getTitle()+" - "+item.getCategory()+" - "+item.getDirector()+" - "+item.getLength()+": "+item.getCost()+" $");
        }
        System.out.println("Total cost: "+this.totalCost());
    }
    public void searchDVD(int identify){
        boolean found = false;
        for (DigitalVideoDisc item : qtyOrdered){
            if (item.id==identify){
                found=true;
                System.out.println(item.id+". DVD"+" - "+item.getTitle()+" - "+item.getCategory()+" - "+item.getDirector()+" - "+item.getLength()+": "+item.getCost()+" $");
                break;
                }
        }
        if (!found){
            System.out.println("no match is found");
        }
    }
    public void searchDVD(String title_search){
        boolean found = false;
        for (DigitalVideoDisc item : qtyOrdered){
            if (item.getTitle().equals(title_search)){
                found=true;
                System.out.println(item.id+". DVD"+" - "+item.getTitle()+" - "+item.getCategory()+" - "+item.getDirector()+" - "+item.getLength()+": "+item.getCost()+" $");
                break;
                }
        }
        if (!found){
            System.out.println("no match is found");
        }
    }
}
