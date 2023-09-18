package ONE_D_Array;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(1);
        System.out.println(list.contains(1));
        System.out.println(list);
    }
}
