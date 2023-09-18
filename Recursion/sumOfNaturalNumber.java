package Recursion;

public class sumOfNaturalNumber {
    // sum of natural numbers up to n
    // 1+2+3+4+5.......+(n-1)+n
    static int printSum(int n){
        if(n==0) return 0;
        return printSum(n-1)+n;


    }
    // sum of natural numbers with alternate sign up to n ;
    // 1-2+3-4+5.......(-1)^n n
    static int altSum(int n){
        if(n==0) return 0;
        if (n % 2 == 0) {

            return altSum(n - 1) - n;
        }
        return altSum(n-1)-n;
    }
    public static void main(String[] args) {
        //System.out.println(printSum(5));
        System.out.println(altSum(10));

    }
}
