
class A extends Object{
    A(){
        super();
        System.out.println("From A default constructor");
    }

    A(int num){
        System.out.println("From A parametrized constructor");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("From B default constructor");

    }

    B(int num){
        this();
        System.out.println("From B parametrized constructor");
    }
}

public class inheritance_5 {
    public static void main(String[] args) {
        B b1 = new B(5);
    }
}
