//types -> 1.Checked exception - (IOException,SQLException)
//2.Unchecked Exception -(NullPointerException, ArithematicException)

class MyCustomException extends Exception{
    MyCustomException(String s){
        super(s);
    }
}

class Test{
    static void checkAge(int age) throws MyCustomException{
        if(age < 18){
            throw new MyCustomException("Age must be above 18");
        } else{
            System.out.println("Valid age");
        }
    }
}

public class exc_Handling_revision_1 {
    public static void main(String[] args) {

        try{

            Test.checkAge(20);
        }
        catch(MyCustomException e){
            System.out.println("Caught exception  : " + e.getMessage());
        }

    }
}
