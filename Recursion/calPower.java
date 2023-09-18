package Recursion;
import java.util.*;
public class calPower {
    static int calP(int x, int n){
         if(n==0) return 1;
         if(x==0) return 0;
        int xnp = calP(x,n-1);
        return x*xnp;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and n values");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(calP(x,n));

    }
}
