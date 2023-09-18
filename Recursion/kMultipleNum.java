package Recursion;
public class kMultipleNum {
    static void mOk(int n,int k){
        if(k==0) return;
          mOk(n,k-1);
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int n = 12,k=5;
           mOk(n,k);
    }
}

