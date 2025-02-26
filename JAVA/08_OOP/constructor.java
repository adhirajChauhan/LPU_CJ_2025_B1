
//A constructor is a special method that is invoked when the object of a class is created

// * the name of the constructor method will be same as the class name
// * a constructor method will not return any value
class Student{
    int id;
    String name;

    Student(){
        System.out.println("no param constructor");
    }

    Student(int id_val){
        id = id_val;

    }

    void giveExam(){
        System.out.println("exam");
    }
}

public class constructor {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        Student s2 = new Student(10);

        System.out.println(s2.id);
    }
}
