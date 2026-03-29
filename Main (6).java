/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

class Fibonacci {
    int n;

    // Constructor
    Fibonacci(int n) {
        this.n = n;
    }

    // Member function
    void generateSeries() {
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Object creation using constructor
        Fibonacci obj = new Fibonacci(n);

        // Calling member function
        obj.generateSeries();

        sc.close();
    }
}