package PatternsInJava;

public class Q_14_Sheet1 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=1;
        int nsp = n-1;
        while(row<=2*n-1){
            for(int i=1;i<=nsp;i++){
                System.out.print("  ");
            }
            for(int i=1; i<=nst; i++){
                System.out.print("* ");
            }
            System.out.println();
            row++;
            if(row<=n){
                nsp--;
                nst++;
            }
            else {
                nsp++;
                nst--;
            }

        }
    }
}
