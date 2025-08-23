import java.util.Scanner;
public class Youngest_Tallest_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of all 3 of them : ");
        int age1 = sc.nextInt();  //Amar
        int age2 = sc.nextInt(); // Akbar
        int age3 = sc.nextInt(); // Anthony

        System.out.print("Enter Height for all 3 of them : ");
        float Height1 = sc.nextFloat(); // Amar
        float Height2 = sc.nextFloat(); // Akbar
        float Height3 = sc.nextFloat(); // Anthony

        if(age1<age2 && age1<age3){
            System.out.println("Amar is smallest in age among 3 ");
        } else if (age2<age1 && age2<age3){
            System.out.println("Akbar is smallest in age among 3");
        } else {
            System.out.println("Anthony is smallest in age among 3 ");
        }
        // Now , similarly for height

        if (Height1>Height2 && Height1>Height3){
            System.out.println("Amar is tallest in height among 3 ");
        } else if (Height2>Height1 && Height2>Height3){
            System.out.println("Akbar is Tallest in Height among 3 ");
        } else {
            System.out.println("Anthony is Tallest in Height among 3 ");
        }
    }
}
