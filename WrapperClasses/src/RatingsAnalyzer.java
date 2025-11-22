import java.util.ArrayList;

public class RatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {5, 4, 3};
        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(5);
        newRatings.add(null);
        newRatings.add(2);

        ArrayList<Integer> all = new ArrayList<>();
        for (int r : oldRatings) all.add(r);
        all.addAll(newRatings);

        double sum = 0;
        int count = 0;

        for (Integer r : all) {
            if (r != null) {
                sum += r;
                count++;
            }
        }

        System.out.println("Average rating = " + (sum / count));
    }
}
