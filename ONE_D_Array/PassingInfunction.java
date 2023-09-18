package ONE_D_Array;

import java.util.Arrays;

public class PassingInfunction {
    public static void main(String[] args) {
        int [] nums = {9,3,4,5,67};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int arr[]){
        arr[0]=99;
    }
}
