class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class thisKeyword {
    public static void main(String[] args) {

        Student s1 = new Student(10, "John");

        System.out.println(s1.id);

    }
}


// Create a class Book with:

// Instance variables title, author, and price.
// A constructor that initializes all fields using the this keyword.
// Write a method printDetails() to display the book information.