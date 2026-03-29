/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Base class
class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

// Derived class 1: Square
class Square extends Shape {
    int side;

    Square(int s) {
        side = s;
    }

    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

// Derived class 2: Rectangle
class Rectangle extends Shape {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

// Derived class 3: Circle
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

public class Main {
    public static void main(String[] args) {

        Square s = new Square(4);
        Rectangle r = new Rectangle(5, 3);
        Circle c = new Circle(2.5);

        s.display();
        s.area();

        r.display();
        r.area();

        c.display();
        c.area();
    }
}