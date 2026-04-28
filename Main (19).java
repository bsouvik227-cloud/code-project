/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Abstract class
abstract class AbstractProduct {
    protected int product_id;
    protected String name;
    protected String description;

    public AbstractProduct(int product_id, String name, String description) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
    }

    // Abstract display method
    abstract void display();
}

// Product class
class Product extends AbstractProduct {
    protected double price;

    public Product(int product_id, String name, String description, double price) {
        super(product_id, name, description);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
    }
}

// Book class
class Book extends Product {
    protected String isbn;
    protected String author;
    protected String title;

    public Book(int product_id, String name, String description, double price,
                String isbn, String author, String title) {
        super(product_id, name, description, price);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    @Override
    void display() {
        super.display();
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
    }
}

// TravelGuide class
class TravelGuide extends Book {
    private String country;

    public TravelGuide(int product_id, String name, String description, double price,
                       String isbn, String author, String title, String country) {
        super(product_id, name, description, price, isbn, author, title);
        this.country = country;
    }

    @Override
    void display() {
        System.out.println("\n--- Travel Guide ---");
        super.display();
        System.out.println("Country: " + country);
    }
}

// CompactDisc class
class CompactDisc extends Product {
    private String artist;
    private String title;

    public CompactDisc(int product_id, String name, String description, double price,
                       String artist, String title) {
        super(product_id, name, description, price);
        this.artist = artist;
        this.title = title;
    }

    @Override
    void display() {
        System.out.println("\n--- Compact Disc ---");
        super.display();
        System.out.println("Artist: " + artist);
        System.out.println("Title: " + title);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Travel Guide object
        TravelGuide tg = new TravelGuide(
                101, "Travel Book", "Guide Book", 500,
                "ISBN123", "Author A", "India Guide", "India"
        );

        // Compact Disc object
        CompactDisc cd = new CompactDisc(
                202, "Music CD", "Audio Disc", 300,
                "Arijit Singh", "Best Songs"
        );

        // Display using product_id concept
        tg.display();
        cd.display();
    }
}