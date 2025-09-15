import java.util.Random;
public class StudentGrades {
    static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry
            scores[i][2] = rand.nextInt(41) + 60; // Maths
        }
        return scores;
    }

    static Object[][] calculateResults(int[][] scores) {
        Object[][] result = new Object[scores.length][6];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = Math.round((total / 3.0) * 100.0 / 100.0);
            String grade = (percent >= 90) ? "A+" :
                    (percent >= 75) ? "A" :
                            (percent >= 60) ? "B" :
                                    (percent >= 50) ? "C" : "F";
            result[i][0] = scores[i][0];
            result[i][1] = scores[i][1];
            result[i][2] = scores[i][2];
            result[i][3] = total;
            result[i][4] = String.format("%.2f", avg);
            result[i][5] = grade;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        Object[][] result = calculateResults(scores);

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tGrade");
        for (Object[] row : result) {
            for (Object val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

}
