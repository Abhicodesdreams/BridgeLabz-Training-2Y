import java.util.Scanner;
public class Maximum_Handshakes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Students :");
        int N = sc.nextInt();  // N = number of students

       int Max_HandShakes = (N*(N-1))/2;

       System.out.println("The maximum number of Handshakes possible among " +N+ " students are "+Max_HandShakes);


    }
}
