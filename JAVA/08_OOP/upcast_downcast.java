class A{
    void show(){
        System.out.println("Form A");
    }
}

class B extends A{
    void show(){
        System.out.println("From B");
    }
}

public class upcast_downcast {
    public static void main(String[] args) {
        // A obj = new A();

        A obj = new B(); //upcasting

        B obj1 = (B) obj; //downcasting

        // obj.show();


        // double a = 5.5;
        // int b = (int) a;


    }
}
