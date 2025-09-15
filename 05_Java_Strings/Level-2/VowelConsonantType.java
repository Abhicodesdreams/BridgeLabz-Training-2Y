import java.util.*;
public class VowelConsonantType {
    static String getCharType(char c) {
        if (Character.isLetter(c)) {
            char ch = Character.toLowerCase(c);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Char\tType");
        for (char c : text.toCharArray()) {
            System.out.println(c + "\t" + getCharType(c));
        }
    }

}
