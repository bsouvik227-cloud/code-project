/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Student {
    int id;
    String name;

    // Parameterized Constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Member function to display data
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects using parameterized constructor
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Ankit");

        // Calling member function
        s1.display();
        s2.display();
    }
}