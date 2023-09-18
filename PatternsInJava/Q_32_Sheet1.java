package PatternsInJava;

public class Q_32_Sheet1 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=1;
        int k=1;
        while(row<=(2*n)-1) {
            for (int i = 1; i <= nst; i++) {
                 if(i%2!=0) System.out.print(k+" ");
                 else System.out.print("* ");
            }
            System.out.println();
            row++;
            if (row <= n ) {
                nst += 2;
                k++;
            }
            else {
                nst-=2;
                k--;
            }
        }

    }
}
