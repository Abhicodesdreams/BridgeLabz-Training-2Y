import java.util.*;
public class Sum_Nnatural {

    static int NaturalSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = NaturalSum(n);

        System.out.println("The sum of "+n+" natural number is : "+result);


    }
}
