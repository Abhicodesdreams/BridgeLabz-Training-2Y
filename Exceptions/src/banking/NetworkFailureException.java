package banking;

public class NetworkFailureException extends Exception {
    public NetworkFailureException(String msg) {
        super(msg);
    }
}
