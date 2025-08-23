import java.util.Scanner;
public class RocketLaunch_ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Counter = sc.nextInt();

        for ( int i=Counter ; Counter>=1; Counter--){
            System.out.println(Counter);
        }
        System.out.println("Rocket launched : Boom");

    }
}
