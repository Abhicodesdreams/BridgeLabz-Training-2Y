import java.util.*;
public class SplitWords {
    static String[] customSplit(String str) {
        int spaces = 1;
        for (char c : str.toCharArray()) {
            if (c == ' ') spaces++;
        }
        String[] words = new String[spaces];
        int wordIndex = 0;
        String temp = "";
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                words[wordIndex++] = temp;
                temp = "";
            } else {
                temp += c;
            }
        }
        words[wordIndex] = temp;
        return words;}
    static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Arrays equal? " + compareArrays(custom, builtIn));
    }

}
