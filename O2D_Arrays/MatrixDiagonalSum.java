package O2D_Arrays;
//https://leetcode.com/problems/matrix-diagonal-sum/submissions/
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] arr) {
        int sum=0;

        int n=arr.length;
        for(int i=0; i<n; i++ ){
            for(int j=0; j<n;j++ ){
                if(i==j) sum+=arr[i][j];
                if(i+j+1 == n && i!=j) sum+=arr[i][j];
            }
        }
        return sum;

    }
}
