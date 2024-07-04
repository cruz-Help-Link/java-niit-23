class Person { //PARENT CLASS
    void getType() {
        System.out.println("TYPE");
    }
}

class Student extends Person { //CHILD CLASS
    String name; 
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void getScore() { //INSTANCE METHOD
        System.out.println("SCORE");
    }

    static void getRollCall() { //STATIC METHOD
        System.out.println("ROLLCALL");
    }

    public static void main(String[] args) {
        Student st = new Student("John", 110);
        st.getScore();  
        Student.getRollCall();
    }
}

public class StudentConstr {
    public static void main(String[] args) {
        Student student = new Student("Munirat", 101);
        Person p = new Student("John", 110);
        Student.getRollCall();
        ((Student)p).getScore(); //casting
    }
}
