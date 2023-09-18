package JavaMethods;

public class primes {
    public static void main(String[] args) {
        int n=15;
        for(int i=1; i<=n; i++){
            System.out.println(i+" is prime  "+isPrime(i));
        }

    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;

        }
        return true;
    }
}
