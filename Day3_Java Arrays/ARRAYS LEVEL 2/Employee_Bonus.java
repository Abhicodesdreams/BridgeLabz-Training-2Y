import java.sql.SQLOutput;
import java.util.*;
public class Employee_Bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] newSalary=new double[10];
        double[] bonus = new double[10];

        double OldTotalSalary =0;;
        double newTotalSalary=0;
        double totalBonus=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ":");
            double Salary_Service = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            double Years_Service = sc.nextDouble();

        if(Salary_Service<=0 || Years_Service<=0){
            System.out.println("Invalid data ! , Input again ");
            i--;
            continue;
        }
        salary[i]=Salary_Service;
        years[i]=Years_Service;

        }
        // Now ,  we will calculate bonus

        // WKT , 5% = 5/100 i.e 0.05 ; Similarly , 2%=0.02

        for(int i=0;i<10;i++){
            if(years[i]>5){
                bonus[i]=0.05*salary[i];
            } else{
                bonus[i]=0.02*salary[i];
            }
            newSalary[i]=salary[i]+bonus[i];
            OldTotalSalary+=salary[i];
            newTotalSalary+=newSalary[i];
            totalBonus+=bonus[i];
        }

        System.out.println("-----SALARY REPORT------");
        for(int i=0;i<10;i++){
            System.out.println("The salary report of Employee "+(i+1)+" is ==> " +
                    " OLD salary : "+salary[i]+" &  Bonus : "+bonus[i]+" &  New Salary : "+newSalary[i]);
        }
        System.out.println("Total Old salary : "+OldTotalSalary);
        System.out.println("Total bonus Payout : "+totalBonus);
        System.out.println("Total New Salary : "+newTotalSalary);

    }
}