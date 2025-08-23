import java.util.Scanner;
public class AbundantNumber_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number you want to check as an Abundant number : ");
        int number = sc.nextInt();
        int sum=0;

        for (int i=1 ;i<number;i++){ // we do not include the number itself !
            if(number%i==0){
                sum=sum+i;
            }
        }
        if(sum>number){
            System.out.println(number+" is an Abundant Number");
        }else{
            System.out.println(number+" is not an Abundant Number");
        }

    }
}
