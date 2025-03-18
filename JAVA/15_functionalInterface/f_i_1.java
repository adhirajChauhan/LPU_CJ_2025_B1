//functional interface is an interface that constains exactly one abstract method.

@FunctionalInterface
interface Car{
    void drive();
}

// class Car1 implements Car{
//     public void drive(){
//         System.out.println("Driving");
//     }
// }

public class f_i_1 {
   public static void main(String[] args) {
        Car obj = new Car(){
            public void drive(){
                System.out.println("Driving");
            }
        };


   } 
}
