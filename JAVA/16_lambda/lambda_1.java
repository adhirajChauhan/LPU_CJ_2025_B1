@FunctionalInterface
interface A{
    int show(int i, int j);
}

public class lambda_1 {
    public static void main(String[] args) {

        // A obj = new A(){
        //     public void show(){
        //         System.out.println("From main");
        //     }
        // };

        // A obj = () ->  System.out.println("from main");

        //-------------------------------
        // A obj = new A(){
        //     public void show(int i){
        //         System.out.println("Hello " + i);
        //     }
        // };

        //-------------------------------

        // A obj = i -> System.out.println("Hello " + i);

        // A obj = (i, j) -> System.out.println("Hello " + i + " " + j);

        //-------------------------------

        // A obj = new A(){
        //     public int show(int i, int j){
        //         return i + j;
        //     }
        // };

        A obj = (i, j) -> i + j;
            
            
            

        obj.show(5,6);
    }
}
