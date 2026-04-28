/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Mango Interface
interface Mango {
    void taste();
    void color();
}

// Winter class
class Winter implements Mango {
    public void taste() {
        System.out.println("Winter Mango: Slightly sour taste");
    }

    public void color() {
        System.out.println("Winter Mango: Greenish color");
    }
}

// Summer class
class Summer implements Mango {
    public void taste() {
        System.out.println("Summer Mango: Sweet taste");
    }

    public void color() {
        System.out.println("Summer Mango: Yellow color");
    }
}

// Main class
public class MangoDemo {
    public static void main(String[] args) {
        Mango m1 = new Winter();
        Mango m2 = new Summer();

        m1.taste();
        m1.color();

        System.out.println();

        m2.taste();
        m2.color();
    }
}