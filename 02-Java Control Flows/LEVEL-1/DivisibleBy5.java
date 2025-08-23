import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean DivisibleBy5 = (n%5==0);

        System.out.println("Is the number "+n+ " divisible by 5 ? "+DivisibleBy5);

        // _________________________________OR__________________________________________________

        //  if you want answer as yes and  no , instead of true and false ;

        System.out.println("Enter number which Divisibility by 5 you want to check :");
        int n1 = sc.nextInt();

        if(n1%5==0){
            System.out.println("Is the number " +n1+ " divisible by 5 ? Yes");
        }
        else {
            System.out.println("Is the number " +n1+ " divisible by 5 ? No");
        }


    }
}
