package PatternsInJava;

public class classRoomProgram {
    public static void main(String[] args) {
        int n=5;
        int nst=n;
        int nsp=0;
        int row=1;
        while(row<=((2*n)-1)){
            for(int i=1; i<=nsp; i++){
                System.out.print("  ");
            }
            for(int i=1; i<=nst; i++){
                System.out.print("* ");
            }
            if(row<n){
                nst--;
                nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }
            System.out.println();
            row++;

        }




    }
}
