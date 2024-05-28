// 5. Create a class to find out the distance b/w two coordinates. (d=√((x2 – x1)² + (y2 – y1)²).

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter value of x1: ");
    double x1 = scanner.nextDouble();
    System.out.print("Enter value of y1: ");
    double y1 = scanner.nextDouble();
    

    System.out.print("Enter value of x2: ");
    double x2 = scanner.nextDouble();
    System.out.print("Enter value of y2: ");
    double y2 = scanner.nextDouble();

    //Calculate the differences in x and y
    double x3 = x2-x1;
    double y3 = y2-y1;

    //Calculate the distance
    double Distance = Math.sqrt((x3*x3) + (y3*y3));

    System.out.println("The distance between the two points is: " + Distance);

    }
}
