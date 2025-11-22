import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {

        Map<String, Integer> visits = new HashMap<>();

        String[] pages = {
                "home", "about", "products", "home",
                "products", "contact", "home"
        };

        for (String p : pages) {
            visits.put(p, visits.getOrDefault(p, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(visits.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        System.out.println("Page visits:");
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("Most visited page = " + list.get(0).getKey());
    }
}
