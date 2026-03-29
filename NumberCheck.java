/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

class NumberCheck {
    int num;

    // Constructor
    NumberCheck(int n) {
        num = n;
    }

    // Member function
    void checkNumber() {
        if (num > 0) {
            System.out.println("The number is Positive");
        } else if (num < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Creating object using constructor
        NumberCheck obj = new NumberCheck(n);

        // Calling member function
        obj.checkNumber();

        sc.close();
    }
}