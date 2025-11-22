import java.util.*;

public class ReverseQueue {
    public static <T> void reverse(Queue<T> q) {
        Stack<T> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(List.of(10, 20, 30));
        reverse(q);
        System.out.println(q);
    }
}
