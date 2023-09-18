package Recursion;
import java.util.*;
public class nthFibonacciNumber {
    static int nfn(int n) {
        if (n == 0 || n == 1) return n;

        return nfn(n - 1) + nfn(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nfn(n));

    }
}
