package ClassRoomProgram;
//https://leetcode.com/problems/contains-duplicate/
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



       // Example 1:

       // Input: num= [1,2,3,1]
        //Output: true
       // Example 2:

       // Input: num = [1,2,3,4]
        //Output: false
       // Example 3:

       // Input: num = [1,1,1,3,3,4,3,2,4,2]
        //Output: true
public class RemoveElement {
    public static void main(String[] args) {
        int [] num ={3,2,1,4,6,2,6};
        int ans = 0;
        for(int x:num){
            ans^=x;
        }
        System.out.println(ans);

    

    }
}
