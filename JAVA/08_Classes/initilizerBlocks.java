
//Defination - an instance initilizer block runs before the constructor ehwn an object is created.it is useful when multiple constructors need the same initilization logic.

public class initilizerBlocks {

    int num;

    //instance initilizer blocks
    {
        num = 10;
        System.out.println("Instance initilizer block executed : num = " + num);
    }

    //constructor
    initilizerBlocks(){
        System.out.println("Constructor executed");
    }
   public static void main(String[] args) {
        initilizerBlocks ib1 = new initilizerBlocks();
        initilizerBlocks ib2 = new initilizerBlocks();

   } 
}


//The instance initilizer block executes before every constructor call
// it runs each time an object is created
