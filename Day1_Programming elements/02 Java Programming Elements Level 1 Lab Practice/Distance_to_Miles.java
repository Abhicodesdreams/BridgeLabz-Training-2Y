public class Distance_to_Miles {
    public static void main(String[] args) {

        float kilom_distance = 10.8f;
         // we know that 1 km = 1.6 miles ;
          String Kilometre = "10.8 kms";

        float miles_distance = kilom_distance/1.6f;

        System.out.println("The distance "+ Kilometre + "in miles is "+ miles_distance);
    }
}
