import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 1);

        Map<Integer, List<String>> inverted = new HashMap<>();

        for (String key : map.keySet()) {
            int value = map.get(key);

            inverted.putIfAbsent(value, new ArrayList<>());
            inverted.get(value).add(key);
        }

        System.out.println(inverted);
    }
}
