public class PrintNumbers {
  public static void main(String[] args) {

    // WAP to Print Numbers from 1 to 10.
    System.out.println("\n1. Printing Numbers from 1 to 10");
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + " ");
    }

    // WAP to Print Even Numbers from 1 to 20.
    System.out.println("\n\n2. Printing Even Numbers from 1 to 20");
    for (int i = 2; i <= 20; i += 2) {
      System.out.print(i + " ");
    }

    // WAP to Print Odd Numbers from 1 to 20.
    System.out.println("\n\n3. Printing Odd Numbers from 1 to 20");
    for (int i = 1; i <= 20; i += 2) {
      System.out.print(i + " ");
    }

  }
}