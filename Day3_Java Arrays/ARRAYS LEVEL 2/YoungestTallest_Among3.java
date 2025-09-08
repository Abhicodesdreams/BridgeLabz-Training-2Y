import java.util.*;
public class YoungestTallest_Among3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names ={"Amar" , "Akbar" , "Anthony"};

        int[] age = new int[3];
        double[] height = new double[3];

        for(int i=0;i<age.length;i++){
            System.out.print("Enter age of "+names[i]+" : ");
            age[i]=sc.nextInt();
            System.out.print("Enter height of "+names[i]+" (in cm's) : ");
            height[i]=sc.nextDouble();
        }
        int MinAge_Pointer=0;
        for(int i=1;i<age.length;i++){
            if(age[i]<MinAge_Pointer){
                MinAge_Pointer=i;
            }
        }
        int MaxHeight_Pointer=0;
        for(int i=1;i<height.length;i++){
            if(height[i]>MaxHeight_Pointer){
                MaxHeight_Pointer=i;
            }
        }

        System.out.println("The youngest of all 3 is : "+names[MinAge_Pointer]);
        System.out.println("The Tallest of all 3 is : "+names[MaxHeight_Pointer]);
    }
}
