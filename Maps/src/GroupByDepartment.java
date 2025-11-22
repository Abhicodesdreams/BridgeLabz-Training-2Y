import java.util.*;

class Employee {
    String name;
    String dept;
    Employee(String name, String dept) { this.name = name; this.dept = dept; }
    public String toString() { return name; }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : employees) {
            map.putIfAbsent(e.dept, new ArrayList<>());
            map.get(e.dept).add(e);
        }

        System.out.println(map);
    }
}
