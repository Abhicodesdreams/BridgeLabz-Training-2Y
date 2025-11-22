public class GradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85", "B", "70"};

        for (String g : grades) {
            try {
                int num = Integer.parseInt(g);
                System.out.println("Parsed grade: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + g);
            }
        }
    }
}
