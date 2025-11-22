import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Map<String, Double> grades = new HashMap<>();

        // Add students
        grades.put("Aman", 85.0);
        grades.put("Riya", 92.0);
        grades.put("Karan", 76.5);

        // Update grade
        grades.put("Aman", 90.0);

        // Remove dropped student
        grades.remove("Karan");

        // Sort and print
        TreeMap<String, Double> sorted = new TreeMap<>(grades);

        for (String name : sorted.keySet()) {
            System.out.println(name + " : " + sorted.get(name));
        }
    }
}
