import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentGrade students = new StudentGrade();

    public static void main(String[] args) {

        boolean quit = false;
        while (!quit) {

            System.out.println("\nEnter action : 6) to show available action: ");
            int action = scanner.nextInt();

            switch (action) {
                case 0 -> {
                    System.out.println("Shutting Down....");
                    quit = true;
                }
                case 1 -> print();
                case 2 -> addNewSubject();
                case 3 -> updateSubject();
                case 4 -> removeSubject();
                case 5 -> getAverageScore();
                case 6 -> printActions();

            }
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0. - to shutdown" +
                "\n1.- to print subject" +
                "\n2 - to add new subject" +
                "\n3- to update an existing subject" +
                "\n4 - to remove a subject" +
                "\n5- query if an existing subject exist(in progress.....) Get Average Score" +
                "\n6- to print a list of available actions");
        System.out.println("Choose your action: ");

    }

    private static void getAverageScore() {
        System.out.println("Enter student  name: ");
        String name = scanner.next();

        students.calculateAverageScoreForStudent(name);

    }

    private static void updateSubject() {
        System.out.println("Enter name: ");
        String sName = scanner.next();

        System.out.println("Enter existing Subject Name: ");
        String name = scanner.next();
        Subject existingSubject = students.querySubject(name);
        if (existingSubject == null) {
            System.out.println("Subject Not Found");
            return;
        }
        System.out.println("Enter new Subject Name: ");
        String newName = scanner.next();
        System.out.println("Enter score: ");
        int newScore = scanner.nextInt();
        Subject newSubject = Subject.createSubject(sName, newName, newScore);
        if (students.updateSubject(existingSubject, newSubject)) {
            System.out.println("Added Succesfully");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void removeSubject() {
        System.out.println("Enter subject name: ");
        String name = scanner.next();

        Subject existingSubject = students.querySubject(name);
        if (existingSubject == null) {
            System.out.println(" subject not found");
            return;
        }
        if (students.removeSubject(existingSubject)) {
            System.out.println("Succesfully Deleted");
        } else {
            System.out.println("error deleting");
        }
    }

    private static void addNewSubject() {
        System.out.println("Enter student Name: ");
        String sName = scanner.next();
        //
        System.out.println("Enter Subject Name: ");
        String subjectName = scanner.next();

        System.out.println("Enter Subject score : ");
        int score = scanner.nextInt();

        Subject newSubject = Subject.createSubject(sName, subjectName, score);

        if (students.addSubjectGrade(newSubject)) {
            System.out.println("\nNew subject Added: Name " + subjectName + " Score " + score);
        } else {
            System.out.println("Cannot add , " + subjectName + "Already exist");
        }
    }

    private static void addNew() {
        System.out.println("Enter student Name: ");
        String sName = scanner.next();

        System.out.println("Enter Subject Name: ");
        String subjectName = scanner.next();

        System.out.println("Enter Subject score : ");
        int score = scanner.nextInt();

        Subject newSubject = Subject.createSubject(sName, subjectName, score);

        if (students.addSubjectGrade(newSubject)) {
            System.out.println(sName + "\nNew subject Added: Name " + subjectName + " Score " + score);
        } else {
            System.out.println("Cannot add , " + subjectName + "Already exist");
        }

    }

    private static void print() {
        System.out.println("Enter name: ");
        String name = scanner.next();
        // check in printGrades() if its possible to print out the list of only the name
        // given;
        //
        students.printGrades(name);

    }

    private static void start() {
        System.out.println("Starting.............");
    }

}

class StudentGrade {

    private final ArrayList<Subject> subjectsList;

    public StudentGrade() {

        this.subjectsList = new ArrayList<Subject>();
    }

    public boolean addSubjectGrade(Subject subject) {
        String studentName = subject.getStudentName();
        String subjectName = subject.getSubjectName();

        int existingSubjectIndex = findSubject(subjectName);
        if (existingSubjectIndex >= 0 && subjectsList.get(existingSubjectIndex).getStudentName().equals(studentName)) {
            System.out.println("Subject " + subjectName + " for student " + studentName + " already exists");
            return false;
        }

        subjectsList.add(subject);
        System.out.println("New subject Added: Name " + subjectName + " Score " + subject.getSubjectScore());
        return true;
    }

    // Inside the StudentGrade class
    // Inside the StudentGrade class
    public void calculateAverageScoreForStudent(String studentName) {
        if (subjectsList.isEmpty()) {
            System.out.println("No subjects found to calculate average scores.");
            return;
        }

        System.out.println("Average Score for " + studentName + ":");

        int totalScore = 0;
        int subjectCount = 0;

        for (Subject subject : subjectsList) {
            if (subject.getStudentName().equals(studentName)) {
                totalScore += subject.getSubjectScore();
                subjectCount++;
            }
        }

        // Check if the student has subjects
        if (subjectCount > 0) {
            double averageScore = (double) totalScore / subjectCount;
            System.out.println("Average Score: " + averageScore);
        } else {
            System.out.println("No subjects found for " + studentName);
        }
    }

    private boolean studentNameExists(String studentName) {
        for (Subject s : subjectsList) {
            if (s.getStudentName().equals(studentName)) {
                return true;
            }
        }
        return false;
    }

    public boolean updateSubject(Subject oldSubject, Subject newSubject) {
        int findPosition = findSubject(oldSubject);
        if (findPosition < 0) {
            System.out.println(oldSubject.getSubjectName() + " was not found");
            return false;
        } else if (findSubject(newSubject.getSubjectName()) != -1) {
            System.out.println("Subject " + newSubject.getSubjectName() + "already exists .\nUpdate not successful");
        }
        this.subjectsList.set(findPosition, newSubject);
        System.out.println(oldSubject.getSubjectName() + ", was replaced with " + newSubject.getSubjectName());
        return true;
    }

    private int findSubject(Subject subject) {
        return this.subjectsList.indexOf(subject);
    }

    private int findSubject(String subjectName) {
        for (int i = 0; i < subjectsList.size(); i++) {
            Subject subject = this.subjectsList.get(i);
            if (subject.getSubjectName().equals(subjectName)) {
                return i;
            }
        }
        return -1;
    }

    public int findSubjectName(String subjectName) {
        for (int i = 0; i < this.subjectsList.size(); i++) {
            Subject subject = this.subjectsList.get(i);
            if (subject.getStudentName().equals(subjectName)) {
                return i;
            }
        }
        return -1;

    }

    public Subject querySubject(String name) {
        int position = findSubject(name);
        if (position >= 0) {
            return this.subjectsList.get(position);
        }
        return null;
    }

    public boolean removeSubject(Subject subject) {
        int position = findSubject(subject);
        if (position < 0) {
            System.out.println(subject.getSubjectName() + " Was not found");
            return false;
        }
        this.subjectsList.remove(position);
        System.out.println(subject.getSubjectName() + " was deleted.");
        return true;
    }

    public int printGrade() {
        int grade = 0;
        System.out.println("List");
        for (int i = 0; i < this.subjectsList.size(); i++) {
            grade = Integer.parseInt((i + 1) + ". " + this.subjectsList.get(i).getSubjectName() + ": " +
                    this.subjectsList.get(i).getSubjectScore());
        }
        return grade;
    }

    public void printGrades(String studentName) {
        int i = 0;
        System.out.println("Grades for " + studentName + ":");

        for (Subject subject : this.subjectsList) {
            if (subject.getStudentName().equals(studentName)) {
                System.out.println((i + 1) + ". " + subject.getSubjectName() + ": " + subject.getSubjectScore());
                i++;
            }
        }

        if (i == 0) {
            System.out.println("No grades found for " + studentName);
        }
    }

    public int getNumOfSubject() {
        return subjectsList.size();

    }

}

class Subject {
    private String studentName;
    private String subjectName;
    private int subjectScore;

    public Subject(String studentName, String subjectName, int subjectScore) {
        this.studentName = studentName;
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSubjectScore() {
        return subjectScore;
    }

    public void setSubjectScore(int subjectScore) {
        this.subjectScore = subjectScore;
    }

    public static Subject createSubject(String studentName, String subjectName, int subjectScore) {
        return new Subject(studentName, subjectName, subjectScore);
    }

}