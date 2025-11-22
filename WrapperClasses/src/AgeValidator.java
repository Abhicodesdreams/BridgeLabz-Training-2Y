public class AgeValidator {

    public static boolean validateAge(String age) {
        try {
            int a = Integer.parseInt(age);
            return a >= 18;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(validateAge("20"));
        System.out.println(validateAge("abc"));
        System.out.println(validateAge("10"));
    }
}
