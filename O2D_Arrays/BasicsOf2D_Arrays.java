package O2D_Arrays;
import java.util.*;

public class BasicsOf2D_Arrays {
    static void printArray(int [][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = new int[3][3];
        System.out.println("Enter elements of the matrix");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        printArray(arr);


    }
}
