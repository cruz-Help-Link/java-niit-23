import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class SimpleDF {
   public static void main(String[] args) 
   {
   //Specifying the pattern of input date and time
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
   // String dateString = "12-08-2019 18:48:22";
   try{
      //converting dateString to Date 
      Date date = (Date) sdf.getTime(date);
      System.out.println("Given Time in milliseconds : "+date.getTime());

      Calendar calendar = Calendar.getInstance();
      //Setting the Calendar date and time to the given date and time
      calendar.setTime(date);
      System.out.println("Given Time in milliseconds : "+calendar.getTimeInMillis());
   }catch(ParseException e){
      e.printStackTrace();
    } 
   }
}