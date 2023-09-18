package PatternsInJava;

public class Q_22_Sheet1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n; i++){
            for(int j=1; j<=2*n-1; j++){
                if(j<=n+1-i || j>=n-1+i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
