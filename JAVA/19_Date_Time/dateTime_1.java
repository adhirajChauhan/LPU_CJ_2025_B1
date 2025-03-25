import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

import java.time.format.DateTimeFormatter;

public class dateTime_1 {
   public static void main(String[] args) {

    //Get current date
    // LocalDate today = LocalDate.now();
    // System.out.println(today);

    //Create a specific date
    // LocalDate date = LocalDate.of(2011, 4, 2);
    // System.out.println(date);

    //Get date information
    // System.out.println(today.getYear());
    // System.out.println(today.getMonth());
    // System.out.println(today.getDayOfMonth());
    // System.out.println(today.getDayOfWeek());




    //Time
    // LocalTime time = LocalTime.now();
    // System.out.println(time);

        // LocalTime t = LocalTime.of(10, 30, 45);
        // System.out.println(t);

    // System.out.println(time.getHour());
    // System.out.println(time.getMinute());
    // System.out.println(time.getSecond());



    //Local date time


    // LocalDateTime dateTime = LocalDateTime.now();
    // System.out.println(dateTime);



    // LocalDate date = LocalDate.now();

    // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd /MM /yyyy");

    // String formattedDate = date.format(df);

    // System.out.println("New pattern of date : " + formattedDate);

    ZonedDateTime zt = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
    System.out.println(zt);

   } 
}
