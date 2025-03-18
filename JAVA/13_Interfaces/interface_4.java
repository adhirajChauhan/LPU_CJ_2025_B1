//Java does not supports multiple inheritance with classes but supports it with interface

interface Engine{
    void start();
}
interface Horn{
    void honk();
}

interface myInterface{
    static void myStaticmethod(){
        System.out.println("Hello world");
    }
}

class Car implements Engine, Horn{
    public void start(){
        System.out.println("Engine starts");
    }

    public void honk(){
        System.out.println("Horn starts");
    }
}

public class interface_4 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
        obj.honk();

        myInterface.myStaticmethod();
    }
}
