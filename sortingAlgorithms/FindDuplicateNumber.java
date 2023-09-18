package sortingAlgorithms;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int [] nums = {3,1,3,3,2};
        System.out.println(duplicate(nums));

    }
    static int  duplicate(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]) swap(arr,i,correct);
            else i++;
        }
        for(int index =0; index<arr.length; index++){
            if(arr[index]!=index+1) return arr[arr.length-1];
        }
        return arr[0];
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
