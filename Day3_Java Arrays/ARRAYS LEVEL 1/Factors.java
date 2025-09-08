import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int maxSize=10;
        int[] factors = new int[maxSize];
        int index =0;

        for(int i=1;i<=num;i++){
            if(num%i==0){ // here , we are checking factors :
                if(index==maxSize){
                    maxSize*=2;
                    int[] temp = new int[maxSize];
                    for(int j=0;j<factors.length;j++){
                        temp[j]=factors[j];
                    }
                    factors=temp;
                }
                factors[index++]=i;
            }
        }

        System.out.println("Factors of "+num+ " are : ");

        for(int i=0;i<index;i++){
            System.out.println(factors[i]+" ");
        }
    }
}
