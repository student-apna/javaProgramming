package PatternsInJava;

public class inverted_triangle {
    public static void main(String[] args) {


        int n = 5;
        int nsp = 0;
        int nst = 2 * n - 1;
        for (int i = 1; i <= n; i++) {

            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nst-=2;
            nsp++;
        }
    }
}


