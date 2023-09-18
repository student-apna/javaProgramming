package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {7,6,4,3,5,1,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int []arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min_index = i; // suppose the min index is at ith position;
            for(int j=i+1; j<n; j++){// check kr rhe hai ki aur koi to nhi hai index jo i se bhi small ho
                if(arr[j]<arr[i]) min_index = j;
            }
            // arr[i] ans arr[min_index] ko swap kr denge
           int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index]= temp;

        }
    }
}
