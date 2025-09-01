import java.util.*;
public class StudentRegisterationSystem {

    public static void displayAllStudents(String[] Students){

        System.out.println("---STUDENTS ARE----- : ");

        for(String s : Students){
            System.out.println(s);
        }

    }

    public static void String_Compare(String s1 , String s2){
        System.out.println("Comparing strings ==> s1 :  "+s1+" and  String s2 : "+s2);
        System.out.println("Using == operator : "+(s1==s2)); // checks address
        System.out.println("Using .equals() Method : "+s1.equals(s2)); // checks content
    }
    public static void Searching_Student(String[] students, String searchName) {
        boolean found = false;
        for (String s : students) {
            if (s.equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Student Registered");
        } else {
            System.out.println("Student Not Found");
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Students to be Registered : ");
        int n = sc.nextInt();



        String[] Students = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name " + (i + 1) + ": ");
            Students[i] = sc.next();
        }

        displayAllStudents(Students);

        String s1 = "Abhishek";
        String s2 = "Abhishek"; // now , s1 and s2 will refer to same as they are in same Stringpool
        String s3 = new String("Abhishek"); // here , we are creating using new keyword so new address in heap

        System.out.println("--- String Constant Pool Behavior ---");
        String_Compare(s1, s2); // true for == (same String constant pool reference)

        System.out.println(); // Line change in output terminal

        String_Compare(s1, s3); // false for == (different object), true for equals() bcoz it checks CONTENT !!

        // Immutability Check
        String original = Students[0];
        String modified = original.concat(" Kumar"); // new object is created , Immutability is not Hindered !
        // here , I am concatenating Kumar in string Abhishek ;

        System.out.println("-- Immutability representation  ---");

        System.out.println("Original: " + original);
        System.out.println("After concat(): " + modified);

          // Searching for a student :

        System.out.print("Enter student name to search: ");

        String searchName = sc.next();
        Searching_Student(Students, searchName);


        // OUTPUT STRINGBUILDER :

        StringBuilder sbd = new StringBuilder(Students[0]);
        sbd.append(" Goyal ");
        sbd.insert(0, "Mr.");  // Mr. Abhishek Goyal
        sbd.delete(0, 2); //.delete(start,end)
        System.out.println("StringBuilder : " + sbd);



    }
}
