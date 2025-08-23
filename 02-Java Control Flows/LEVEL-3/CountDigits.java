import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to count the digits :");
        int n = sc.nextInt();

        int count=0;
        int original = n;

        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println("Number "+original+" contains "+count+" digits ");

    }
}
