import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import javax.xml.datatype.Duration;

/**
 * Time
 */
public class Time {

    public static void main(String[] args) {
        //PRESENT TIME
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        LocalDate tomorrow = LocalDate.now().plusDays(1); //TOMMORROWS DATE
        System.out.println(tomorrow);

        DayOfWeek friday = LocalDate.parse("2023-10-27").getDayOfWeek(); //GET FRIDAY
        int no = LocalDate.parse("2023-10-27").getDayOfMonth(); // GET 27TH
        System.out.println(friday + " "+ no);

        LocalDateTime beginningOfDay = LocalDate.parse("2023-10-27").atStartOfDay(); // 00:00:00
        LocalDate firstDayOfMonth = LocalDate.parse("2023-10-27").with(TemporalAdjusters.firstDayOfMonth()); // 2023-10-01
        System.out.println(beginningOfDay + " " + firstDayOfMonth);
//LOCAL TIME
        LocalTime elevenThirty = LocalTime.of(11, 30);
        LocalTime twelveThirty = LocalTime.parse("11:30").plus(1, ChronoUnit.HOURS); // ADD AN OUR TO elevenThirty
        LocalTime maxTime = LocalTime.MAX; //MAXIMUM TIME
        LocalDateTime today = LocalDateTime.of(2023, Month.OCTOBER, 27, 11, 30); //SETTING DATE AND TIME
// ZONE
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId); //LocalDateTime can be converted to a specified zone
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds(); // OUTPUT'S ALL THE ZONES
//PERIOD
        LocalDate initialDate = LocalDate.parse("2000-10-27");
        LocalDate finalDate = LocalDate.parse("2020-10-29");
        int two = Period.between(initialDate, finalDate).getDays(); // 29- 27 = 2
        System.out.println(two);
        long days = ChronoUnit.DAYS.between(initialDate, finalDate); //DAYS BETWEEN INITAILDATE & FINALDATE
        System.out.println(days);
        LocalDate addDate = initialDate.plus(Period.ofDays(5)); // ADDING 5 DAYS TO TODAY'S DATE
        System.out.println(addDate);
//DURATION
        LocalTime initialTime = LocalTime.of(6, 30, 0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(530)); //ADDING 530 sec TO initialTime
        long thirty = Duration.between(initialTime, finalTime).toMinutes();
        System.out.println(thirty);
    }
}

// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMyyyy HH:mm:ss");
// String formattedDate = myDateObj.format(myFormatObj);
// System.out.println("After formatting: " + formattedDate);