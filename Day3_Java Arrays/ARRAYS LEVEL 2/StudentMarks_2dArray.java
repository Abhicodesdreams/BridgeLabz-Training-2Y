import java.util.*;
public class StudentMarks_2dArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students : ");
        int n = sc.nextInt();

        int [][] marks = new int[n][3];

        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println("Enter marks (Physics, Chemistry, Maths) for student " + (i+1) + ":");
            for(int j=0;j<3;j++){
                marks[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            int total=0;
            for(int j=0;j<3;j++){
                total=total+marks[i][j];
            }
            double percentage =total/3.0;

            String grade ;
            String remarks;
            if (percentage >= 80) {
                grade = "A";
                remarks = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Level 2, below but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grade = "E";
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                grade = "R";
                remarks = "Remedial standards";
            }

            // Display result
            System.out.println("Student " + (i + 1) + ": Total = " + total +
                    ", Percentage = " + percentage + "%" +
                    ", Grade = " + grade +
                    ", Remarks = " + remarks);


        }


    }
}
