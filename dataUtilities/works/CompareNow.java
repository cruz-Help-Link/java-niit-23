import java.util.Collections;
import java.util.Comparator;

class Birth implements Comparable<Birth> {
    int day; int month; int year;

    Birth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public int compareTo(Birth b) {
        return this.year - b.year;
    }

    int getDay() {
        return day;
    }
    int getMonth() {
        return month;
    }
    int getYear() {
        return year;
    }
} 

class YearComp implements Comparator<Birth> {
    @Override
	public int compare(Birth b1, Birth b2)
	{
		if (b1.getYear() < b2.getYear())
			return -1;
		if (b1.getYear() > b2.getYear())
			return 1;
		else
			return 0;
	}
}

public class CompareNow {
    public static void main(String[] args) {
        ArrayList<Birth> list = new ArrayList<Birth>();
        list.add(new Birth(12, 10, 2000));
        list.add(new Birth(25, 5, 1997));
        list.add(new Birth(30, 3, 2004));
        list.add(new Birth(30, 9, 1994));
        list.add(new Birth(30, 8, 1999));

        System.out.println("Sorted by Year");
        YearComp compare = new YearComp();
            Collections.sort(list, compare);
            for (Birth birth : list)
                System.out.println(birth.getDay() + " "
                                + birth.getMonth() + " "
                                + birth.getYear());
    }
}
