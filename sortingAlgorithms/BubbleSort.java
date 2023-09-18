package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {7,3,5,6,8,9,4,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int []arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    // swap them
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j+1]^arr[j];
                    arr[j] = arr[j]^arr[j+1];
                    flag = true;

                }
            }
            if(flag==false) return;
        }
    }
}
