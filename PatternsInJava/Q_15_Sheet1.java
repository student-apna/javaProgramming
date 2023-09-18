package PatternsInJava;

public class Q_15_Sheet1 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nsp=0;
        int nst=n;
        while(row<=2*n-1){
            for(int i=1; i<=nsp;i++){
                System.out.print("  ");
            }
            for(int i=1; i<=nst;i++){
                System.out.print("* ");
            }
            System.out.println();
            row++;
            if(row<=n){
                nst--;
                nsp+=2;
            }
            else{
                nst++;
                nsp-=2;
            }
        }
    }
}
