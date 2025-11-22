import banking.*;

public class BankMain {
    public static void main(String[] args) {
        Transaction t = new Transaction();

        try {
            t.performTransaction(6000);
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
