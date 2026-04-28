/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Employee {
    int emp_no;
    String name, dept;
    double basic, da, hra, gross;

    Employee(int no, String n, String d, double b) {
        emp_no = no;
        name = n;
        dept = d;
        basic = b;

        da = 0.2 * basic;
        hra = 0.1 * basic;
        gross = basic + da + hra;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] e = {
            new Employee(1,"A","IT",20000),
            new Employee(2,"B","HR",25000),
            new Employee(3,"C","Sales",30000)
        };

        Employee max = e[0];

        for (Employee x : e) {
            if (x.gross > max.gross)
                max = x;
        }

        System.out.println("Highest Gross Salary: " + max.name);
    }
}