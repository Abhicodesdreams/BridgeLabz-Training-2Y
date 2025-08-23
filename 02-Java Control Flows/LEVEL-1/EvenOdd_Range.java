import java.util.Scanner;
public class EvenOdd_Range {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a natural number : ");
        int n = sc.nextInt();

        if(n>0){
            for (int i=1;i<=n;i++){
                if (i%2==0){
                    System.out.println(i+" is an Even number");
                }
                else {
                    System.out.println(i+" is an Odd number");
                }
            }
        }
        else{
            System.out.print(" Please Enter a natural number !!");
        }


    }
}
