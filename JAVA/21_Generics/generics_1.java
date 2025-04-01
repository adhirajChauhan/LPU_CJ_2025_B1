//By using generics, we can create class or methods that works with any data type.
//it will make our code more flexible and reusable

class Box <T>{
    T value;

    Box(T value){
        this.value = value;
    }

    T getValue(){
        return value;
    }
}


public class generics_1 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box(10);

       Box<Double> b2 = new Box(10.55);
       
       Box<Character> b3 = new Box('m');

       Box<String> b4 = new Box("Hello");


        System.out.println(b1.getValue());
        System.out.println(b3.getValue());

    }
}
