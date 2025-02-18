
public class functions_1 {

    //Define a function

    // returnType functionName(param1, param2..){
    //     code
    // }

    // static void print(){
    //     System.out.println("hello");
    // }

    // static void print(String name, int age){
    //     System.out.println("Hello " + name + " your age is : " + age);
    // }

    // static int add1(){
    //     return 10;
    // }

    // static int add2(){
    //     return 20;
    // }

    // static boolean isTrue(){
    //     return true;
    // }

        static int add(int num1, int num2){
            return num1 + num2;
        }

        static int add(int num1, int num2, int num3){
            return num1 + num2 + num3;
        }

        static double add(double num1, double num2){
            return num1 + num2;
        }

    public static void main(String[] args) {
        
        // print("John", 20);
        
        // int num1 = add1();
        // int num2 = add2();
        
        // System.out.println(num1 + num2);

        // System.out.println(isTrue());
        int ans = add(2,3,6);
        System.out.println(ans);
    }
}


//Write a function swap(int a , int b) that swaps two numbers without using third variable or swap function

// a = 5, b = 3
// a = a + b //8
// b = a - b //5
// a = a - b //3


//write a function countChar(String str, char ch) that will return count of ch in str;
//("Hello", l) -> 2
// ("cipherschools" , s) -> 2
// ("cipherschools", o) -> 2