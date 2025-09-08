import java.util.*;
public class FizzBuzz_StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num whose multiples will decide FizzBuzz : ");
        int num = sc.nextInt();

        if(num<=0){
            System.out.println("Not positive");
        }

        String[] result = new String[num+1];

        for(int i=1;i<=num;i++){
            if(i%3==0 && i%5==0){
                result[i]="FizzBuzz";
            } else if(i%3==0){
                result[i]="Fizz";
            } else if (i%5==0) {
                result[i]="Buzz";
            } else{
                result[i]=String.valueOf(i);
            }
        }

        for(int i=1;i<=num;i++){
            System.out.println("Position "+i+ " = "+ result[i]);
        }



    }
}
