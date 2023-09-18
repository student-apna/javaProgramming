package sortingAlgorithms;

public class MissingNumberMath {
    public static void main(String[] args) {
        int [] arr = {3,0,1};
        System.out.println(missing(arr));

    }

    static int missing(int arr[]){
        int n = arr.length;
        int exSum = n*(n+1)/2;
        int acSum = 0;
        for(int x:arr){
            acSum+=x;
        }
        return exSum-acSum;
    }
}
