package PatternsInJava;

public class Q_18_Sheet1 {
    public static void main(String[] args) {
        int n=7;
        int row=1;
        int nsp=n/2;
        int nst=1;
        while(row<=n){
            for(int i=1; i<=nsp; i++){
                System.out.print("  ");
            }
            for(int i=1; i<=nst; i++){
                System.out.print("* ");
            }
            System.out.println();
            row++;
            if(row<=n/2+1){
                nsp--;
                nst+=2;
            }
            else{
                nsp++;
                nst-=2;
            }
        }
    }
}
