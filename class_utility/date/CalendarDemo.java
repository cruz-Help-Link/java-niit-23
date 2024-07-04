import java.util.*;

public class CalendarDemo {

    public void yankee() {
        DateFormat DFormat = DateFormat.getDateInstance();

        System.out.println("Object: " + DFormat);

        // Formatting the string
        String str = DFormat.format(new Date());

        // Printing the string date on console
        System.out.println(str);

        DateFormat DtFormat = DateFormat.getDateTimeInstance();

        // String formatting
        // String str = DtFormat.format(new Date());...

        // Displaying the Calendar
        // System.out.println(DFormat.getCalendar());...

        // tyuil,kuyt
        // DateFormat DtFormat = new SimpleDateFormat("MM/ dd/ yy");...

        // // String formatting
        // String str = DtFormat.format(new Date());...

        // Displaying the Calendar
        System.out.println(DtFormat.getCalendar());

        // Locale...
        Locale local_list[] = DateFormat.getAvailableLocales();

        // Print the locales
        // along with display names
        System.out.println("Available Locales" + " :: Display names\n");
        for (int count = 0; count < local_list.length; count++) {
            System.out.println(local_list[count].toString() + " :: " + local_list[count].getDisplayName());
        }

        for (int count = 0; count < local_list.length; count++) {
            System.out.println(local_list[count].getDisplayName(Locale.ITALY));
        }
    }

    public void yesMen() {
        DateFormat DtFormat = DateFormat.getDateInstance();

        // Converting the dateformat to string
        String str = DtFormat.format(new Date());

        // Original TimeZone
        System.out.println("The original timezone is: " + DtFormat.getTimeZone().getDisplayName());

        TimeZone time_zone = TimeZone.getTimeZone("GMT");

        // Modifying the time zone
        DtFormat.setTimeZone(time_zone);

        // Getting the modified timezones
        System.out.println("New TimeZone is: " + DtFormat.getTimeZone().getDisplayName());

        System.out.println("Is the clone equal? "
                + DtFormat.clone()
                        .equals(DtFormat));
    }

    public static void main(String[] args)
	{
		// Creating calendar object..
		Calendar calendar = Calendar.getInstance();

		// Display the current time zone..
		String cal = calendar.getTimeZone().getDisplayName();

		System.out.println("The Current Time" + " Zone: " + cal);

		TimeZone time_zone = TimeZone.getTimeZone("GMT");

		// Modifying the time zone
		calendar.setTimeZone(time_zone);

		// Displaying the modified zone
		System.out.println("Modified Zone: " + calendar.getTimeZone().getDisplayName());

		TimeZone timezone = TimeZone.getTimeZone("Pacific/Tahiti");
  
        // Modifying the time zone
        calendar.setTimeZone(timezone);
  
        // Displaying the modified zone
        System.out.println("Modified Zone: "
                + calendar.getTimeZone().getDisplayName());
	}
}
