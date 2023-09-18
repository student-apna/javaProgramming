package PatternsInJava;

public class Q_17_Sheet1 {
    public static void main(String[] args) {
        int n=7;
        int row=1;
        int nsp1=0;
        int nsp2=1;
        int nst1=n/2;
        int nst2=n/2;
       while(row<=n){
           for(int i=1; i<=nst1;i++){
               System.out.print("* ");
           }
           for(int i=1; i<=nsp1;i++){
               System.out.print("  ");
           }
           for(int i=1; i<=nsp2; i++){
               System.out.print("  ");
           }
           for(int i=1; i<=nst2; i++){
               System.out.print("* ");
           }
           System.out.println();
           row++;
           if(row<=n/2+1){
               nst1--;
               nsp1++;
               nsp2++;
               nst2--;
           }
           else{
               nst1++;
               nsp1--;
               nsp2--;
               nst2++;
           }
       }
    }
}
