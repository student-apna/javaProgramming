package PatternsInJava;

public class Q_10Sheet1 {
    public static void main(String[] args) {
        int n=5;
        int nsp=0;
        int nst=2*n-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<nsp; j++){
                System.out.print("  ");
            }
            for(int j=0; j<nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp++;
            nst-=2;
        }
    }
}
