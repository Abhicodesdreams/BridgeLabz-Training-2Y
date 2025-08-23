import java.util.Scanner;
public class SumOfNumbers_until0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total =0.0;
        System.out.print("Enter value :");


        while(true){
            double value = sc.nextDouble();
            if(value==0) break;
            total = total+value;
        }
        System.out.println("The total value : "+total);
    }
}
