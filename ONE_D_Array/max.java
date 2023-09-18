package ONE_D_Array;

public class max {
    public static void main(String[] args) {
        int [] arr = {-2,-3,-7,-4,-9,-1};
        int max= arr[0];
        long m = Long.MIN_VALUE;
        System.out.println(m);
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        //System.out.println(System.currentTimeMillis());
    }
}
