import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args) {
        //Create a file
        System.out.println("\n1. Create a File");
        try {
            File file = new File("file.txt");
            if(file.createNewFile()){
                System.out.println("File Created Successfully");
            }else{
                System.out.println("File Already exists");
            } 
        } catch (IOException e) {
            System.out.println("File Not Found");
        } 
    }
}
