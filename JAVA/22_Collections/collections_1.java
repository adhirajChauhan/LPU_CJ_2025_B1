//ArrayList features -
// Dynamic resizing
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
        arrayList1.add("Phone");
        arrayList1.add("TV");
        arrayList1.add(null);




        System.out.println(arrayList1);

    }
}
