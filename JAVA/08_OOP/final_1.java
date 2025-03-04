//final is a keyword in JAVA which is used to restrict modification to variable, methods, class

//final variable -> value cannot be changed after initilization
// final method -> cannot be overriden by a subclass
// final class -> cannot be inherited by another class

class Car{
    static final int speed = 10;

    // Car(int speed){
    //     this.speed = speed;
    // }

    void showSpeed(){
        System.out.println(speed);
    }
}

public class final_1 {
    public static void main(String[] args) {

        // Car c1 = new Car(10);

        // c1.showSpeed();
        // final int num = 10;

        // num = 20;

        // System.out.println(num);

        System.out.println(Car.speed);
    }
}
