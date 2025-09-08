import java.util.*;
public class VotingEligibility_10Students {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ages of 10 students : ");
        int [] ages = new int[10];

        for(int i =0;i<ages.length;i++){
            ages[i]=sc.nextInt();
        }
        for(int age : ages){
            if(age<0){
                System.out.println("Invalid age : "+age);
            } else if (age>=18){
                System.out.println("The student with age "+age+" can vote ");
            } else {
                System.out.println("The studnt with age "+age+" cannot vote ");
            }
        }

    }
}
