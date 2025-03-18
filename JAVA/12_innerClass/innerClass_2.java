
class Outer{

    static String msg = "Hello";

    static class Inner{
        void show(){
            System.out.println(msg);
        }
    }
}

public class innerClass_2 {
    public static void main(String[] args) {
        // Outer outer = new Outer();

        Outer.Inner obj = new Outer.Inner();
    }
}
