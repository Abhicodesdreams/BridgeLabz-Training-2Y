package vehicle;

import java.time.LocalDate;

public class MaintenanceChecker {

    public void checkMaintenance(LocalDate serviceDate, int mileage)
            throws ServiceOverdueException, InvalidMileageException {

        if (mileage < 0) {
            throw new InvalidMileageException("Mileage cannot be negative!");
        }

        if (serviceDate.isBefore(LocalDate.now())) {
            throw new ServiceOverdueException("Service Date is overdue!");
        }

        System.out.println("Vehicle is in good condition. No issues.");
    }
}
