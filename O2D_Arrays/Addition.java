package O2D_Arrays;
import java.util.*;

public class Addition {
    static void Print(int [][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void add(int [][]m1,int r1,int c1,int [][]m2,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Addition is not possible");
            return;
        }
        int sum [][] = new int[r1][c1];
        for(int i=0; i<sum.length; i++){
            for(int j=0; j<sum[i].length; j++){
                sum[i][j] = m1[i][j]+m2[i][j];
            }
        }
        Print(sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of the first matrix:");
        int r1 = sc.nextInt();
        System.out.println("Enter columns of the first matrix:");
        int c1 = sc.nextInt();
        System.out.println("Enter row of the second  matrix:");
        int r2 = sc.nextInt();
        System.out.println("Enter column  of the second matrix:");
        int c2 = sc.nextInt();
        int m1[][] = new int [r1][c1];
        System.out.println("Enter elements of the first matrix:");
        for(int i=0; i<m1.length; i++){
            for(int j=0; j<m1[i].length; j++){
                m1[i][j]=sc.nextInt();
            }
        }
        int m2[][] = new int [r2][c2];
        System.out.println("Enter elements of the second  matrix:");
        for(int i=0; i<m2.length; i++){
            for(int j=0; j<m2[i].length; j++){
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix1:");
        Print(m1);
        System.out.println("Matrix2:");
        Print(m2);
        System.out.println("Sum of the Matrices:");
        add(m1,r1,c1,m2,r2,c2);

    }
}
