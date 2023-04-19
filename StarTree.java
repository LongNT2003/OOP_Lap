
import java.util.Scanner;
public class StarTree{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input n: ");
        int n = keyboard.nextInt();
        for (int i=1;i<=n;i++){
            for (int m = 0; m <=n-i; m++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
        System.out.println();
        }
    }

}
