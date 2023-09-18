package PatternsInJava;
import java.util.*;

public class DoubleSidedArrow {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                int space=(n-1)*2;
                int nst=1;

                for(int i=1;i<=n;i++)
                {
                    for (int j = 1; j <=space; j++) {
                        System.out.print(" ");
                    }
                    for(int j=nst;j>=1;j--)
                    {
                        System.out.print(j+" ");
                    }
                    for (int j = 0; j <(n-1)*2-space-1 ; j++) {
                        System.out.print(" ");
                    }
                    if(i>1&&i<n)
                        for (int j = 1; j <=nst ; j++) {
                            System.out.print(j+" ");
                        }

                    if(i<=n/2) {space-=4;nst++;}
                    else {space+=4;nst--;}


                    System.out.println();

        }

    }
}
