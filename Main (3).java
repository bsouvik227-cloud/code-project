/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

class LeapYear {
    int year;

    // Constructor
    LeapYear(int y) {
        year = y;
    }

    // Member function
    void checkLeap() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int y = sc.nextInt();

        // Object creation using constructor
        LeapYear obj = new LeapYear(y);

        // Calling member function
        obj.checkLeap();

        sc.close();
    }
}