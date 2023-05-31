import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class AddMatrix {
    int[][] matrixA;
    int[][] matrixB;
    public AddMatrix(){
        matrixA= new int[][] {{1,2},{4,3}};
        matrixB= new int[][] {{5,2},{1,6}};
    }
    public AddMatrix(int[][] a,int[][] b){
        this.matrixA=a;
        this.matrixB=b;
    }
    public void AddFunction(){
    int[][] anwser= new int[matrixA.length][matrixA.length];    
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                anwser[i][j]=matrixA[i][j]+matrixB[i][j];
            }            
        }
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(anwser[i][j]);
                System.out.print(" ");
            }            
        System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Default matrix or enter your matrix?(1 for enter your matrix, 0 for default) ");
        int decision =keyboard.nextInt();
        if (decision==1){
            System.out.print("matrix lenght ");
            int len =keyboard.nextInt();
            int[][] array1=new int[len][len];
            int[][] array2=new int[len][len];
            System.out.print("matrix A ");
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    array1[i][j] = keyboard.nextInt();
                }
            }
            System.out.print("matrix B ");
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    array2[i][j] = keyboard.nextInt();
                }
            }
            AddMatrix obj =new AddMatrix(array1, array2);
            obj.AddFunction();
            }else{
                AddMatrix obj = new AddMatrix();
                obj.AddFunction();
        }
    }
}
