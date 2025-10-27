import java.util.*;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class StudentResultManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter name :");
            String name = sc.nextLine();


            if (name == null || name.trim().isEmpty()) {
                throw new NullPointerException("Name cannot be null or empty.");
            }

            System.out.println("Enter age :");
            int age = sc.nextInt();


            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }

            System.out.println("Enter your marks in 3 subjects : ");
            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                marks[i] = sc.nextInt();
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new InvalidMarksException("Marks must be between 0 and 100.");
                }
            }

            
            double average = 0;
            try {
                average = (marks[0] + marks[1] + marks[2]) / 3.0;
                System.out.println("Average Marks: " + average);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero while calculating average!");
            }


            try {
                System.out.println("Accessing invalid index: " + marks[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Tried to access invalid index of marks array.");
            }


            System.out.println("--- Student Details ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + Arrays.toString(marks));
            System.out.printf("%2.f"+ average);

        }
        catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected Exception: " + e);
        }
        finally {
            System.out.println("Result processing completed.");
        }
    }
}
