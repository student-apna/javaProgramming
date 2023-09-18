package O2D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {
    static void printMatrix(int [][]arr){
        for(int [] x:arr){
            System.out.println(Arrays.toString(x));
        }
    }
    static void printSpiralOrder(int [][]arr, int r, int c){
        int tr =0,br = r-1,lc = 0,rc =c-1;
        int total = 0;
        while(total<r*c){
            // topRow -> leftCol to rightCol
            for(int j=lc; j<=rc && total<r*c ; j++){
                System.out.print(arr[tr][j]+" ");
                total++;
            }
            tr++;
            for(int i =tr; i<=br && total<r*c; i++){
                System.out.print(arr[i][rc]+" ");
                total++;
            }
            rc--;
            for(int j =rc; j>=lc && total<r*c; j--){
                System.out.print(arr[br][j]+" ");
                total++;
            }
            br--;
            for(int i=br; i>=tr && total<r*c; i--){
                System.out.print(arr[i][lc]+" ");
                total++;
            }
            lc++;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows ans columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][]arr = new int [r][c];
        System.out.println("enter "+r*c+" elements:>");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the original matrix is given below");
        printMatrix(arr);
        System.out.println("spiral printing");
        printSpiralOrder(arr,r,c);

    }
}
