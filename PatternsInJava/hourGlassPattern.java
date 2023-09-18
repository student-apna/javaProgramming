package PatternsInJava;
import java.util.*;

public class hourGlassPattern {
    public static void main(String[] args) {
 // for n=5
//        5 4 3 2 1 0 1 2 3 4 5
//         4 3 2 1 0 1 2 3 4
//           3 2 1 0 1 2 3
//             2 1 0 1 2
//               1 0 1
//                 0
//               1 0 1
//             2 1 0 1 2
//           3 2 1 0 1 2 3
//         4 3 2 1 0 1 2 3 4
//       5 4 3 2 1 0 1 2 3 4 5





                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                //MODE
                int space=0;
                int nst=n+1;

                int countz=0;

                int count=0;
                //ROWS
                for (int i = 1; i <=n*2+1 ; i++)
                {
                    //SPACE01
                    for (int j = 0; j < space; j++)
                    {
                        System.out.print("  ");

                    }

                    //NUMBERS
                    countz=n-space;
                    count=countz;
                    for (int k = 1; k <=2*nst-1 ; k++)
                    {
                        System.out.print(countz+" ");

                        if(count>0)
                            countz--;
                        else
                        {
                            countz++;
                        }


                        count--;
                    }
                    System.out.println();

                    //MODE BIT CHANGE
                    if(i<=n) {space++;nst--;}
                    else {space--;nst++;}


        }


    }
}
