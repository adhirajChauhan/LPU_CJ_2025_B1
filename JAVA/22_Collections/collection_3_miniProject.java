//mini project on hashmap

import java.util.HashMap;

public class collection_3_miniProject {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        //Add contacts
        phoneBook.put("John", "123456789");
        phoneBook.put("Emma", "987654321");

        //Search
        String name = "Emma";
        if(phoneBook.containsKey(name)){
            System.out.println(name + "'s number is : " + phoneBook.get(name));
        }
        else{
            System.out.println(name + " not found");
        }

        //display all contacts
        System.out.println("All contacts - ");
        for(String contact : phoneBook.keySet()){
            System.out.println(contact +  " - " + phoneBook.get(contact));
        }
    }
}
