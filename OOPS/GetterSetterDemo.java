package OOPS;

// Book class with private fields and getter/setter methods
class Book {
    private String title;
    private String author;
    private double price;

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price.");
        }
    }
}

// ✅ Main class
public class GetterSetterDemo {
    public static void main(String[] args) {
        Book myBook = new Book();

        // Set values using setters
        myBook.setTitle("Clean Code");
        myBook.setAuthor("Robert C. Martin");
        myBook.setPrice(499.99);

        // Get values using getters
        System.out.println("Book Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Price: ₹" + myBook.getPrice());
    }
}
