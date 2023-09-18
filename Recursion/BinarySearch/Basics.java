package BinarySearch;
// sorted array        apply binary search
public class Basics {
    public static void main(String[] args) {
       int [] arr = {2,3,6,7,9,12,45,67,89};
       int target = 6;
       int ans1 = binarySearch(arr,target);
       int ans2 = binarySearchRecursive(arr,0,arr.length-1,target);
        System.out.println(ans1);
        System.out.println(ans2);

    }

    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            // find the middle element
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid +1;
            }else return mid;
        }
        return -1;
    }
    static int  binarySearchRecursive(int []arr,int start,int end,int target){
        if(start>end) return -1;
        int mid = start+(end-start)/2;
        if(target==arr[mid]) return mid;
        else if(target>arr[mid]){
            return binarySearchRecursive(arr,mid+1,end,target);
        }
        else return binarySearchRecursive(arr,start,mid-1,target);
    }
}
