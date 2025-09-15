import java.util.*;
public class ConvertToUppercase {
    static String toUpperCaseCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    // Method to compare two strings
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String upperCustom = toUpperCaseCustom(text);
        String upperBuiltIn = text.toUpperCase();

        System.out.println("Custom Uppercase: " + upperCustom);
        System.out.println("Built-in Uppercase: " + upperBuiltIn);
        System.out.println("Comparison result: " + compareStrings(upperCustom, upperBuiltIn));
    }
}
