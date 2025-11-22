package banking;

import java.util.Random;

public class Transaction {
    private double balance = 5000;

    public void performTransaction(double amount)
            throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {

        Random r = new Random();
        int val = r.nextInt(3); // randomly throws exception

        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative!");
        }
        else if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance!");
        }
        else if (val == 0) {
            throw new NetworkFailureException("Network issue! Try again later.");
        }
        else {
            balance -= amount;
            System.out.println("Transaction successful! New balance = " + balance);
        }
    }
}
