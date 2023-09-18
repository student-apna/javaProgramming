package JavaMethods;

public class sqrt {
    public static void main(String[] args) {
        int n=121;
        System.out.println(Sqrt(n));

    }
    static int Sqrt(int n){
        int m=0;
        for(int i=1; i<=n; i++){
            if(i*i==n)  m=i;
        }
        return m;

    }
}
