import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file_3 {
    public static void main(String[] args) {

        // read from files
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            // line = reader.readLine();
            try {
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
