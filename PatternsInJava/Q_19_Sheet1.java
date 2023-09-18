package PatternsInJava;

public class Q_19_Sheet1 {
    public static void main(String[] args) {
        int n=7;
        int k=0;
        for(int i=1; i<=n; i++){
            if(i<=n/2+1)
                k++;
            else
                k--;
            for(int j=1; j<=n; j++){
                if(j<=n-2-k || j>=n-4+k){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
