
class Book{
    String title;
    String author;
    int price;

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printDetails(){
        System.out.println(title + " " + author + " " + price);
    }
}
public class thisKeyword_2 {
    public static void main(String[] args) {
        Book b1 = new Book("DSA", "Author", 100);

        b1.printDetails();
    }
}


// Create a class Book with:

// Instance variables title, author, and price.
// A constructor that initializes all fields using the this keyword.
// Write a method printDetails() to display the book information.