package ONE_D_Array;

import java.util.Arrays;

public class productArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        int [] ans = new int [arr.length];
//        int [] ans = new int[arr.length];
//       for(int i=0; i<arr.length;i++){
//           int p=1;
//           for(int j=0; j<arr.length; j++){
//               if(i!=j)
//                  p*=arr[j];
//           }
//           ans [i] = p;
//
//       }
//       for(int i=0;i<ans.length;i++){
//           System.out.print(ans[i]+" ");
//       }
        int left[] = new int [arr.length];
        left[0] = 1;
        for(int i=1; i<left.length; i++){
            left[i] = left[i-1]*arr[i-1];
        }
        System.out.println(Arrays.toString(left));
        int []right = new int [arr.length];
        right[right.length-1] = 1;
        for(int i=arr.length-2; i>=0; i--){
            right[i] = right[i+1]*arr[i+1];
        }
        System.out.println(Arrays.toString(right));


    }
}
