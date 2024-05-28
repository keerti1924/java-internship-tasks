// 3. Create a class named Circle with an attribute radius and a method to calculate the area. Use Scanner to get user input for the circle's radius (Area of Circle = πr*r)

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //User Input
        System.out.print("\nEnter radius of a circle : ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);

    }

}

