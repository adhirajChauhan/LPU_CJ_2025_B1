//Abstract class cannot be instantiated. it is used as a base class for other classes to extend and provides a structure that enforces certain behaviour in subclass.

// Charateristics 
//Can have abstact methods (methods without implementation)
//Can have concrete methods (methods with implementation)
//Cannot be instantiated directly
//this is used for code reusability and enforcing design principles


abstract class Car{
    
    abstract void accelerate(); //abstract method -> it must be overriden in subclasses
    // abstract method can only exist in abstact class
    //this will have no body, only signature

    void drift(){
        System.out.println("Car is drifting..");
    }
}

class RacingCar1 extends Car{
    void accelerate(){
        System.out.println("Car 1 is accelerating...");
    }
}

class RacingCar2 extends Car{
    void accelerate(){
        System.out.println("Car 2 is accelerating...");
    }
}

public class abstract_1 {
    public static void main(String[] args) {
        // Car c1 = new RacingCar1();

        // c1.accelerate();
        // c1.drift();


        Car c1 = new RacingCar1();

        c1.accelerate();
        c1.drift();
    }
}
