import java.util.Scanner;
public class Bonus_OfEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your years of service :");
        int YearsOfService = sc.nextInt();

        System.out.print("Enter your salary :");
        double Salary = sc.nextDouble();


        if(YearsOfService>5){
            double Bonus = ((5.0/100) * Salary) ; // 5 percent of bonus
            Salary+=Bonus;
            System.out.println("Congrats , You got a bonus of 5 percent and your incremented salary is : Rs. "+Salary);
        }
        else {
            System.out.println("Sorry , you didn't got any Bonus");
        }

    }
}
