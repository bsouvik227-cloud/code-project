/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Area {

    // Area of square
    void calculate(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Area of rectangle
    void calculate(int length, int width) {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    // Area of circle
    void calculate(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        Area obj = new Area();

        obj.calculate(4);        // Square
        obj.calculate(5, 3);     // Rectangle
        obj.calculate(2.5);      // Circle
    }
}