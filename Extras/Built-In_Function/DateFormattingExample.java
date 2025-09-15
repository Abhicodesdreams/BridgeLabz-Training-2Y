import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateFormattingExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter pattern3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Current Date in dd/MM/yyyy: " + currentDate.format(pattern1));
        System.out.println("Current Date in yyyy-MM-dd: " + currentDate.format(pattern2));
        System.out.println("Current Date in EEE, MMM dd, yyyy: " + currentDate.format(pattern3));
    }
}
