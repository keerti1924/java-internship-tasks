// 3. Write a java program to Get the size of give file in bytes, kilobytes and megabytes

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File("file.txt");

        if(file.exists() && file.isFile()){
            long bytes = file.length();
            double kilobytes = (double) bytes/1024;
            double megabytes = kilobytes/1024;

            System.out.println("File size in bytes = " + bytes);
            System.out.println("File size in kilobytes = " + kilobytes);
            System.out.println("File size in megabytes = " + megabytes);
        }else{
            System.out.println("File does not exists.");
        }
    }
}
