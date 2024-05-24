import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("\nPlease Enter temp in Celsius : ");
        float Celsius = temp.nextFloat();

        float Fahrenheit = (Celsius * 9/5)  + 32;

        System.out.println("Temperature in Fahrenheit = " + Fahrenheit + "\n");
    }
}
