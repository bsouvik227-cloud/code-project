/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Gross Interface
interface Gross {
    double calculateGross();
}

// Employee class
class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// Salary class implementing Gross
class Salary extends Employee implements Gross {
    double basic, hra, da;

    Salary(String name, int id, double basic, double hra, double da) {
        super(name, id);
        this.basic = basic;
        this.hra = hra;
        this.da = da;
    }

    public double calculateGross() {
        return basic + hra + da;
    }

    void showSalary() {
        showEmployee();
        System.out.println("Gross Salary: " + calculateGross());
    }
}

// Main class
public class SalaryDemo {
    public static void main(String[] args) {
        Salary s = new Salary("John", 201, 20000, 5000, 3000);
        s.showSalary();
    }
}