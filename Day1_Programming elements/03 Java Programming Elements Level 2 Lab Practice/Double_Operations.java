import java.util.Scanner;
public class Double_Operations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



                // we have to take input of 3 variables i.e. a,b,c ;

                System.out.print("Enter value of a :");
                double a = sc.nextInt();

                System.out.print("Enter value of b :");
                double b =  sc.nextInt();

                System.out.print("Enter value of c :");
                double c = sc.nextInt();

                double Output1 = a + b*c;
                double Output2 =a * b+c;
                double Output3 = c + a/b;
                double Output4 = a % b+c;

                System.out.print("The result of double operations are "+Output1+" , "+Output2+" , "+Output3+" and "+Output4);





    }
}
