import java.util.*;
public class TrimSpaces {
    static String trimCustom(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        String result = "";
        for (int i = start; i <= end; i++) result += str.charAt(i);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text with spaces: ");
        String text = sc.nextLine();

        String custom = trimCustom(text);
        String builtIn = text.trim();

        System.out.println("Custom Trim: '" + custom + "'");
        System.out.println("Built-in Trim: '" + builtIn + "'");
        System.out.println("Equal? " + custom.equals(builtIn));
    }

}
