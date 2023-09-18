package PatternsInJava;

public class Assign_triangleQ11 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        int nsp=n-1;
        int nst=1;
        while(row<=n){
            for(int i=1; i<=nsp; i++){
                System.out.print(" ");
            }
            int k=row;
            for(int j=1;j<=nst; j++ ){
                System.out.print(k);
            }
            System.out.println();
            row++;
            nst+=2;
            if(row<=n/2)
                k++;
            else
                k--;

        }

    }
}
