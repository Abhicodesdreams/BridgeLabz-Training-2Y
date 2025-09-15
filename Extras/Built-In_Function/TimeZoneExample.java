import java.time.*;
public class TimeZoneExample {
    public static void main(String[] args) {
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // IST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // PST

        System.out.println("Greenwich Mean Time (GMT): " + gmtTime);
        System.out.println("Indian Standard Time (IST): " + istTime);
        System.out.println("Pacific Standard Time (PST): " + pstTime);
    }

}
