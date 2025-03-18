
class Greeting{
    void greet(){
        System.out.println("Hello");
    }
}

class Hello{
    void hello(){
        System.out.println("Hello 1");
    }
}

public class anonymousInner {
    public static void main(String[] args) {
        Greeting greeting = new Greeting(){
            void greet(){
                System.out.println("Hello, how are you");
            }
        };

        Hello hello = new Hello(){
            void hello(){
                System.out.println("Hello 2");
            }
        };



    }
}



// Bank Account with Static Nested Class
// Create a class Bank with a static nested class Transaction.
// The Transaction class should have a method process() that prints "Transaction Completed".
// Demonstrate creating the nested class object without creating a Bank object.