import java.util.*;
public class SubstringValid {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text: ");
            String text = sc.next();
            System.out.print("Enter start index: ");
            int start = sc.nextInt();
            System.out.print("Enter end index: ");
            int end = sc.nextInt();

            // Instead of wrong start > end, we ensure valid range
            if (start < end && end <= text.length()) {
                String sub = text.substring(start, end);
                System.out.println("Valid Substring: " + sub);
            } else {
                System.out.println("Invalid indexes entered!");
            }
        }

    }

