import java.util.Scanner;
 // import java.util.Locale;

public class LibraryBook_ManagementSystem {

   static  void View_BookData(String bookTitle , String AuthorName ,  String bookId , boolean IsAvailable){

        System.out.println("======= BOOK INFO ======== ");
        System.out.println(" Title  : "+bookTitle);
        System.out.println(" Author  : "+AuthorName);
       // Locale locale2 = new Locale("fr", "FR");
        System.out.println("Book ID : "+bookId.toUpperCase());
        System.out.println("Available: "+(IsAvailable ? "Yes" :" No"));
       System.out.println("Author Name Length: " + AuthorName.length());
    }

    // Now , total Ratings given :
   static  int Totalratings(int[] Ratings){
        return Ratings.length;
    }

     static double AverageRating(int[] Ratings ){
        int sum =0 ;
        for ( int i : Ratings){
            sum=sum+i;
        }
        return (double)sum/Ratings.length;
    }

    static void CompareAuthornames(String i , String j ){
       if(i.equals(j)){
           System.out.println("Comparing with "+j+" => Same author ");
       }else {
           System.out.println("Comparing with "+j+" =>  Different author ");
       }
    }

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter book title :");
       String bookTitle = sc.nextLine();

        System.out.print("Enter Author name :");
        String AuthorName = sc.nextLine();

        System.out.print("Enter Book id :");
        String bookId = sc.nextLine();

        System.out.print(" is Book Available ? (true /false) : ");
        boolean IsAvailable =  sc.nextBoolean();

        // now , we will take input of ratings :

        System.out.print("Enter no. of ratings :");
        int no_ratings = sc.nextInt();

        int [] bookratings = new int[no_ratings];
        boolean PoorRating = false;

        for ( int i =0;i<no_ratings;i++){
            System.out.print("Enter rating "+(i+1)+" : ");
            bookratings[i] = sc.nextInt();
            if(bookratings[i]<=2){
                PoorRating = true ;
            }
        }

        // Now , I will start calling all the functions :
        View_BookData(bookTitle , AuthorName , bookId , IsAvailable );
        CompareAuthornames(AuthorName ,"Shakespeare");

        System.out.println("======= RATINGS =======");

        for( int i =0 ;i<no_ratings;i++){
            System.out.println("Rating "+(i+1)+" => "+bookratings[i]);
        }
        if(PoorRating){
            System.out.println("One user gave poor rating !");
        }
        System.out.println("Total RATINGS : "+Totalratings(bookratings));

        double avg = AverageRating(bookratings);
        System.out.println("Average Rating : "+avg);

        String status ;
        if(avg>=4.5){
            status ="Excellent Book";
        } else if(avg>=3.5){
            status ="Average Book";
        } else{
            status = "Poor Book";
        }
        System.out.println();

        System.out.println("Book Status : "+status);





    }
}
