package BinarySearch;

public class FindFirstOcurrence {
    public static void main(String[] args) {
        int []arr = {1,3,4,5,5,5,7};
        int x =5;
        System.out.println("index of the first occurrence : "+firstIndex(arr,x));
        System.out.println("index of the last occurrence :  "+lastIndex(arr,x));

    }

    static int firstIndex(int []arr ,int target){
        int start = 0;
        int end = arr.length-1;
        int fo = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                fo = mid;
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else end = mid-1;
        }
        return fo;
    }
    static int lastIndex(int []nums ,int target){
        int start = 0;
        int end = nums.length-1;
        int l = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == nums[mid]){
                l = mid;
                start = mid+1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else end = mid-1;
        }
        return l;
    }
}
