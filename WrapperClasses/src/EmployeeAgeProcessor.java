import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAgeProcessor {
    public static void main(String[] args) {
        int[] ages = {23, 45, 32, 19, 60};

        ArrayList<Integer> list = new ArrayList<>();
        for (int a : ages) list.add(a);

        System.out.println("Youngest: " + Collections.min(list));
        System.out.println("Oldest: " + Collections.max(list));
    }
}
