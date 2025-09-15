import java.time.*;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        LocalDate givenDate = LocalDate.parse(inputDate);

        LocalDate modifiedDate = givenDate
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println("Original Date: " + givenDate);
        System.out.println("Modified Date after operations: " + modifiedDate);
    }
}
