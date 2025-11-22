import java.util.*;

public class CopyList {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        List<Number> dst = new ArrayList<>();
        List<Integer> src = List.of(1, 2, 3);

        copyList(dst, src);
        System.out.println(dst);
    }
}
