/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Student {
    int id;
    String name;
    double marks;

    // Constructor 1 (no parameters)
    Student() {
        id = 0;
        name = "Unknown";
        marks = 0.0;
    }

    // Constructor 2 (two parameters)
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Constructor 3 (three parameters)
    Student(int i, String n, double m) {
        id = i;
        name = n;
        marks = m;
    }

    // Member function
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects using different constructors
        Student s1 = new Student();
        Student s2 = new Student(101, "Rahul");
        Student s3 = new Student(102, "Ankit", 85.5);

        // Displaying values
        s1.display();
        s2.display();
        s3.display();
    }
}