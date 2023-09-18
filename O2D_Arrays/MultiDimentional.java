package O2D_Arrays;

import java.util.Arrays;
import java.util.*;
public class MultiDimentional {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int [][]arr = new int [3][3];
          for(int i=0; i<arr.length; i++){
              for(int j=0; j<arr[i].length; j++){
                  arr[i][j] = sc.nextInt();
              }
          }
          // enhanced for loop
        System.out.println("first way to print matrix");
          // data type of every single element itself an array
          for(int []a : arr){
              System.out.println(Arrays.toString(a));
          }
        System.out.println("second way to print matrix");
          for(int i=0; i<arr.length; i++){
              System.out.println(Arrays.toString(arr[i]));
          }
    }
}
