package PatternsInJava;
import java.util.*;

public class numberTriangle {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int num = 0, middle = 0, count = 0;
                for (int row = 1; row <= n; row++) {
                    middle = 0;
                    for (int i = 1; i < n - row + 1; i++) {
                        System.out.print("   ");
                    }
                    num = row;
                    count = row;
                    // System.out.println((2*row)-1);
                    for (int i = 1; i <= ((2 * row) - 1); i++) {
                        System.out.print(num + "  ");

                        if (count == (2 * row) - 1) {
                            middle = 1;
                        }
                        if (middle == 1) {
                            num--;
                        }

                        if (middle == 0) {
                            num++;
                        }
                        count++;


                    }
                    System.out.println();

                }

            }

        }
