import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>(Map.of("A", 1, "B", 2));
        Map<String, Integer> m2 = Map.of("B", 3, "C", 4);

        for (String key : m2.keySet()) {
            m1.put(key, m1.getOrDefault(key, 0) + m2.get(key));
        }

        System.out.println(m1);
    }
}
