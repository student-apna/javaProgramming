package PatternsInJava;

public class Q_33_Sheet1 {
    public static void main(String[] args) {
        int n = 10;
        int row = 1;
        int nsp = n - 1;
        while (row <= n) {
            for (int i = 1; i <= nsp; i++) {
                System.out.print("  ");
            }
            for (int i = n - row + 1; i <= 9; i++) {
                System.out.print(i + " ");
            }
            System.out.print("0 ");
            for (int i = 9; i >= n - row + 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            row++;
            nsp--;


        }
    }
}
