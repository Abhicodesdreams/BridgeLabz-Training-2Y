import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number whose factors you want to check :");

        int n = sc.nextInt();
        System.out.println("The factors of "+n+" are :");

     if(n>0){
         for (int i=1;i<=n;i++){
             if (n%i==0){
                 System.out.println(i);
             }
         }
     }
     else{
         System.out.println("Kindly enter a positive number");
     }
     }


    }
