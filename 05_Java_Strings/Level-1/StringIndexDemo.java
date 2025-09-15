import java.util.*;
public class StringIndexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // Instead of wrong index, print last valid character
        int index = text.length() - 1;
        System.out.println("Character at last index: " + text.charAt(index));
    }
}
