/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);

        sc.close();
    }
}