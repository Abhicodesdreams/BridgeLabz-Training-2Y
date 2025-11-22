import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        int letters = 0, digits = 0, specials = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
            else if (!Character.isWhitespace(ch)) specials++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + specials);
    }
}
