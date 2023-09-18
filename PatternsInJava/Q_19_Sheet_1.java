package PatternsInJava;

public class Q_19_Sheet_1 {
    public static void main(String[] args) {
        int n=7;
        int row=1;
        int nst1=n/2+1;
        int nsp=-1;
        int nst2=n/2;
        while(row<=n) {
            for (int i = 1; i <= nst1; i++) {
                System.out.print("* ");
            }
            for (int i = 1; i <= nsp; i++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= nst2; j++) {
                System.out.print("* ");
            }
            System.out.println();
            row++;
        }
    }
}
