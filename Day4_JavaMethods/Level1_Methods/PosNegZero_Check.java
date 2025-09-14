import java.util.Scanner;
public class PosNegZero_Check {


    static int Check(int n){
        if(n>0){
            return 1 ;
        } else if(n<0){
            return -1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = Check(n);
        System.out.println(result);
    }
}
