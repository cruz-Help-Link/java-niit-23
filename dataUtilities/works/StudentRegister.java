import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class StudentRegister {
    public static void main(String[] args) {
        Student st = new Student("Name", 100);

        // List of students with their names and scores
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jude", 89));
        students.add(new Student("Mike", 92));
        students.add(new Student("Joseph", 78));
        students.add(new Student("Dami", 95));
        students.add(new Student("Temi", 88));
        student.add(st);

        // Find top-performing students with scores above 75 and assign grades
        List<Student> topStudents = findTopPerformers(students, 75);

        // Output the top-performing students with grades
        System.out.println("Top-performing students:");
        for (Student student : topStudents) {
            System.out.println(student.getName() + ": " + assignGrade(student.getScore()));
        }
    }

    // Function to find top-performing students and assign grades
    public static List<Student> findTopPerformers(List<Student> students, int threshold) {
        List<Student> topPerformers = new ArrayList<>();

        // Iterate over the students
        for (Student student : students) {
            // Add students with scores above the threshold to the topPerformers list
            if (student.getScore() > threshold) {
                topPerformers.add(student);
            }
        }

        return topPerformers;
    }

    // Function to assign grades based on scores
    public static String assignGrade(int score) {
        if (score >= 70) {
            return "A";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else if (score >= 45) {
            return "D";
        } else if (score >= 40) {
            return "E";
        } else {
            return "F";
        }
    }
}
