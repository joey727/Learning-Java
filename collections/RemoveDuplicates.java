package collections;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(7);
        arr.add(9);
        arr.add(11);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        arr.add(11);
        System.out.println(arr);
        removeDuplicates(arr);
        System.out.println(arr);
    }

    public static void removeDuplicates(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                    j--;
                }
            }
        }
    }
}
