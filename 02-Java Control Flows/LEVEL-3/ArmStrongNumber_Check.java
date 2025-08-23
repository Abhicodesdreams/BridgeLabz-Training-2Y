import java.util.Scanner;
public class ArmStrongNumber_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check : ");
        int n = sc.nextInt();
        int sum=0;
        int Original=n;

        while(n>0){
            int x=n%10;  // x= last digit extracted !
            sum=sum+(x*x*x); //
            n=n/10; // number is getting short , until it becomes 0 ;
        }
        if(sum==Original){
            System.out.println(Original+" is an Armstrong Number");
        }else{
            System.out.println(Original+" is not an Armstrong Number");
        }

    }
}
