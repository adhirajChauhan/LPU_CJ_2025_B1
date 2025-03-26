import java.io.File;
import java.io.IOException;

public class file_1 {
    public static void main(String[] args) {
        //create file

        // try{

        //     File myFile = new File("example.txt");
        //     if(myFile.createNewFile()){
        //         System.out.println("File created " + myFile.getName());
        //     }
        //     else{
        //         System.out.println("File already exsist");
        //     }
        // }
        // catch(IOException e){
        //     System.out.println("Exception caught : " + e.getMessage());
        // }

        File myFile = new File("example.txt");

        // System.out.println(myFile.canRead());
        // System.out.println(myFile.canWrite());
        // System.out.println(myFile.getAbsolutePath());
        // System.out.println(myFile.length());

        myFile.delete();

    }
}
