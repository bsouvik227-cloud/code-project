/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

class DivisibleByFive {
    int num;

    // Constructor
    DivisibleByFive(int n) {
        num = n;
    }

    // Member function
    void check() {
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5");
        } else {
            System.out.println(num + " is not divisible by 5");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Object creation using constructor
        DivisibleByFive obj = new DivisibleByFive(n);

        // Calling member function
        obj.check();

        sc.close();
    }
}