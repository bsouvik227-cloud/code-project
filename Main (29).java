/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Employee {
    private String name, department;
    private double salary;
    static String company = "ABC Pvt Ltd";

    Employee(String n, String d, double s) {
        name = n;
        department = d;
        salary = s;
    }

    void display() {
        System.out.println(name + " | " + department + " | " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("A", "HR", 20000);
        Employee e2 = new Employee("B", "IT", 30000);
        Employee e3 = new Employee("C", "Sales", 25000);
        Employee e4 = new Employee("D", "IT", 28000);
        Employee e5 = new Employee("E", "HR", 22000);

        System.out.println("Company: " + Employee.company);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}