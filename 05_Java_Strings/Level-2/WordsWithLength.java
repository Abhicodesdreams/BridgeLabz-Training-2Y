import java.util.*;
public class WordsWithLength {
    static String[] customSplit(String str) {
        int spaces = 1;
        for (char c : str.toCharArray()) if (c == ' ') spaces++;
        String[] words = new String[spaces];
        int idx = 0;
        String temp = "";
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                words[idx++] = temp;
                temp = "";
            } else {
                temp += c;
            }
        }
        words[idx] = temp;
        return words;
    }

    static int getLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] table = wordsWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }

}
