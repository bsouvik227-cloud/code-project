/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Book {
    String title;
    double price;

    Book(String t, double p) {
        title = t;
        price = p;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] b = {
            new Book("Book1", 200),
            new Book("Book2", 500),
            new Book("Book3", 300),
            new Book("Book4", 450)
        };

        Book max = b[0];

        for (Book x : b) {
            if (x.price > max.price)
                max = x;
        }

        System.out.println("Highest Price Book: " + max.title);
    }
}