import java.util.*;
public class SpringSeason {

    static boolean isSpring(int month , int day){
        if(month ==3 && day>=20 || month==4 || month==5 || month==6 && day<=20){
            return true;
        } else {
            return false ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and day : ");

        int month = sc.nextInt();
        int day = sc.nextInt();

        boolean result = isSpring(month , day);

        if(result==true){
            System.out.println("It's a spring season");
        } else {
            System.out.println("Not a spring season");
        }



    }
}
