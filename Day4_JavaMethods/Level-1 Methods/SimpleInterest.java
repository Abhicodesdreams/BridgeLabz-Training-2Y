import java.util.*;
public class SimpleInterest {

    static double calcSimpleInterest(double principal , double time , double rate){
        return (principal*time*rate/100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();

       double si = calcSimpleInterest(p,t,r);

        System.out.println("The simple interest is "+si+" for principal "+p+",Rate of Interest "+r+" and time "+t);

    }
}
