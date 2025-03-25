//Using multi catch blocks

public class exc_handling_2 {
    public static void main(String[] args) {
        
        try{
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[4]);
            System.out.println("Hello");
            int ans = 10/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("My message : " + e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("My Mistake : " + e.getMessage());
        }

        System.out.println("Rest of the code");

    }
}
