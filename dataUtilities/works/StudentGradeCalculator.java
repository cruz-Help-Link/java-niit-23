import java.util.ArrayList;
import java.util.List;

public class StudentGradeCalculator {

    public static List<StudentAverage> calculateAverage(List<Student> students) {
        List<StudentAverage> averages = new ArrayList<>();

        for (Student student : students) {
            String name = student.getName();
            List<Integer> grades = student.getGrades();
            
            // Calculate the average grade
            double sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            double average = sum / grades.size();

            // Create a new StudentAverage object and add it to the list
            StudentAverage studentAverage = new StudentAverage(name, average);
            averages.add(studentAverage);
        }

        return averages;
    }

public static void main(String[] args) {
        // Example usage
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", List.of(85, 90, 78)));
        students.add(new Student("Alice", List.of(92, 88, 95)));
        students.add(new Student("Bob", List.of(75, 80, 85)));

        List<StudentAverage> averages = calculateAverage(students);

        // Display the results
        for (StudentAverage studentAverage : averages) {
            System.out.println(studentAverage.getName() + ": " + studentAverage.getAverage());

        }
    }
}