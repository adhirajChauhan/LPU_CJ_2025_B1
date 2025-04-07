
//comparable interface -> is used to define the natural ordring of objects

import java.util.ArrayList;
import java.util.Collection;

class Student implements Comparable<Student>{
    int id;
    String name;
    int age;

    Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age = age;
    }

    public int compareTo(Student other){
        return this.age - other.age;
    }


}

public class collection_2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(10, "James", 20));
        students.add(new Student(20, "John", 24));
        students.add(new Student(30, "Mary", 21));

        

        for(Student s : students){
            System.out.println(s.age);
        }

    }
}
