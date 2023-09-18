package sortingAlgorithms;

//https://leetcode.com/problems/missing-number/
public class missingNumber {
    public static void main(String[] args) {
        int []arr = {1,0,3,2};
      int ans =  missing(arr);
        System.out.println(ans);


    }
    static int missing(int []arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            // because numbers are given from 0 to n , n==arr.length;
            if( arr[i]<arr.length && arr[i]!=arr[correct]) swap(arr,i,correct);
            else i++;
        }
        for(int index =0; index<arr.length; index++){
            if(arr[index]!=index) return index;
        }
        return  arr.length;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
