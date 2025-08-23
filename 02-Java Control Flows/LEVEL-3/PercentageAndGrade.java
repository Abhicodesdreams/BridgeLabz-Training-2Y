import java.util.Scanner;
public class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
     System.out.print("Enter marks of PCM : ");
        double Physics = sc.nextDouble();
        double Chemistry = sc.nextDouble();
        double Maths = sc.nextDouble();

        double total  = Physics+Chemistry+Maths;
        double Max_Marks = 300;
        double Average  = (total/Max_Marks)*100;

        System.out.println("Average Percentage : "+Average+" %");
     if(Average>=80){
         System.out.println("Grade : A | Remarks :Level 4 , above agency-normalized standards");
     } else if(Average>=70 && Average<80){
         System.out.println("Grade : B | Remarks : Level 3 , at agency-normalized standards");
     } else if (Average>=60 && Average<70){
         System.out.println("Grade : C | Remarks : Level 2 , below , but approaching agency normalized-standards");
     } else if (Average>=50 && Average<60){
         System.out.println("Grade : D | Remarks : Level 1 , well below agency-normalized standards");
     } else if (Average>=40 && Average<50) {
         System.out.println("Grade : E | Remarks : Level 1-,too below agency-normalized standards");
     }
     else {
         System.out.println("Remedial standards ");
     }


    }
}
