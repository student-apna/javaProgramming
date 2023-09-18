package JavaMethods;

public class basicsOfMethods {
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    static int digits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=12345;
        System.out.println("The reverse number of the given number "+reverse(n));
        System.out.println("The total number of digits in the given number "+digits(n));




    }


}
