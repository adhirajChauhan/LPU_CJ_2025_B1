//Hashmap ->stores data in key-value pair

/*
Properties
    1. -> Key value pair -> stores data in pair like (key, value)
    2. No Duplicate keys ->each key must be unique
    3. Unordered -> doesn't maintain the order of insertion
    4. Fast access -> O(1) average time  for search, insert and del
    5. Allows null -> one null key and multiple null values

*/

import java.util.HashMap;

public class collections_3 {
    public static void main(String[] args) {
        
        // HashMap<String, String> hm = new HashMap<>();
        // hm.put("One", "First entry");

        // HashMap<Integer, String> students = new HashMap<>();

        // students.put(1, "Student1");
        // students.put(2, "Student2");
        // students.put(3, "Student3");

        //Accessing
        // System.out.println("Old : " + students.get(2));

        //Updating
        // students.put(2, "NewStudent2");
        // System.out.println( "New : " + students.get(2));

        //Delete
        // students.remove(2);

        // System.out.println(students.containsKey(2));
        // System.out.println(students.containsValue("Student1"));

        

        // for(int i : students.keySet()){
        //         System.out.println(i + " " + students.get(i));
        // }



        HashMap<String , Integer> employee = new HashMap<>();
        employee.put("Emp1", 1);
        employee.put("Emp2", 2);

        System.out.println(employee.getOrDefault("Emp5", 100));



    }
}
