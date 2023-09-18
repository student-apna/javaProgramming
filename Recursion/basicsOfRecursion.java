package Recursion;
import java.util.*;

public class basicsOfRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bound digit");
        int n = sc.nextInt();
       // print(n);
        printDecreasing(n);
    }
    public static void printDecreasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
    public static void print(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
}
