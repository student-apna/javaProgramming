package Recursion;

public class calculateGcd {
    static int gcd(int a, int b){
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {

        System.out.println(gcd(12,18));
        System.out.println((12*18)/gcd(12,18));
    }
}
