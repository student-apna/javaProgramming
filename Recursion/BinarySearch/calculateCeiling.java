package BinarySearch;
// ceiling = smallest element in array greater 0r = to target
public class calculateCeiling {
    public static void main(String[] args) {
        int[] arr = {12, 13, 34, 45, 65, 78};
        int target = 75;
        int ans = ceil(arr, target);
        System.out.println(ans);

    }

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            // find the middle element
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid +1;
            }else return arr[mid];
        }
        return arr[start];
    }
}
