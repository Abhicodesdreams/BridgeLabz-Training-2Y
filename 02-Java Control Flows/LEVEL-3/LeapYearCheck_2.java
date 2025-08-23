import java.util.Scanner;
public class LeapYearCheck_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year you want to check : ");
        int year = sc.nextInt();

        if((year>=1582) && (year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year+" is a Leap year");
        } else {
            System.out.println(year+" is not a Leap year");
        }
    }
}
