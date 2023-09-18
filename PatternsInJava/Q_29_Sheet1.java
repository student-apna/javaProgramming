package PatternsInJava;

public class Q_29_Sheet1 {
    public static void main(String[] args) {
        int n=5;
        int nst=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                if(j==1 || j==2*i-1)
                {
                    System.out.print(i+" ");
                }
                else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
            nst+=2;
        }
    }
}
