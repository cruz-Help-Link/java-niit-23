public class Student {
    int id;
    String name;
   
    Student(int id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("Constructor with two arguments : "
        + " String and Integer : " + id + " " + name);
    }

    public static void main(String[] args) {
        Student[] arr;
 
        // allocating memory for 5 objects of type Student.
        arr = new Student[5];
 
        // initialize the first elements of the array
        arr[0] = new Student(1, "benny");
 
        // initialize the second elements of the array
        arr[1] = new Student(2, "lenny");
 
        // so on...
        arr[2] = new Student(3, "jenny");
        arr[3] = new Student(4, "penny");
        arr[4] = new Student(5, "zenny");
 
        // accessing the elements of arr array using for loop
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : "
                               + arr[i].id + " "
                               + arr[i].name);

        Student[] myStudents = new Student[]{new Student(1,"Benny"),new Student(2,"Lenny"),new Student(3,"jenny"),new Student(4,"penny"),new Student(5,"Zenny")};
   
        // accessing the elements of student array using for each
        for(Student m:myStudents){   
            System.out.println(m);
        }
    
    }
}
