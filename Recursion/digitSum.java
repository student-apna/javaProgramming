package Recursion;
import java.util.*;
public class digitSum {
    // sum of digits in a given number
    static int sumOfDigits(int n){
        if(n>=0 && n<=9) return n;
        return sumOfDigits(n/10)+n%10;
    }
    // count number of digits in a given number;
    static int cOd(int n){
        if(n>=0 && n<=9) return 1;
        return cOd(n/10)+1;
    }
    // calculate the factorial of a given number;
    static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
        System.out.println(cOd(n));
        System.out.println(fact(n));
    }
}
