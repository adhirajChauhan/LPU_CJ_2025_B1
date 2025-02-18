class Student{
    int id;
    String name;
    static String uniName;


}

public class static_2 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.id = 10;
        s1.name = "A";
        // s1.uniName = "LPU";

        Student s2 = new Student();
        s2.id = 20;
        s2.name = "B";
        // s2.uniName = "LPU";

        Student s3 = new Student();
        s3.id = 30;
        s3.name = "C";
        // s3.uniName = "LPU";

        Student.uniName = "LPU";


        // System.out.println(s1.uniName);
        // System.out.println(s2.uniName);

    }
}



// Create a class Library with:

// A static variable totalBooks.
// Instance variables for bookName and isAvailable.
// A static method getTotalBooks() that returns the total number of books in the library