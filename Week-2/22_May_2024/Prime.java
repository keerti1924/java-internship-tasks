// WAP to checks if a if a Number is Prime or not.
public class IsPrime {
  public static void main(String[] args) {
    int num = 233;
    boolean isPrime = true;
    if (num <= 1) {
      isPrime = false;
    } else {
      for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
    }
    System.out.println(num + " is a " + (isPrime ? "Prime Number." : "not prime"));
  }
}