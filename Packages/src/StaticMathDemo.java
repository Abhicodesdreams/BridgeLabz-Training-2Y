import static java.lang.Math.*;

public class StaticMathDemo {
    public static void main(String[] args) {
        double a = 16.0;
        double b = 3.0;

        // Using static imports directly
        double s = sqrt(a);            // sqrt()
        double p = pow(a, b);         // pow()
        double maximum = max(a, b);   // max()
        double minimum = min(a, b);   // min()
        double absolute = abs(-42.5); // abs()

        System.out.println("sqrt(16) = " + s);
        System.out.println("pow(16,3) = " + p);
        System.out.println("max(16,3) = " + maximum);
        System.out.println("min(16,3) = " + minimum);
        System.out.println("abs(-42.5) = " + absolute);
    }
}
