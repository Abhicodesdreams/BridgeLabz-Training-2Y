import java.util.*;
public class StudentMarks_1darray {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number of students: ");
                int n = sc.nextInt();

                double[] percentage = new double[n];
                String[] grade = new String[n];

                for (int i = 0; i < n; i++) {
                    System.out.println("Enter marks (Physics, Chemistry, Maths) for student " + (i+1) + ":");
                    double p = sc.nextDouble();
                    double c = sc.nextDouble();
                    double m = sc.nextDouble();

                    double total = p + c + m;
                    percentage[i] = total / 3.0;

                    if (percentage[i] >= 90) grade[i] = "A";
                    else if (percentage[i] >= 75) grade[i] = "B";
                    else if (percentage[i] >= 50) grade[i] = "C";
                    else grade[i] = "F";
                }


                for (int i = 0; i < n; i++) {
                    System.out.println("Student " + (i+1) + " | Percentage: " + percentage[i] + " | Grade: " + grade[i]);
                }
            }
        }
