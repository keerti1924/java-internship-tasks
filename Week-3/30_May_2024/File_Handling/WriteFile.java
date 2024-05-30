import java.io.File;
import java.io.IOException; 
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        // Write a file
        System.out.println("\n2. Write a File");
        try {
            FileWriter filewrite = new FileWriter("file.txt");
            filewrite.write("This File Class is inside the java.io package. The File class can be used by creating an object of the class and then specifying the name of the file.");
            filewrite.close();
            System.out.println("File Written Successfully");
       
        } catch (IOException e) {
            System.out.println("File not Found.");
        }

    }
}
