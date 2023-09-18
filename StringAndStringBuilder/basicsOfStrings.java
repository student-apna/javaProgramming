package StringAndStringBuilder;

public class basicsOfStrings {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        String a ="aftab";
        String b = "aftab";
       // System.out.println(a==b);
        // only one pool (aftab)is created in the heap section

        // how to create diff objects of the same value;
        String a1 = new String("aftab");// creating these values
        String b1 = new String("aftab");// outside the pool but in heap
        System.out.println(a1==b1);
        System.out.println(a1.equals(b1)); // it only check the value
        System.out.println(new int [] {1,2,3,4,5});
    }
}
