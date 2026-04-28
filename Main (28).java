/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Book {
    String title, author, publisher;
    double price;

    Book(String t, String a, String p, double pr) {
        title = t;
        author = a;
        publisher = p;
        price = pr;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("A","X","P1",500),
            new Book("B","Y","P2",700),
            new Book("C","Z","P3",300),
            new Book("D","X","P4",900),
            new Book("E","Y","P5",650)
        };

        Book max = books[0];

        for (Book b : books) {
            if (b.price > max.price) {
                max = b;
            }
        }

        System.out.println("Highest Price Book: " + max.title);
    }
}