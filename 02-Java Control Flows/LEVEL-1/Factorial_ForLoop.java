import java.util.Scanner;
public class Factorial_ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number whose  factorial you want to check :");
        int n = sc.nextInt();

        if(n>0){
            int fact = 1;
            for ( int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println("The factorial of "+n+" is : "+fact);
        }

    }
}
