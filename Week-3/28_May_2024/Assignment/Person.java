// 1. Create a class named Person with attributes name and age. Use Scanner to get user input for a name and age, then create a Person object and greet the user by name and age.

import java.util.Scanner;
class Person1{
    String name;
    int age;


    //Greet Method
    public void greet(String name, int age) {
        System.out.println("\nHello, " + name + "! \nYou are " + age + " years old.");
    }

}
public class Person {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User Input
        System.out.print("Enter Your Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Age : ");
        int age = scanner.nextInt();

        //Create Object
        Person1 p1 = new Person1();

        //Greet the user
        p1.greet(name,age);
    }

}
