/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class SwapNumbers {
    int num;

    // Constructor
    SwapNumbers(int n) {
        num = n;
    }

    // Member function to swap values
    void swap(SwapNumbers obj) {
        int temp = this.num;
        this.num = obj.num;
        obj.num = temp;
    }

    // Display function
    void display() {
        System.out.println("Value: " + num);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating two objects using constructor
        SwapNumbers obj1 = new SwapNumbers(10);
        SwapNumbers obj2 = new SwapNumbers(20);

        System.out.println("Before Swapping:");
        obj1.display();
        obj2.display();

        // Swapping using member function
        obj1.swap(obj2);

        System.out.println("After Swapping:");
        obj1.display();
        obj2.display();
    }
}