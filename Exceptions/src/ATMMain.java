import atm.ATM;
import atm.InsufficientFundsException;

public class ATMMain {
    public static void main(String[] args) {
        ATM atm = new ATM();

        try {
            atm.withdraw(15000);  // more than balance
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Transaction Completed.");
    }
}
