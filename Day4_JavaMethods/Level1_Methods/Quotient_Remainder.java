import java.util.*;
public class Quotient_Remainder {

    static int [] findQr(int number , int divisor){

        int quotient =  number/divisor;
        int  remainder = number%divisor;

        return new int[]{quotient,remainder};
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int div = sc.nextInt();

        int[] qr = findQr(num,div);

        System.out.println("Quotient : "+qr[0]+" Remainder : "+qr[1]);
    }
}
