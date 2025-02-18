public class ternary {
    public static void main(String[] args) {
        //ternary
        int num = 10;
        // if ((num> 0)) {
        //     System.out.println("positive");
        // }
        // else{
        //     System.out.println("Negative");
        // }

        //condition ? expression1 : expression2

        //condition ? expression1 : condition2 ? expression2 : expression3
        String ans = (num > 0) ? "Positive" : "Negative";

        System.out.println(ans);
    }
}
