public class DaySwitch {

    public static void main(String[] args) {
        int day = 5;
        String dayString;

        // Switch statement with int data type
        switch (day) {

            // Case
            case 1->
                dayString = "Monday";

            // Case
            case 2->
                dayString = "Tuesday";

            // Case
            case 3->
                dayString = "Wednesday";

            // Case
            case 4->
                dayString = "Thursday";

            // Case
            case 5->
                dayString = "Friday";

            // Case
            case 6->
                dayString = "Saturday";

            // Case
            case 7->
                dayString = "Sunday";

            // Default case
            default->
                dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}
