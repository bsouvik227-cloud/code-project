/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

class GradeSystem {
    int marks;

    // Constructor
    GradeSystem(int m) {
        marks = m;
    }

    // Member function
    void calculateGrade() {
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int m = sc.nextInt();

        // Object creation using constructor
        GradeSystem obj = new GradeSystem(m);

        // Calling member function
        obj.calculateGrade();

        sc.close();
    }
}