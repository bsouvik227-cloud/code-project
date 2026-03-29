/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Outer {
    int x = 10;

    // Inner class
    class Inner {
        void display() {
            System.out.println("Value of x from Outer class: " + x);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating outer class object
        Outer outerObj = new Outer();

        // Creating inner class object
        Outer.Inner innerObj = outerObj.new Inner();

        // Calling inner class method
        innerObj.display();
    }
}