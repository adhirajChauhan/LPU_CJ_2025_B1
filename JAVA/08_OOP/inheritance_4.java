class parent{

    parent(){
        System.out.println("from parent constructor");
    }

    void show(){
        System.out.println("From parent class");
    }
}

class Child extends parent{

    Child(){
        super();
        
    }

    void show(){

        // super->is used in a subclass to refer to the immediate parent class
        // super.show();
        System.out.println("From child class");
    }
}

public class inheritance_4 {
    public static void main(String[] args) {
        Child c1 = new Child();

        // c1.show();

        // parent p1 = new parent();

        // p1.show();
    }
}
