package Recursion;

public class bitManipulation {
    public static void main(String[] args) {
         int a=100;
         if((a&1)==0) System.out.println("Even");
        else System.out.println("odd");
        System.out.println(a>>1);// right shift-- a divide by 2
        System.out.println(a<<1);// left shift-- a multiply by 2

    }
}
