// 2.Write a java program to Read content from file using BufferedReader

import java.io.BufferedReader;
import java.io.FileReader;


public class ReadFileBufferedReader {
    public static void main(String[] args) {
        String str = "file.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(str));
            String line = br.readLine();
            System.out.println(line);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
