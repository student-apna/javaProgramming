package PatternsInJava;

public class Hollow_Diamond {
    public static void main(String[] args) {
        int n=5;
        int k=0;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){

               if(j<=n-2-k || j>=n+k-2){
                   System.out.print("* ");
               }
               else
                   System.out.print("  ");
            }
            System.out.println();
            if(i<=n/2){
                k++;
            }
            else{
                k--;
            }
        }
    }
}
