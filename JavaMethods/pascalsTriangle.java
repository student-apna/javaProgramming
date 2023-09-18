package JavaMethods;

public class pascalsTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n; i++){
            int first=1;
            for(int k=0; k<=n-i; k++){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(first+"  ");
                first*= Math.ceil(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
