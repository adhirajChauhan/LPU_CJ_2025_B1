// Exception - an unexpected event that disrupts the normal flow of the program

//syntax ->

// try{
//     code that may throw exception
// }
// catch(e){
//     code to handle the exception
// }
// finally{
//     (optional) code that always executes
// }

public class exc_handling_1 {
    public static void main(String[] args) {
        int num = 10;
        int dem = 0;

        try{
            int ans = num/dem;
            System.out.println(ans);
        }
        catch(Exception e){
            System.out.println("Something wrong");
        }
        finally{

            System.out.println("Rest of the code");
        }
    }
}
