package banking;

public class NegativeAmountException extends Exception {
    public NegativeAmountException(String msg) {
        super(msg);
    }
}
