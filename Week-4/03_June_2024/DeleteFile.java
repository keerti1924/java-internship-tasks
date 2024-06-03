// 4. Write a java program to Delete a file
import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("file.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("File does not exists.");
        }
    }
}
