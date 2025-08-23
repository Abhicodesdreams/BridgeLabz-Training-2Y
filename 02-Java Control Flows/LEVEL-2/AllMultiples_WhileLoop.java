import java.util.Scanner;
public class AllMultiples_WhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number whose Multiples you want to find :");
        int number = sc.nextInt();

    // Actually , I think the problem statement given by sir , is a bit wrong : So I am writing the pgm as per my acknowledgement from the question .

        if(number>0 && number<100){
            int counter = number-1;
            System.out.println("Multiples of "+number+" are :");
            while(counter<100){
                counter++;
                if(counter%number==0){
                    System.out.println(counter);
                    continue;
                }
            }
        }
        else {
            System.out.println("Number is out of Range");
        }
    }
}
