import java.util.*;

public class NameUppercase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("rahul", "megha", "suresh");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
