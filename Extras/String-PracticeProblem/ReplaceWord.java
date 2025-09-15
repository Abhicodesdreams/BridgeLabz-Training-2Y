public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "I love programming in Java";
        String oldWord = "Java";
        String newWord = "Python";

        String result = sentence.replace(oldWord, newWord);
        System.out.println("Modified: " + result);
}
}
