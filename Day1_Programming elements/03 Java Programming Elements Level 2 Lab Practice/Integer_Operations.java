import java.util.Scanner;
public class Integer_Operations {
    public static void main(String[] args) {

        // we have to take input of 3 variables i.e. a,b,c ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a :");
         int a = sc.nextInt();

         System.out.print("Enter value of b :");
         int b =  sc.nextInt();

         System.out.print("Enter value of c :");
         int c = sc.nextInt();

         int Output1 = a + b*c;
         int Output2 =a * b+c;
         int Output3 = c + a/b;
         int Output4 = a % b+c;

         System.out.print("The result of Int operations are "+Output1+" , "+Output2+" , "+Output3+" and "+Output4);
    }
}
