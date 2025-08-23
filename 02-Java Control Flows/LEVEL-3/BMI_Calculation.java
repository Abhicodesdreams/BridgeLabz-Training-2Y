import java.util.Scanner;
public class BMI_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("Enter your weight and height : ");
        double Weight = sc.nextDouble(); // Weight in Kg
        double Height = sc.nextDouble(); // Height in cm

         double Height_meter = Height/100; // in metres

        double bmi = Weight/(Height_meter*Height_meter);

        System.out.println("BMI = "+bmi);

        if(bmi<18.5){
            System.out.println("Underwight");
        } else if(bmi>=18.5 && bmi<25){
            System.out.println("Normal");
        }else if(bmi>=25 && bmi<40){
            System.out.println("OverWeight");
        }else{
            System.out.println("Obese");
        }



    }
}
