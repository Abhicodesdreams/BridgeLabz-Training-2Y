import java.util.*;
public class ReverseNumber_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        String numString = Integer.toString(number);
        int[] digits = new int[numString.length()];

        for(int i=0;i<numString.length();i++){
            digits[i]=numString.charAt(i)-'0';
        }
        System.out.println("Reversed Number using Array : ");

        for(int i=digits.length-1;i>=0;i--){
            System.out.print(digits[i]);
        }

    }
}
