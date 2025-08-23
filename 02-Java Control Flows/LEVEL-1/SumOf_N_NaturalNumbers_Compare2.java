import java.util.Scanner;
public class SumOf_N_NaturalNumbers_Compare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();

        int sum_ForLoop=0;

        if (n>0){

            int sum_formula = n*(n+1)/2;

            // now ,  sum through for loop :

            for (int i =1;i<=n;i++){
                 sum_ForLoop +=i;
            }

            System.out.println("Sum through formula : "+sum_formula);
            System.out.println("Sum through For_Loop : "+sum_ForLoop);
        }
        else{
            System.out.println("Not a natural number ");
        }

    }
}
