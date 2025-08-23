import java.util.Scanner;
public class SpringSeason_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day and month : ");
       int day = sc.nextInt();
       int month = sc.nextInt();

       boolean SpringSeason = ( (month==3 && day>=20) || (month==4) || (month==5) || (month==6 && day<=20) );

     if(SpringSeason){
         System.out.println("It's a Spring Season");
     }
     else {
         System.out.println("Not a Spring Season");
     }

    }
}
