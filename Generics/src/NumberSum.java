import java.util.List;

public class NumberSum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(List.of(1, 2, 3)));
        System.out.println(sumNumbers(List.of(1.5, 2.5, 3.0)));
    }
}
