import java.util.Arrays;
import java.util.Scanner;
public class Calculate6_5 {
    private int[]  my_array1;
    public Calculate6_5() {
        my_array1 = new int[] { 9, 7, 1, 6, 4 };
    }
    public Calculate6_5(int[] my_array1){
        this.my_array1=my_array1;
    }
    public void SortAndSumAndAverage(){
        int[] copy = my_array1;
        Arrays.sort(copy);
        System.out.println("sorted list is: " + Arrays.toString(copy));
        int sum = Arrays.stream(copy).sum();
        System.out.println("sum of your array is: "+ sum);
        int len= copy.length;
        System.out.println("average array is: "+ (float) sum / len);

    }
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want use default array ?(1 for YES, 0 for NO) ");
        int decision = scanner.nextInt();
        if (decision==0){
            System.out.print("Enter the length of the array: ");
            int length = scanner.nextInt();
            int[] numbers = new int[length];
            for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            }
            Calculate6_5 obj =new Calculate6_5(numbers);
            obj.SortAndSumAndAverage();
        }else{
            Calculate6_5 obj =new Calculate6_5();
            obj.SortAndSumAndAverage();
        }
    }
}

