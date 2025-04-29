import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_resvision_1 {
    public static void main(String[] args) {
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("revision.txt"));

            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
