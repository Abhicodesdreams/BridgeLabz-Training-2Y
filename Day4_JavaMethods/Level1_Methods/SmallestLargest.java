import java.util.Scanner;
public class SmallestLargest {
    static int[] CalcSmallLarge(int n1 , int  n2 , int n3){

        int smallest = Math.min(n1 , Math.min(n2,n3));
        int largest = Math.max(n1,Math.max(n2,n3));

        return new int[]{smallest,largest};
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");

        int n1 = sc.nextInt() , n2=sc.nextInt() , n3 = sc.nextInt();

      int[] arr =  CalcSmallLarge(n1,n2,n3);

        System.out.println("The smallest number : "+arr[0]+" and The largest number : "+arr[1]);


    }
}
