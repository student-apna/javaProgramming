package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int [] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,67,88};
        int [] arr = {99,87,67,56,45,32,12};
        int target = 99;
        int ans = orderAgnoBs(arr,target);
        System.out.println(ans);

    }

    static int orderAgnoBs(int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        // find whether the array in ascending or descending;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            // find the middle element
            int mid = start +(end-start)/2;
            if(arr[mid]==target) return mid;
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else {
                    start = mid +1;
                }
            }
            else {
                if(target>arr[mid]){
                    end = mid-1;
                }else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
