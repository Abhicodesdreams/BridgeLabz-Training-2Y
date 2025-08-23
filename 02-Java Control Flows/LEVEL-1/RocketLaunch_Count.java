import java.util.Scanner;
public class RocketLaunch_Count {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Count : ");
        int counter= sc.nextInt();

        while(counter>=1){
            System.out.println(counter);
            counter--;
        }
        System.out.println("Rocket Launched : Boom");


    }
}
