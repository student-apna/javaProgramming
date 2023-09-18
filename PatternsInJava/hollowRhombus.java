package PatternsInJava;

public class hollowRhombus {
    public static void main(String[] args) {
        int n=5;
        int nsp=n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print(" ");

            }
            for(int j=1; j<=n; j++){
                if(i==1|| i==n ||j==1||j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            nsp--;

        }
    }
}
