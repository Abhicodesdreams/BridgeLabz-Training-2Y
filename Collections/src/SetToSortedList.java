import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>(Set.of(5, 3, 9, 1));

        List<Integer> sorted = new ArrayList<>(hs);
        Collections.sort(sorted);

        System.out.println(sorted);
    }
}
