import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class DayOfMonth {
    public static void check(){
        Scanner input = new Scanner(System.in);
        System.out.print("input month: ");
        String month = input.nextLine();
        System.out.print("input year: ");
        int year = input.nextInt();
        String[] monthsWith31Days ={"January", "Jan.", "Jan", "1", "March", "Mar.", "Mar", "3", "May", "May", "5", "July", "Jul.", "Jul", "7", "August", "Aug.", "Aug", "8", "October", "Oct.", "Oct", "10", "December", "Dec.", "Dec", "12"};
        String[] monthsWith30Days = {"April", "Apr", "Apr.", "4",
                             "June", "Jun", "Jun.", "6",
                             "September", "Sept", "Sept.", "9",
                             "November", "Nov", "Nov.", "11"};
        String[] Feb ={"Feb","Feb.","2","February"};
        if (Arrays.asList(monthsWith31Days).contains(month)){System.out.println(month+" has 31 days");}
        else if (Arrays.asList(monthsWith30Days).contains(month)){System.out.println(month+" has 30 days");}
        else if (Arrays.asList(Feb).contains(month)){
            boolean is_leap_year = false;
            if (year % 4 == 0) {
                is_leap_year = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        else
            is_leap_year = false;
        if (!is_leap_year)
            System.out.println(month + " has 28 days");
        else
            System.out.println(month + " has 29 days");
        }
        else{
            System.out.println("Error! ");
            check();

        }
    }
    public static void main(String args[]){
        check();
    }
}
