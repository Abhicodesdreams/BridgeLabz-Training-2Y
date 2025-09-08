import java.util.*;
public class MultiplicationResult_6To9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number whose multiplication table you want to print : ");
        int num=sc.nextInt();

        int[] MultiplicationResult = new int[4];

        int index=0;

        for(int i =6 ;i<=9;i++){
            MultiplicationResult[index]=num*i;
            index++;
        }
        index=0;
        for(int i=6;i<=9;i++){
            System.out.println(num+" * "+i+" = "+MultiplicationResult[index]);
            index++;
        }
    }
}
