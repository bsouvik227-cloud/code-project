/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class TollBooth {
    int totalCars = 0;
    int unpaidCars = 0;
    int amount = 0;

    void payingCar() {
        totalCars++;
        amount += 50;
    }

    void nopayCar() {
        totalCars++;
        unpaidCars++;
    }

    void display() {
        System.out.println("Total Cars: " + totalCars);
        System.out.println("Unpaid Cars: " + unpaidCars);
        System.out.println("Total Amount: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        TollBooth t = new TollBooth();

        t.payingCar();
        t.payingCar();
        t.nopayCar();
        t.payingCar();

        t.display();
    }
}