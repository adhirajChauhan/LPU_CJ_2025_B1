
class Box <T extends Number>{
    T num;

    Box(T num){
        this.num = num;
    }

    T getNum(){
        return num;
    }
}

public class generics_2 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box(10);
        Box<Double> b2 = new Box(10.12);
        // Box<String> b3 = new Box("Hello");

        System.out.println(b1.getNum());
        System.out.println(b2.getNum());

    }
}
