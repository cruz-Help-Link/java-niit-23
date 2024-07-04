import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
    int rollno;
    String name;
    int score;

    Student(int rollno, String name, int score) {
        this.rollno = rollno;
        this.name = name;
        this.score = score;
    }

    public int compareTo(Student st) {
        if (rollno == st.rollno)
            return 0;
        else if (rollno > st.rollno)
            return 1;
        else
            return -1;
    }
}

// Creating a test class to sort the elements
public class TestSort {
    public static void main(String args[]) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Munirat", 73));
        al.add(new Student(106, "Joseph", 61));
        al.add(new Student(105, "Tomi", 85));

        Collections.sort(al);
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.score);
        }
    }
}