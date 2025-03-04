//Wrapper class in java are object representation of primitive data types. They provide utility methods and allow primitives to be used as objects

//Primitive data        Wrapper class
//       int                Integer
//       char               Charater
//      float               Float

import java.util.ArrayList;

public class wrapper_1 {
    public static void main(String[] args) {
        
        //Create wrapper class object
        //1. using constructors (deprecated)
        // Integer num1 = new Integer(10);

        //2. using valueOf()
        // Integer num1 = Integer.valueOf(10);
        // Double num2 = Double.valueOf(20);

        //Example
        // ArrayList<Integer> nums = new ArrayList<>();

        //Autoboxing (Primitive -> Wrapper)
        //in this java automatically converts between primitives and wrapper classes
        // int a  = 5;
        // Integer intObj = a;
        // System.out.println(intObj);

        //Unboxing (Wrapper -> primitive)
        // Integer num = Integer.valueOf(10);

        // int b = num;

        // System.out.println(b);

        // Integer a = 20, b = 2;

        // System.out.println(a.compareTo(b));
    }
}

// Write a program that takes a string input ("45") and adds 10 to it using wrapper class methods.
