import java.util.*;

import javax.swing.JOptionPane;
import java.time.ZoneId;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DateExc {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date
        JOptionPane.showMessageDialog(null, myObj);

        LocalTime myObj1 = LocalTime.now();
        System.out.println(myObj1);
        JOptionPane.showMessageDialog(null, myObj1);

        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println(myObj2);
        JOptionPane.showMessageDialog(null, myObj2);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        JOptionPane.showMessageDialog(null, myDateObj);

        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
        JOptionPane.showMessageDialog(null, formattedDate);

        // ZoneId zoneId = ZoneId.of("Europe/Paris");
        // create a clock which ticks in whole minute
        // Clock clock = Clock.tickMinutes(zoneId);
  
        // get ZonedDateTime object to print time
        // ZonedDateTime time = clock.instant().atZone(clock.getZone());
  
        // print time variable value
        // System.out.println("Date and Time :" + time);
    }
}
