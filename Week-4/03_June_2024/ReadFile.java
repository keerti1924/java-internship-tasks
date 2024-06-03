// 5. Write a java program to Read a file line by line

import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class ReadFile{
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            Scanner read = new Scanner(file);
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

