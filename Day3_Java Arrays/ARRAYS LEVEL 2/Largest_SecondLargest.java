import java.util.*;
public class Largest_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int MaxDigit=10;
        int[] digits = new int[MaxDigit];;
        int index=0;

        while(number!=0){
            int last_digit=number%10;
            if(index==MaxDigit) break;
            digits[index++]=last_digit;
            number=number/10;
        }
        int largest=0 , secondLargest=0;

        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            } else if(digits[i]>secondLargest && digits[i]!=largest){
                secondLargest=digits[i];
            }
        }
        System.out.println("LARGEST DIGIT : "+largest);
        System.out.println("SECOND LARGEST DIGIT : "+secondLargest);
    }
}
