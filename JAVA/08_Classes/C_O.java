class Car{
    //attributes
    String color;
    int model;

    //behaviours
    public void drive(){
        System.out.println("Driving");
    }
}

public class C_O {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.color = "Red";
        car1.model = 2023;

        System.out.println(car1.model);
    }
}
