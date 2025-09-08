import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        long num = sc.nextLong();

        int [] FreqCount=new int[10]; // 10 because digits are from 0 to 9

          while(num>0){
              int digit = (int)(num%10);
              FreqCount[digit]++;
              num=num/10;
          }

        System.out.println("The frequencies of digits are :");

          for(int i=0;i<10;i++){
              if(FreqCount[i]>0){
                  System.out.println(i+" => "+FreqCount[i]);
              }
          }


    }
}
