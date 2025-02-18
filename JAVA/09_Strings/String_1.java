//String class is immutable, meaning once a String object is created, its value cannot be changed
//why immutable? -> String pooling : helps java save memory by reusing string objects
                    // Security :Used in authentication and database connection
public class String_1 {
    public static void main(String[] args) {

        //How to create
        //1-> string literals -> When we create strings using double quotes, java checks if string already exists in the String pool. If it exists, it reuses the reference instead of creating a new object.

        // String s1 = "Hello";
        // String s2 = "Hello";

        //2-> using new keyword
        // String s3 = new String("Hello"); //Always creates a new object

        //String methods
        // String s1 = "Hello ";
        // String s2 = "World";
        // String s3 = s1.concat(s2);
        // System.out.println(s1.length());

        // System.out.println(s1.charAt(3));

        // System.out.println(s3.replace("World", "Java"));

        String s4 = "Java,Python,C";
        String[] ans = s4.split(",");

        for(String i : ans){
            System.out.println(i);
        }
        
    }
}
