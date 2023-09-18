package sortingAlgorithms;

import java.util.ArrayList;
import java.util.List;



//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class dissapearedNumber {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));


    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
             int n = arr.length;
             int i =0;
             while(i<n){
                 int correct = arr[i]-1;
                 if(arr[i]!=arr[correct]){
                     swap(arr,i,correct);
                 }
                 else i++;
             }
             ArrayList<Integer> ans = new ArrayList<>();
             for(int index = 0; index<n; index++){
                 if(arr[index]!=index+1)
                     ans.add(index+1);
             }
            return ans;

     }
     public static void swap(int []arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
     }

}




