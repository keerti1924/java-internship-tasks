import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        // Delete a file
        System.out.println("\n4. Delete a File");
        File f = new File("file.txt");

        if(f.exists()){
            f.delete();
            System.out.println("File Deleted Successfully");
        }else{
            System.out.println("File not exists.");
        }
    }
}
