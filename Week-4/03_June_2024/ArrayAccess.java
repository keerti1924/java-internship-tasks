// 6. Write a Java program that initializes an array of integers and prompts the user to enter an index to access. Use exception handling to catch any ArrayIndexOutOfBoundsException.

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index to access = ");
        int index = input.nextInt();

        try {
            System.out.println("Element at index " + index + " = " + array[index]);
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("Invalid index! Array index out of bounds.");
        }
    }
}
