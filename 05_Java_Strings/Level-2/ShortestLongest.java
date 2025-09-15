import java.util.*;
public class ShortestLongest {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);

        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (getLength(w) < getLength(shortest)) shortest = w;
            if (getLength(w) > getLength(longest)) longest = w;
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }

}
