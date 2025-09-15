import java.util.Scanner;
public class ArrayIndexDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            arr[i] = sc.next();
        }

        // Access last valid index instead of invalid one
        System.out.println("Last element in array: " + arr[n - 1]);
    }

    }

