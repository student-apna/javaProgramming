package ONE_D_Array;
import java.util.*;
public class Questions {
    static boolean isSorted(int []arr){
        boolean check = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check = false;
            }
        }
        return check;
    }
    static int lastOccurrence(int []arr,int x){
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                ans=i;
            }
        }
        return ans;
    }
    static int countOccurrences(int[]arr,int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the particular element");
//        int x = sc.nextInt();
        int []arr = new int [5];
        System.out.println("enter the elements of the array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //System.out.println("count of x:"+countOccurrences(arr,x));
        //System.out.println("last occurrence of x is:"+lastOccurrence(arr,x));
        System.out.println("is sorted:"+isSorted(arr));
    }

}
