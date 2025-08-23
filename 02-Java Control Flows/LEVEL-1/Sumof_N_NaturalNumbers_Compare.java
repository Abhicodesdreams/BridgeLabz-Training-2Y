import java.util.Scanner;
public class Sumof_N_NaturalNumbers_Compare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();

        if (n>0) {
            int sum_formula = n*(n+1)/2;

            // Now , through while loop
            int i=1 ; int sum_whileLoop= 0;
            while(i<=n){
                sum_whileLoop+=i;
                i++;
            }

            System.out.println("Sum from formula : "+sum_formula);
            System.out.println("Sum from while loop : "+sum_whileLoop);
        }
        else{
            System.out.println("It is not a natural number ");
        }


    }
}
