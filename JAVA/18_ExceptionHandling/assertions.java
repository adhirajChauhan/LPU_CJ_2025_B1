
// assert condition : "Error message"

// ..if the condition is true, excutions of code continues normally
// if the condition is false, an AssertionError is thrown

//Assertions by default are disabled for performance reason
// -ea -> enable assertions
// -da -> disable assertion

// java -ea assertions

public class assertions {
    public static void main(String[] args) {
        int age = 15;

        assert age >= 18 : "Age must be 18 or above";

        System.out.println("Age is valid");
    }
}
