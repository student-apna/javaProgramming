package ONE_D_Array;

import java.util.*;

public class arrayReference {
    static void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array is:");
        printArray(arr);
//        int []arr_2 = arr.clone();
        int []arr_2 = Arrays.copyOf(arr,arr.length);
        System.out.println("The copied array is:");
        printArray(arr_2);
        // changing some values of array2
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original array after changing arr_2");
        printArray(arr);
        System.out.println("copied arr_2 after changing array2");
        printArray(arr_2);

    }
}
