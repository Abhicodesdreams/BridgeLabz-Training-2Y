import java.util.*;

class Account {
    int id;
    double balance;

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public boolean equals(Object o) { return this.id == ((Account)o).id; }
    public int hashCode() { return id; }
    public String toString() { return "Account " + id + " | Balance: " + balance; }
}

class Transaction {
    int accId;
    double amount;
    Transaction(int accId, double amount) {
        this.accId = accId;
        this.amount = amount;
    }
    public String toString() { return "Transaction -> Acc: " + accId + ", Amount: " + amount; }
}

public class BankingTransactionSystem {
    public static void main(String[] args) {

        // 1. List of all transactions
        List<Transaction> allTransactions = new ArrayList<>();
        allTransactions.add(new Transaction(1, 500));
        allTransactions.add(new Transaction(2, 1000));
        allTransactions.add(new Transaction(3, 2000));

        // 2. Valid account set
        Set<Account> validAccounts = new HashSet<>();
        validAccounts.add(new Account(1, 5000));
        validAccounts.add(new Account(2, 3000));
        validAccounts.add(new Account(3, 1000));

        // 3. Queue for pending transactions
        Queue<Transaction> pendingQueue = new LinkedList<>(allTransactions);

        // 4. Stack for rollback operations
        Stack<Transaction> rollbackStack = new Stack<>();

        // Execute transactions
        System.out.println("Executing transactions...");
        while (!pendingQueue.isEmpty()) {
            Transaction tx = pendingQueue.remove();

            // Validate account
            Optional<Account> accOpt = validAccounts.stream()
                    .filter(a -> a.id == tx.accId)
                    .findFirst();

            if (accOpt.isPresent()) {
                Account acc = accOpt.get();

                if (acc.balance >= tx.amount) {
                    acc.balance -= tx.amount;
                    rollbackStack.push(tx);
                    System.out.println("Success: " + tx);
                } else {
                    System.out.println("Failed (Insufficient Balance): " + tx);
                }

            } else {
                System.out.println("Invalid Account: " + tx.accId);
            }
        }

        // Undo last transaction
        System.out.println("\nRollback last transaction:");
        if (!rollbackStack.isEmpty()) {
            Transaction last = rollbackStack.pop();
            for (Account a : validAccounts) {
                if (a.id == last.accId) {
                    a.balance += last.amount;
                    break;
                }
            }
            System.out.println("Rolled back: " + last);
        }

        // Final account balances
        System.out.println("\nFinal Account States:");
        for (Account a : validAccounts) System.out.println(a);
    }
}
