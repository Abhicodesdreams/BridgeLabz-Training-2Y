import java.util.Scanner;
public class Height_FeetInches {
    public static void main(String[] args) {
        // Input will be Height in cm's

        Scanner sc = new Scanner(System.in);
        // 1 foot = 12 inches and 1 inch = 2.54 cm
        System.out.print("Enter your height in cm's :");
        double height_cm = sc.nextDouble();

         double conversion_inch = 2.54;
         double  Height_inInches = height_cm/conversion_inch;

        int conversion_feet = 12;

        int Height_feet = (int) (Height_inInches/conversion_feet);

         double remaining_inches = Height_inInches % conversion_feet;

        System.out.println("Your Height in cm is "+height_cm +" while in feet is "+Height_feet+" and inches is "+remaining_inches);




    }
}
