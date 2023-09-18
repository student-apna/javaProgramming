package PatternsInJava;

public class fibonacciPattern {
    public static void main(String[] args) {
        int n=5;
        int a=0,b=1;
        int sum=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                System.out.print(sum + " ");
                a = b;
                b = sum;
                sum = a + b;

            }

            System.out.println();


        }


    }
}
