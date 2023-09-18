package PatternsInJava;

public class Q_16_Sheet_1 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=n;
        int nsp=0;
        while(row<=2*n-1){
            for(int i=1; i<=nsp; i++){
                System.out.print("  ");
            }
            for(int i=1; i<=nst; i++){
                System.out.print("* ");
            }
            System.out.println();
            row++;
            if(row<=n){
                nsp+=2;
                nst--;
            }
            else{
                nsp-=2;
                nst++;
            }
        }
    }
}
