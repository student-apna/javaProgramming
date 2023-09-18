package ONE_D_Array;

public class EvenDigit {
    public static void main(String[] args) {
        int arr[] = {123, 3456, 23, 56432, 12, 345, 65};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) count++;
        }
        return count;
    }

    //function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num *= -1;
        }
            return (int) (Math.log10(num) + 1);


    }
}

