import java.util.*;
public class MeanHeight_FootballTeam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] Heights = new double[11];

        double sum =0;

        for(int i=0;i<Heights.length;i++){
            Heights[i]=sc.nextDouble();
            sum+=Heights[i];
        }

        double mean = sum/Heights.length;
        System.out.println("Mean Height : "+mean);

    }
}
