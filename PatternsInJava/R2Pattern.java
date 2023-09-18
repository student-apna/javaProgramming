package PatternsInJava;

public class R2Pattern {
    public static void main(String[] args) {
        int  n=5;
        int k=1;
        int num = (n%2==0)?n-1:n;
        for(int i=1; i<=n; i++){
            if((i<=n/2 && n%2==0)|| (i<=n/2+1 && n%2!=0)) {
                System.out.println(num);
                num -= 2;
            }
            else {
                System.out.println(k*2);
                ++k;
            }

        }
    }
}
