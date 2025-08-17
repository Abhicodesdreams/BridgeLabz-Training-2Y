import java.util.Scanner;
public class CelsiusToFarhenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celsius :");
        float Celsius = sc.nextFloat();

        float Fahrenheit = (Celsius*9/5)+32;

        System.out.println("Your temperature in Farhenheit is : "+Fahrenheit);
    }
}
