import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number whose table you want :");
        int n = sc.nextInt();

        for (int i=6;i<=9;i++){
            int output = n*i;
            System.out.println(n+" * "+i+" = " +output);

        }
    }
}
