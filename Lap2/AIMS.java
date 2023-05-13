package LAP2;
public class AIMS{
    public static void main(String[] args){
        cart order = new cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king", "animation","Royer Allers",87, 19.95f);
        order.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("star wars", "science fiction", "George Lucas", 87, 24.95f);
        order.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc( "Animation","aladin", 18.99f);
        order.addDigitalVideoDisc(dvd3);
        order.removeDigitalVideoDisc(dvd3);
        System.out.println("total cost is "+ order.totalCost());
    }
}