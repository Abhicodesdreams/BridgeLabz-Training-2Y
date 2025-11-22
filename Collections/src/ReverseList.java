import java.util.*;

public class ReverseList {
    public static <T> List<T> reverse(List<T> list) {
        List<T> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        LinkedList<Integer> link = new LinkedList<>(List.of(10, 20, 30, 40));

        System.out.println(reverse(arr));
        System.out.println(reverse(link));
    }
}
