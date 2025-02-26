class A{

    A(){
        System.out.println("from A constructor");
    }
    void show(){
        System.out.println("From A");
    }
}

public class anonymousObj {
    public static void main(String[] args) {
        new A().show();
    }
}
