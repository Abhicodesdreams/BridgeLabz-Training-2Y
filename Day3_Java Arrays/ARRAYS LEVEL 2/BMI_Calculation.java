import java.util.*;
public class BMI_Calculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons whose Bmi is to be calculated  : ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];

        double[] BMI = new double[n];
        String[] status = new String[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter weight in (Kg) of person "+(i+1)+" : ");
            weight[i]=sc.nextDouble();

            System.out.println("Enter height (m) of person "+(i+1)+" : ");
            height[i]=sc.nextDouble();

            BMI[i] = weight[i]/(height[i]*height[i]);

            if(BMI[i]<18.5) {
                status[i]="Underweight";
            } else if(BMI[i]<25){
                status[i]="Normal";
            }else if(BMI[i]<30){
                status[i]="OverWeight";
            }else {
                status[i]="Obese";
            }
        }
        System.out.println("----BMI REPORT-----");
        for(int i=0;i<n;i++){
            System.out.println("Person "+(i+1)+ "==>"+" Height : "+height[i]+" &  Weight : "+weight[i]+" &  BMI : "+BMI[i]+" & Status : "+status[i] );
        }

    }
}
