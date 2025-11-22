import vehicle.*;
import java.time.LocalDate;

public class VehicleMain {
    public static void main(String[] args) {

        MaintenanceChecker mc = new MaintenanceChecker();

        try {
            mc.checkMaintenance(LocalDate.of(2023, 5, 1), -100);
        } catch (InvalidMileageException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ServiceOverdueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
