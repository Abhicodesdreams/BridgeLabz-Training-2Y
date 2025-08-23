import java.util.Scanner;
public class LeapYear_Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year you want to check :");
        int year = sc.nextInt();

        if (year<1582){
            System.out.println("Invalid input ! this check works only for year 1582 and above");
        }
        else {
            if(year%400==0){
                System.out.println(year+" is a Leap year");
            } else if(year%100==0){
                System.out.println(year+" is not a Leap year");
            } else if (year%4==0){
                System.out.println(year+" is a Leap year");
            } else {
                System.out.print(year+" is not a Leap year ");

            }
        }

    }
}
