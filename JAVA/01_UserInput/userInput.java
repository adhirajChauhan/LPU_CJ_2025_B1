import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter your age : ");
        System.out.print("Enter your name : ");

        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        scanner.close();
    }
    
}

//Create a program that asks the user for their name, age, and favorite color, then displays a user profile with this information.
