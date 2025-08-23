import java.util.Scanner;
public class GreatestFactor_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number whose Greatest factor you want to find :");
        int number = sc.nextInt();
         int GreatestFactor = 1;

         int counter = number-1;

         while(counter>=1){
             if(number%counter==0){
                 GreatestFactor=counter;
                 break;
             }
             counter--;
         }
         System.out.println("The greatest factor of "+number+" is : "+GreatestFactor);


    }
}
