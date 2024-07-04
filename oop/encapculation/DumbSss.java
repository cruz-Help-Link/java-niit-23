import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class DumbSss {
    private int id;
    private String userName;
    private String email;
    private String password;
    private String phoneNo;

    // Getter method..
    public String getUserName() {
        //prints out the username
        return userName;
    }
    // Setter method..
    public void setUserName(String name) {
        // This keyword refers to current instance itself
        this.userName = name;
        printInfo();
    }
    public int getId() {
        //prints out the username
        return id;
    } 
    public void printInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:" + " ");
        userName = sc.next();
        System.out.println(getUserName());
    }

    public static void main(String[] args) {
         DumbSss ds = new DumbSss();
         ds.printInfo();
        //  ds.setUserName(Name);
    }

}
