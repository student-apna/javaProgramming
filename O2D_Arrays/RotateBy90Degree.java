package O2D_Arrays;

import java.util.Scanner;

public class RotateBy90Degree {
    static void transposeOfSquareMatrix(int[][]matrix,int n){
        for(int i=0; i<n;i++){
            for(int j=i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void printMatrix(int [][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows or column:");
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("matrix after transpose");

        // transposeOfSquareMatrix(arr,r,c);
        // printMatrix(arr);
        sc.close();
    }
}
