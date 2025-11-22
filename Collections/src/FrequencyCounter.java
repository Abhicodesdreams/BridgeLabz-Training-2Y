import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple", "orange");

        Map<String, Integer> freq = new HashMap<>();

        for (String s : list) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        System.out.println(freq);
    }
}
