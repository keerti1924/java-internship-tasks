// 1. Write a java program to Append text or string in a file

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) throws IOException {
        String str = "file.txt";
        String texttoappend = "'This is the text to append.'";

        try {
            FileWriter myWriter = new FileWriter(str, true);
            myWriter.write(texttoappend);
            myWriter.close();
            System.out.println("Text appended successfully.");
        } catch (Exception e) {
            System.out.println("Text not appended.");
        }
    }
}