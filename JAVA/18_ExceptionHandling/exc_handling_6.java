//throws - is used to declare exceptions that a method might throw during its execution. It tells the compliler that method may cause an exception, and it must be handled by the caller


public class exc_handling_6 {

    static void divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println("Result : " + (a/b));
    }
    public static void main(String[] args) {
        
        try{
            divide(10, 0);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught : " + e.getMessage());
        }
    }
}
