import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type; // "CRITICAL", "NORMAL", "INFO"

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class AlertFiltering {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Patient heart rate high", "CRITICAL"),
                new Alert("Patient wants water", "NORMAL"),
                new Alert("Nurse shift change", "INFO")
        );

        // User wants only critical alerts
        Predicate<Alert> filterCritical = a -> a.type.equals("CRITICAL");

        System.out.println("Filtered Alerts:");
        alerts.stream()
                .filter(filterCritical)
                .forEach(System.out::println);
    }
}
