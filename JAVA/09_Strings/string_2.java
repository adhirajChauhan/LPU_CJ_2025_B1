// Stringbuilder class - is used for midifying string effeciently, it does not create a new object for each modification.

//Stringbuilder is faster than String because it does not create a new object on each modification

public class string_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");

        // sb.insert(2, " TEST ");

        // sb.replace(2, 7, "TESTING");

        // sb.delete(2, 5);

        // sb.reverse();


        System.out.println(sb);
    }
}


// Feature                 String                      StringBuilder
// Mutability              immutable                   Mutable
// Performance             Slow                        Fast


// Write a method to reverse a string manually without using reverse().

// Write a function isPalindrome(String s) that returns true if the string is the same forward and backward.
// Write a function toTitleCase(String s) that capitalizes the first letter of each word.