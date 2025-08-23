import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number whose greatest factor you want to print : ");

        int number = sc.nextInt();
        int GreatestFactor = 1;

        for (int i = number-1 ; i>=1;i--){  // we did number-1 because , we wanted to exclude the number itself !
            if(number%i==0) {
                GreatestFactor = i;
                break;
            }
        }
        System.out.println("The Greatest factor of "+number+" is : "+GreatestFactor);

    }
}
