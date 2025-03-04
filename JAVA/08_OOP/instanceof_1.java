//instanceof operator in java is used to check if an object is an instance of a specific class or subclass

class Animal{

}

class Dog extends Animal{

}

public class instanceof_1 {
    public static void main(String[] args) {
        // Animal a = new Animal();
        // Dog d = new Dog();


        // System.out.println(a instanceof Animal);
        // System.out.println(d instanceof Dog);
        // System.out.println(d instanceof Animal);

        Animal a = new Dog();

        if(a instanceof Dog){
            Dog d = (Dog) a; //downcasting
        }


    }
}


//Type checking before casting - Ensures safe downcasting
//Prevent runtime errors