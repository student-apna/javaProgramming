package PatternsInJava;

public class Q_13_Sheet1 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=1;
        while(row<=2*n-1){
            for(int i=1; i<=nst; i++){
                System.out.print("* ");
            }
            System.out.println();
            row++;
            if(row<=n)
                nst++;
            else
                nst--;
        }
    }
}
