import java.util.Scanner;
public class NaturalNumber_Check_Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check and it's series sum :");
        int n = sc.nextInt();
        int sum ;

        if (n>0){
            sum= n*(n+1)/2;
            System.out.println("The sum of "+n+" natural numbers is "+sum);
        } else {
            System.out.println("The number "+n+" is not a natural number ");
        }
    }
}
