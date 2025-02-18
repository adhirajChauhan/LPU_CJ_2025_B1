//sttaic keyword in java is used for memory management and shared resources
//static keyword indicated that the member belong to the class itselfrather than to the individual object of the class
class Student{

    static int id;

    void printName(){
        System.out.println("From static");
    }
}

public class static_1 {

    public static void main(String[] args) {
        // Student.printName();

        Student s1 = new Student();

        s1.printName();
        // s1.id = 10;

        Student.id = 10;
    }
}
