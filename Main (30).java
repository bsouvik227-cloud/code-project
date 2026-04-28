/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Counter {
    static int cnt = 0;

    Counter() {
        cnt++;
    }

    void showCount() {
        System.out.println("Count: " + cnt);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c3.showCount();
    }
}