import java.util.Scanner;

// In this pgm , we are using (Zeller's Congruence Formula);

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if(args.length !=3){

            /* directly taking input from terminal in the form of string
             You have to give exactly 3 inputs to start the pgm , otherwise Usage and pgm will stop !
             */

            System.out.print("Usage : java DaysOfWeek formula <month> <day> <year> ?");
            return ;
        }


        int m = Integer.parseInt(args[0]); // this is month , I am converting string to integer
        int d = Integer.parseInt(args[1]); // this is day , I am converting String to integer
        int y = Integer.parseInt(args[2]); // this is year , I am converting string to integer

        /*
         If you want to give user input instead of Command line :

        int m = sc.nextInt(); // month formula
        int d = sc.nextInt(); // day formula
        int y = sc.nextInt(); // year input

        1 = jan , 2 = feb , 3 = march...
        0=Sunday , 1 = Monday , 2 = Tuesday .....6 = Saturday
         */

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; // Differential Equations !
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of week (0=Sunday … 6=Saturday): " + d0); // here , d0 = DayOFWeek;


    }
}
