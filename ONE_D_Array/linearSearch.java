package ONE_D_Array;

public class linearSearch {
    public static void main(String[] args) {
        String str = "aftab alam";
        char target = 'v';
        System.out.println(search(str,target));

    }
    static boolean search(String str ,char target){
        if(str.length()==0) return false;
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)) return true;
        }
        return false;
    }
}
