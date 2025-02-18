//size order
// byte -> short -> int -> long -> float -> double


public class typeConversion {
    public static void main(String[] args) {
        
        //Implicit conversion (widening conversion)
        // 1. happen automatically
        // 2. converts smaller type of data to larger type of data
        // 3. no loss of data happens
        // 4. done by the compiler


        // int intVal = 10;
        // long longVal = intVal;
        // System.out.println(longVal);

        //Explicit conversion (narrowing conversion)
        // 1. requires manual casting
        // 2. converts a large data type to smaller data type
        // 3. may result in data loss
        // 4. done by the programmer using cast operator

        // double doubleVal = 56.83;

        // int intVal = (int)doubleVal;

        // System.out.println(intVal);


        // "123" -> 123

        String str = "123";

        int ans = Integer.parseInt(str);
        System.out.println(ans);
    }
}
