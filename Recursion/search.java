package Recursion;

public class search {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            int nC0 =1;
            for(int k=0; k<=n-i; k++ ){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(nC0+" ");
                nC0*= ((i-j/j+1));

            }
            System.out.println();
        }


    }
}




