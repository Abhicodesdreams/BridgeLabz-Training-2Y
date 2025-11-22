import college.student.Student;
import college.faculty.Faculty;

public class MainAppPackages {
    public static void main(String[] args) {
        Student s = new Student("Anita Sharma", 101);
        Faculty f = new Faculty("Dr. Rao", "Computer Science");

        s.displayStudent();
        System.out.println();
        f.displayFaculty();
    }
}
