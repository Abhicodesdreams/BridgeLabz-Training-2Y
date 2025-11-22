import login.InvalidCredentialsException;
import java.util.Scanner;

public class LoginMain {

    public static void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals("admin") || !pass.equals("1234")) {
            throw new InvalidCredentialsException("Incorrect username or password!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Username: ");
            String u = sc.nextLine();

            System.out.print("Password: ");
            String p = sc.nextLine();

            validate(u, p);
            System.out.println("Login successful!");

        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
            System.out.println("Please try again.");
        }
    }
}
