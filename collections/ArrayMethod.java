package collections;

import java.util.ArrayList;

public class ArrayMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(7);
        arr.add(9);
        arr.add(11);
        System.out.println(arr);
        arr.add(1, 6);
        System.out.println(arr);
    }
}
