import java.util.*;
public class EvenOdd_Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<=0){
            System.out.println("Error : Not a natural number !");
        }

        int[] odd = new int[num/2+1];
        int[] even = new int[num/2+1];

        int OddIndex=0 , EvenIndex=0;

        for(int i=1;i<=num;i++){
            if(i%2==0){
                even[EvenIndex++]=i;
            }else{
                odd[OddIndex++]=i;
            }
        }
        for(int i=0;i<EvenIndex;i++){
            System.out.println("Even Numbers : "+even[i]);
        }
        for(int i=0;i<OddIndex;i++){
            System.out.println("Odd Numbers : "+odd[i]);
        }

        // we , can also use ArrayList<Integer> odd = new ArrayList<>();
       //  ArrayList<Integer> even = new ArrayList<>();

    }
}
