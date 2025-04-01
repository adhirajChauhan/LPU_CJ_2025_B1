import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class notesApp {
    static final String FILE_NAME = "notes.txt";

    //write a new note
    static void writeNote(Scanner scanner){

        try{
            FileWriter writer = new FileWriter(FILE_NAME, true);
            System.out.print("Enter your note : ");
            String note = scanner.nextLine();
            writer.write(note + "\n");

            writer.close();
            System.out.println("Note saved sucessfully");
        }
        catch(IOException e){
            System.out.println("Error writing in file : " + e.getMessage());
        }
    }

    //Read notes
    static void readNotes(){
        File file = new File(FILE_NAME);
        if(!file.exists()){
            System.out.println("No notes found");
            return;
        }

        try{

            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            System.out.println("You notes : ");
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Error reading the file : " + e.getMessage());
        }


    }

    //delete all notes
    static void deleteNotes(){
        File file = new File(FILE_NAME);

        if(file.exists()){
            file.delete();
            System.out.println("Deleted");
        }
        else{
            System.out.println("No notes to delete");
        }
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("Enter your choice");
            System.out.println("1 -> Create a new note");
            System.out.println("2 -> View all notes");
            System.out.println("3 -> Delete all notes");
            System.out.println(" 4-> Exit");
            System.out.print("Enter you choice : ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    writeNote(scanner);
                    break;
                case 2:
                    readNotes();
                    break;
                case 3:
                    deleteNotes();
                    break;

                default:
                System.out.println("Invalid input");

            }
        }

    }
}
