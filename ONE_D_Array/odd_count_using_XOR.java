package ONE_D_Array;

public class odd_count_using_XOR {
    public static void main(String[] args) {
        int arr[]= {1,1,2,2,2,2,4,4,5,5,5,5,5};
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans^=arr[i];
        }
        System.out.println(ans);

    }
}
