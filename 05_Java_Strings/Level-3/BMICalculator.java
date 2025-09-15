import java.util.*;
public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // convert cm to m
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // weight, height

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) for person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        System.out.printf("%-10s %-10s %-10s %-15s\n","Weight","Height","BMI","Status");
        for (int i = 0; i < 10; i++) {
            double bmi = calculateBMI(data[i][0], data[i][1]);
            System.out.printf("%-10.1f %-10.1f %-10.2f %-15s\n",
                    data[i][0], data[i][1], bmi, getStatus(bmi));
        }
    }

}
