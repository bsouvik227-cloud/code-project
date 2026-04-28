/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

interface Exam {
    void percent_cal();
}

// Student Class
class Student {
    String name;
    int roll_no;
    double marks1, marks2;

    // Constructor
    Student(String name, int roll_no, double marks1, double marks2) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    // Display student details
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
    }
}

// Result Class
class Result extends Student implements Exam {
    double per;

    // Constructor
    Result(String name, int roll_no, double marks1, double marks2) {
        super(name, roll_no, marks1, marks2);
    }

    // Calculate percentage
    public void percent_cal() {
        per = (marks1 + marks2) / 2;
    }

    // Display result
    void display() {
        show();
        System.out.println("Percentage: " + per + "%");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Result r = new Result("John", 101, 85, 90);

        r.percent_cal();
        r.display();
    }
}
