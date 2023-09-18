package BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetterGthantarget {
    public static void main(String[] args) {
        char[] letter = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letter,target));
    }
    public static char nextGreatestLetter(char []letter,char target){
        int s=0;
        int e=letter.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target<letter[mid]){
                e=mid-1;
            }else s=mid+1;
        }
        return letter[s%letter.length];
    }
}
