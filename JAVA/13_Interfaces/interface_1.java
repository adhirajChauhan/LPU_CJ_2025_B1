//Interface acts as a contract that classes must follow when they implements the interface
//A class can implement multiple interface
//It helps to write loosely coupled code which reduces the dependancy between classes

//All methods in interfaces are PUBLIC and ABSTRACT by default

//All variables are PUBLIC, STATIC, FINAL by default

// abstract class A{
//     public abstract void hello();
// }

// interface InterfaceName{
//     public abstract void show();
// }

// class A implements InterfaceName{

// }

interface Printable{

    void print();
}

class Book implements Printable{
    public void print(){
        System.out.println("Printing book");
    }
}

public class interface_1 {
    public static void main(String[] args) {
        Printable obj = new Book();
        obj.print();
    }
}

