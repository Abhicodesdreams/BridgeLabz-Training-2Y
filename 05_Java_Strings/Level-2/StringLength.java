import java.util.*;
public class StringLength {
    // Manual method to calculate length
    static int getLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLen = getLength(text);
        int builtInLen = text.length();

        System.out.println("Length using custom method: " + customLen);
        System.out.println("Length using built-in method: " + builtInLen);
    }

}
