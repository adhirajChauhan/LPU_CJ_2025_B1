
// public class initilizerBlock_Static {

//     static int num;

//     static {
//         num = 10;
//         System.out.println("From static initizer block");
//     }

//     initilizerBlock_Static(){
//         System.out.println("From constructor");
//     }
//     public static void main(String[] args) {
//         initilizerBlock_Static is1 = new initilizerBlock_Static();
//         initilizerBlock_Static is2 = new initilizerBlock_Static();

//     }
// }


//The static initilizer block executes first
//it only run once, no matter how many object are created


/*
 *                                          IIB         
 * When it runs?                            before constructor, every time object is created
 * Used for?                                initilize instance variables
 * Execurion order                          Runs every time object is created
 * Can access static variables?             Yes
 * Can access instance variables?           Yes
 * 
 * 
 *                                          SIB         
 * When it runs?                            before main(), only once when class is loaded
 * Used for?                                initilize static variables
 * Execurion order                          Runs once once for the class
 * Can access static variables?             Yes
 * Can access instance variables?           No
 * 
 * 
 */



 //order of ecexution
 public class initilizerBlock_Static {

    static int staticNum;
    int instanceNum;

    static {
        staticNum = 10;
        System.out.println("From static block");
    }

    {
        instanceNum = 10;
        System.out.println("From instance block");
    }

    initilizerBlock_Static(){
        System.out.println("From constructor");
    }
    public static void main(String[] args) {
        System.out.println("from main");
        initilizerBlock_Static ib1 = new initilizerBlock_Static();
        initilizerBlock_Static ib2 = new initilizerBlock_Static();


    }
}



// Create a class Counter that keeps track of how many objects are created.
// Use a static initializer block to initialize the counter.
// Use an instance initializer block to increment the counter for each object.