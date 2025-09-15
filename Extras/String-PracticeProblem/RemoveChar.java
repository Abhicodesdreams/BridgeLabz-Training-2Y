public class RemoveChar {
    public static void main(String[] args) {
        String str = "Hello World";
        char remove = 'l';

        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != remove) sb.append(ch);
        }

        System.out.println("Modified: " + sb.toString());
    }
}
