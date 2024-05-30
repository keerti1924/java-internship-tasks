import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        System.out.println("\n3. Read a file\n");
        try {
            File r = new File("file.txt");
            Scanner read = new Scanner(r);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}
