import java.util.*;
public class ConvertToLowercase {
    static String toLowerCaseCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
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

        String lowerCustom = toLowerCaseCustom(text);
        String lowerBuiltIn = text.toLowerCase();

        System.out.println("Custom Lowercase: " + lowerCustom);
        System.out.println("Built-in Lowercase: " + lowerBuiltIn);
        System.out.println("Comparison result: " + compareStrings(lowerCustom, lowerBuiltIn));
    }

}
