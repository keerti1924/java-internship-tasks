// 7. Write a Java program that reads a file specified by the user. Use exception handling to catch any FileNotFoundException and IOException.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the file path = ");
        String filePath = input.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e){
            System.out.println("An error occurred while reading the file.");
        }
    }
}
