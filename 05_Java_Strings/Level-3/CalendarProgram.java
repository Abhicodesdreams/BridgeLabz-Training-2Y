import java.util.*;
public class CalendarProgram {
    static String[] months = {
            "", "January","February","March","April","May","June",
            "July","August","September","October","November","December"
    };
    static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int dayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        if (m == 2 && isLeapYear(y)) days[m] = 29;

        System.out.println("   " + months[m] + " " + y);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int d = dayOfWeek(1, m, y);
        for (int i = 0; i < d; i++) System.out.print("   ");
        for (int i = 1; i <= days[m]; i++) {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[m])) System.out.println();
        }
    }

}
