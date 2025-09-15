import java.util.*;
public class NumberParseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid number as text: ");
        String text = sc.next();

        // Instead of invalid text → only valid numeric string is parsed
        int num = Integer.parseInt(text);
        System.out.println("Converted number: " + num);
    }

}
