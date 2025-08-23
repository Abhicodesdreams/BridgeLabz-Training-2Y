import java.util.Scanner;
public class PrimeNumber_Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to check as Prime :");
        int n = sc.nextInt();

        boolean isPrime=true;

        if(n<=1) {
            isPrime = false;
        } else {
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }

        }

        if(isPrime){
            System.out.println(n+" is a Prime number");
        } else {
            System.out.println(n+" is NOT a Prime Number");
        }
    }
}
