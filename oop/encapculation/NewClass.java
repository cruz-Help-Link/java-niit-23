import java.util.Scanner;

public class NewClass {
    private String name;
    private String subject;
    private int score;


    //CONSTRUCTOR
    NewClass(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    // METHOD OVERLOADING--> POLYMORPHISM

    void getGrade(String sub) {
        System.out.println("Enter subject");
        Scanner sc = new Scanner(System.in);
        sub = sc.nextLine();
        switch (sub) {
            case "Java" -> System.out.println("Quite Easy");
            case "Python" -> System.out.println("Really Easy");
            case "Assembly" -> System.out.println("Big Deal");
            default-> System.out.println("Invalid input");
        }
    }
    void getGrade(int... scores){
        System.out.println(scores[i]);

    }
    void getGrade(String name, double... scores){
    }
    //METHOD
    void getHelp(String msg) {
        //METHOD BODY- STATEMENTS
    }

    //STATIC METHOD USING ELLIPSES(...)
    static String doSomething(String word, int number, double... values) {
        System.out.println(values[0] + values[1] + values[2]);
        return word;
    }

    static double printNum(double ret) {
        ret = 34.6;
        return ret;
    }
    public static void main(String[] args) {
        doSomething("null", 23, 23.4, 56.5, 90);
        System.out.println("JAVA CLASS");
        NewClass nc = NewClass();
        nc.getGrade(23,45,67);
        nc.getGrade("Java");
        nc.getHelp("msg");
    }
}
