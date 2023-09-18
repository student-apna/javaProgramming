package PatternsInJava;
import java.util.*;

public class invertedNumberTraingle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - k - 2 || j >= n + k - 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
            if (i <= n / 2)
                k++;
            else
                k--;


        }
    }
}
