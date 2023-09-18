package PatternsInJava;

public class Q_28_Sheet1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            int k=1;
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print(k+" ");
                k = j<i?k+1:k-1;
            }
            System.out.println();
            }

        }
    }

