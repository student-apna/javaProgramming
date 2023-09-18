package Recursion;

public class Swap_Using_XOR {
    public static void main(String[] args) {
        int a=10,b=20;
        a = a^b; // properties  x^x==0  and x^0==x   .. XOR associative hota hai;
        b = b^a;  //  b= b^(a^b) >- b = b^b^a  >- b =a aa gya hai;
        a = a^b;  // a = (a^b)^a  >= a^a^b >- a=b a mein b aa gya hai;
        System.out.println(a);
        System.out.println(b);

    }
}
