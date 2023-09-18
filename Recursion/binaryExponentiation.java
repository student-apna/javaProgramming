package Recursion;

public class binaryExponentiation {
    static int binExp(int a, int b){
        int ans=1;
        while(b!=0){
            if(((b&1)!=0))  ans*=a;     // b&1!=0 --odd check kr rha hai
            a=a*a;
            b = b>>1;    // same as b/=2
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(binExp(2,5));
    }
}
