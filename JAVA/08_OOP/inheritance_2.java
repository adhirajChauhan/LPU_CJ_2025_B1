//Inheritance -> it allows a child class (subclass) to inherit properties and behaviours from parent class (superclass)

// class parentClass{

// }

// class childClass extends parentClass{

// }

class Animal{
    String name;

    void eat(){
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println(name + " is barking");
    }
}

public class inheritance_2 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();


        // Animal a1 = new Animal();
        // a1.bark(); //wont work

    }
}
