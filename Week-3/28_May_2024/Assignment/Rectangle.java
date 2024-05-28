// 2. Create a class named Rectangle with attributes length and breadth (or width) and methods to calculate and display the area. Use the Scanner class to get user input for the rectangle's dimensions. (Area of Rectangle = Length*Breadth)

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //User Input
        System.out.print("\nEnter length of a rectangle : ");
        int length = scanner.nextInt();

        System.out.print("Enter breadth of a rectangle : ");
        int breadth = scanner.nextInt();

        int area = length * breadth;
        System.out.println("\nArea of Rectangle = " + area);

    }

}

