import java.time.*;
import java.util.Scanner;
public class DateComparisonExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate firstDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate secondDate = LocalDate.parse(scanner.nextLine());

        if (firstDate.isBefore(secondDate)) {
            System.out.println("First date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("First date is after the second date.");
        } else {
            System.out.println("Both dates are equal.");
        }
    }
}
