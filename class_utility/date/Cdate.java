import java.util.Calendar;
import java.util.Date;
import java.time.ZonedDateTime;
public class Cdate {
   public static void main(String[] args) 
   {
      //Getting the current date
      Date date = new Date();
      //return the time in millis
      long timeMilli = date.getTime();
      System.out.println("Time in milliseconds using Date class: " + timeMilli);

      //Calendar instance
      Calendar cal = Calendar.getInstance();
      //Return current time in millis
      long timeMilli2 = cal.getTimeInMillis();
      System.out.println("Time in milliseconds using Calendar: " + timeMilli2);
      
      //Java 8
      System.out.println("Getting time in milliseconds in Java 8: " + 
      ZonedDateTime.now().toInstant().toEpochMilli());
   }
}