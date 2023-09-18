package ONE_D_Array;
import java.util.*;

public class pairSum {
    static int PairSum(int [] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int index = 0; index < n; index++) {
            for (int j = index + 1; j < n; j++) {
                if (arr[index] + arr[j] == target) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int []arr= new int[n];
        System.out.println("enter"+ n + "elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target sum");
        int target=sc.nextInt();
        System.out.println(PairSum(arr,target));
    }
}
