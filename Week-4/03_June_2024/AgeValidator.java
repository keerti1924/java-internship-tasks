// 8. Create a custom exception InvalidAgeException that includes the invalid age value as additional data. Write a program that takes age as input and throws this exception if the age is not within the valid range (0-120).


import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = scanner.nextLine();
        System.out.print("Enter your age = ");
        int age = scanner.nextInt();
        try {
            if (age < 0 || age > 120) {
                throw new InvalidAgeException("\nInvalid Age (Age should be a positive integer less than or equal to 120)");
            }
            System.out.println("\nHello " + name + ", you are " + age + " years old.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}