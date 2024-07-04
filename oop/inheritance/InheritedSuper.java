
public class Employees{
    int id;
    String name;
    String title;

    employeesInfo() {

    }
    employeesTask() {

    }
    double employeesSalary() {
        return 2300.34;
    }   
}
// Create a child class that highlights the Department Info, Task and Salary

public class Department extends Employees{

    public void departmentInfo(){
        name = "Production Team";
        title = "Department Head";
        System.out.print(name + title);
    }
    public void employeesTask() {
        System.out.print("Production of Goods and Services");

    }
    public double employeesSalary() {
        // double salary = 234.50;
        // return salary;
        return super.employeesSalary();
    }   
}

public class InheritedSuper {
    public static void main(String[] args) {
        Department d = new Department();
        d.employeesSalary();
    }
   
    
}
