package ONE_D_Array;
import java.util.*;

public class SecondMax {
    static int findMax(int [] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static int findSecondMax(int [] arr){
        int mx = findMax(arr);
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]== mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int smax = findMax(arr);
        return smax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println(" enter " + n+" elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(" Second Maximum Element: "+ findSecondMax(arr));
    }
}
