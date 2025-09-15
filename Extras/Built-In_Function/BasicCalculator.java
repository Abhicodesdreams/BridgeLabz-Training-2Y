import java.util.Scanner;
public class BasicCalculator {
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) { return (b == 0) ? Double.NaN : (double) a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result = " + add(num1, num2)); break;
            case '-': System.out.println("Result = " + subtract(num1, num2)); break;
            case '*': System.out.println("Result = " + multiply(num1, num2)); break;
            case '/': System.out.println("Result = " + divide(num1, num2)); break;
            default: System.out.println("Invalid Operation");
        }
    }

}
