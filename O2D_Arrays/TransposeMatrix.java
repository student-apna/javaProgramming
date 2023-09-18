package O2D_Arrays;

import java.util.*;

public class TransposeMatrix {
    static int[][] transpose(int[][] matrix,int r,int c){
        int [][]ans = new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    static void transposeOfSquareMatrix(int[][]matrix,int r,int c){
        for(int i=0; i<c;i++){
            for(int j=i; j<r; j++){
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
        System.out.println("Enter no of rows and column:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the original array");
        printMatrix(arr);
        int [][]ans = transpose(arr,r,c);
        System.out.println("matrix after transpose");
        printMatrix(ans);
       // transposeOfSquareMatrix(arr,r,c);
       // printMatrix(arr);
        sc.close();



    }

}
