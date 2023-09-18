package PatternsInJava;

public class Q_9Sheet1 {
    public static void main(String[] args) {
        int n=5;
        int nsp=n-1;
        int nst=1;
        for(int i=0; i<5; i++){
            for(int j=0; j<nsp; j++){
                System.out.print("  ");
            }
            for(int j=0; j<nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}
