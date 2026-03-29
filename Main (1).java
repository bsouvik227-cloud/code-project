/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

class MaxNumber {
    int a, b, c;

    // Constructor
    MaxNumber(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    // Member function
    void findMax() {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Maximum number is: " + max);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        // Object creation using constructor
        MaxNumber obj = new MaxNumber(x, y, z);

        // Calling member function
        obj.findMax();

        sc.close();
    }
}