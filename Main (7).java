/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

class ReverseNumber {
    int num;

    // Constructor
    ReverseNumber(int n) {
        num = n;
    }

    // Member function
    void reverse() {
        int rev = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reversed number: " + rev);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Object creation using constructor
        ReverseNumber obj = new ReverseNumber(n);

        // Calling member function
        obj.reverse();

        sc.close();
    }
}