//2. Runtime polymorphism (Method Overriding)
// it allows a child class (subclass) to provide a specific implementation of a method already defined in its parent class(superclass)

class Parent{
    void show(){
        System.out.println("From A");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("From B");
    }
}

public class polymorphism_2 {
    public static void main(String[] args) {
        // A a1 = new A();

        // a1.show();

        // Parent c1 = new Child(); //upcasting
        // c1.show();


        Parent p1 = new Parent();

        p1 = new Child();

        p1.show();
    }
}



// Create a parent class BankAccount with a method interestRate().
// Override it in SavingsAccount and CurrentAccount subclasses.