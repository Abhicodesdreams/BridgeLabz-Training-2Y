import java.util.Scanner;
public class MaxHandshakes {

    static int TotalHandshake(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int n = sc.nextInt();

        int PossibleHandshakes=TotalHandshake(n);

        System.out.println("The Maximum handshakes possible are : "+PossibleHandshakes);


    }
}
