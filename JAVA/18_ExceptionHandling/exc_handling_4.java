public class exc_handling_4 {

    static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Age must be above 18");
        }
        System.out.println("Age is valid");
    }
    public static void main(String[] args) {

        try{
            checkAge(10);
        }
        catch(IllegalArgumentException e){
            System.out.println("Caught : " + e.getMessage());
        }

        System.out.println("Rest of the code");
    }
}
