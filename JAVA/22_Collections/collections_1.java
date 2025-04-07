//ArrayList features -
//Dynamic resizing
//Allows duplicate elements
//Maintains the order
//can store null values
//index based access

import java.util.ArrayList;

public class collections_1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Laptop");
        arrayList1.add("Phone");
        arrayList1.add("Keyboard");

        arrayList1.add(1, "Headphones");

        //accessing
        System.out.println(arrayList1.get(1));

        //update
        // arrayList1.set(1,"Mouse");
        // System.out.println(arrayList1);

        //remove
        // arrayList1.remove(0); //removing element by index
        // arrayList1.remove("Phone"); //removing element by value
        // System.out.println(arrayList1);

        //iterate
        // for(int i = 0; i < arrayList1.size(); i++){
        //     System.out.println(arrayList1.get(i));
        // }

        // for(String i : arrayList1){
        //     System.out.println(i);
        // }

        // arrayList1.forEach(i -> System.out.println(i));

        // System.out.println(arrayList1.contains("Laptop"));

        // System.out.println(arrayList1.size());

    }
}
