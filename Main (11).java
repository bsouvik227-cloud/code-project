/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Factorial {
    int num;

    // Constructor with constant value
    Factorial() {
        num = 5; // constant value
    }

    // Member function that returns factorial
    int calculateFactorial() {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }
}

public class Main {
    public static void main(String[] args) {

        // Object creation
        Factorial obj = new Factorial();

        // Calling member function and storing result
        int result = obj.calculateFactorial();

        System.out.println("Factorial is: " + result);
    }
}