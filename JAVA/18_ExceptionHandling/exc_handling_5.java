class AgeException extends Exception{
    public AgeException(String s){
        super(s);
    }
}

public class exc_handling_5 {

    // static void checkAge(int age){
    //     if(age < 18){
    //         throw new AgeException("Age must be above 18");
    //     }
    // }
    public static void main(String[] args) {
        int age = 10;

        try{

            // checkAge(10);
            if(age < 18){
                throw new AgeException("Age must be above 18");
            }
        }
        catch(AgeException e){
            System.out.println("Custom Exception  : " + e.getMessage());
        }

        System.out.println("Rest of the code");
    }
}
