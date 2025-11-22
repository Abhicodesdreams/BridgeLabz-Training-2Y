import java.util.ArrayList;

public class AutoboxingSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(5);

        int sum = 0;
        for (int x : list) {
            sum += x; // auto-unboxing
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
