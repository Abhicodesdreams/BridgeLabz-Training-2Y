import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class CheckPos_Neg_EvenOdd_Compare {
    public static void main(String[] args) {

        int n = 5;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];

        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for( int num : arr){
            if(num>0){
                if(num%2==0){
                    System.out.println("The number "+num+" is positive and Even.");
                }
                else{
                    System.out.println("The number "+num+" is Positive and Odd.");
                }
            }
            else if(num<0){
                System.out.println(num+" is Negative");
            }else{
                System.out.println(num+" is Zero");
            }
        }
        if(arr[0]==arr[arr.length-1]){
            System.out.println("First and Last Elements are Equal");
        }else if(arr[0]>arr[arr.length-1]){
            System.out.println("First element is Greater");
        }else{
            System.out.println("Last Element is Greater");
        }

    }
}
