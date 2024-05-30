import java.io.File;

public class InformationOfFile {
    public static void main(String[] args) {
        File a = new File("file.txt");
        if(a.exists()){
            System.out.println("\nFile name = "+a.getName());
            System.out.println("Path = "+a.getAbsolutePath());
            System.out.println("Parent = "+a.getParent());
            System.out.println("File Size(in bytes) = "+a.length());
            System.out.println("File is readable = "+a.canRead());
            System.out.println("File is writeable = "+a.canWrite());

        }else{
            System.out.println("File not found");
        }
    }
}
