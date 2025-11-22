import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Set.of(3, 4, 5));

        Set<Integer> result = new HashSet<>(s1);
        for (Integer x : s2) {
            if (!result.add(x)) {
                result.remove(x);
            }
        }

        System.out.println(result);
    }
}
