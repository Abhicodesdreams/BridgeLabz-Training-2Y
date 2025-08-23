import java.util.Scanner;
public class AllMultiples_OfInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number whose multiples you want to find : ");
        int number = sc.nextInt();

        if(number>0 && number<100){
            for ( int i = 100 ; i>=1 ;i--){
                if (i%number==0){  // here is a bluff : We have to find multiples not factors , so do (i%number) not (number%i) ;
                    System.out.println(i);
                    continue;
                }
            }

        }
        else{
            System.out.println("Number is out of Range");
        }


    }
}
