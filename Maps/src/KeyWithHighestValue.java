import java.util.*;

public class KeyWithHighestValue {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);

        String maxKey = null;
        int maxVal = Integer.MIN_VALUE;

        for (String key : map.keySet()) {
            if (map.get(key) > maxVal) {
                maxVal = map.get(key);
                maxKey = key;
            }
        }

        System.out.println("Key with max value = " + maxKey);
    }
}
