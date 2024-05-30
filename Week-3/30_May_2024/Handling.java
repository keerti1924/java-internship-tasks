public class Handling {
  public static void main(String[] args) {
      int a = 75;
      int b = 0;

      try {
        int c = a / b;
        System.out.println(c);
      } catch (ArithmeticException e) {
          // Handle the exception
          System.out.println("Division by zero Error");
      }
    System.out.println("Hello World!");
  }
}