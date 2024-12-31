
import java.util.*;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        List<Integer> lst = List.of(057, 027, 055, 027, 024, 055, 024, 055);
        System.out.println(lst);

        Set<Integer> Uniquelst = new LinkedHashSet<>();
        Uniquelst.addAll(lst);
        System.out.println(Uniquelst);

    }
}
