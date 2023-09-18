package Recursion;
import java.util.*;
public class recursionOnArray {
    static int sumOfElements(int arr[],int i){
        if(i==arr.length-1) return arr[i];
        return sumOfElements(arr,i+1)+arr[i];
    }
    static void printArray(int []arr,int i){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
         printArray(arr,i+1);
    }
    static int maxInArray(int arr[],int i){
        if(i==arr.length-1) return arr[i];
        int small = maxInArray(arr,i+1);
        return Math.max(small,arr[i]);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,4,5,2,1};
        printArray(arr,0);
        System.out.println();
        System.out.println("max element in the array is :"+ maxInArray(arr,0));
        System.out.println();
        System.out.println("the sum of all the elements in the given array is  "+sumOfElements(arr,0));
    }
}
