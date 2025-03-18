
//An anonymous inner class is an inner class without a name.

class A{
    void show(){
        System.out.println("From A");
    }
}

// class B extends A{
//     void show(){
//         System.out.println("From B");
//     }
// }

public class anonymousInner {
    public static void main(String[] args) {
        A obj = new A()
        {
            void show(){
                System.out.println("From main");
            }
        };

        obj.show();
    }
}
