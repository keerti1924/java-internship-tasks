// WAP to find the largest number of three numbers.

public class Largest {
  public static void main(String[] args) {
    int a = 15, b = 20, c = 8;
    int largest = a;
    if (b > largest) {
      largest = b;
    }
    if (c > largest) {
      largest = c;
    }
    System.out.println("Largest number = " + largest);
  }
}