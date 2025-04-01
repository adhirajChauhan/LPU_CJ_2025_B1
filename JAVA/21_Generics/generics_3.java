
// ? -> Unbounded wildcard (Accept any type)
// ? extends someClass -> upper bound wildcard (accept someClass or it subclasses)
// ? super someClass -> lower bound wildcard (aceept someClass or its superclasses)

import java.util.List;

import javax.management.ListenerNotFoundException;

public class generics_3 {

    // static void printList(List<?> list){
    //     for(Object element : list){
    //         System.out.println(element + " ");
    //     }
    // }

    static double sumNumbers(List<? extends Number> list){
        double sum = 0;
        for(Number num : list){
            sum += num.doubleValue();
        }
        return sum;
    }


    public static void main(String[] args) {

        // List<Integer> intList = List.of(1,2,3);
        // List<String> strList = List.of("A", "B", "C");

        // printList(strList);

        List<Double> doubleList  = List.of(1.3,2.4,3.1);
        List<Integer> intList = List.of(1,2,3);

        System.out.println(sumNumbers(intList));
    }    
}
