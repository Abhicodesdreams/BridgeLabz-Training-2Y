import java.util.*;

public class Copy2dArray_1dArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns : ");

        System.out.print("Rows : ");
        int rows = sc.nextInt();

        System.out.println();

        System.out.print("Columns : ");
        int cols = sc.nextInt();

        int[][] two_dim = new int[rows][cols];
        int [] one_dim = new int[rows*cols];
        int index=0;

        System.out.println("Enter elements of matrix : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                two_dim[i][j] = sc.nextInt();
                one_dim[index++] = two_dim[i][j];
            }
        }
        System.out.println("Elements of 2d array are : ");
        System.out.println(Arrays.deepToString(two_dim));

        System.out.println("Elements of 1d array are : ");

        System.out.println(Arrays.toString(one_dim));
        }

    }

