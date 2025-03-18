//An inner class is a class defined within another class.

class Outer{
    private String msg = "Hello";

    class Inner{
        void show(){
            System.out.println(msg);
        }
    }
}

public class innerClass_1 {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // outer.show();

        Outer.Inner inner = outer.new Inner();

        inner.show();
    }
}
