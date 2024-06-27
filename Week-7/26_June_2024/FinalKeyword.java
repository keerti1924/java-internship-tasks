public class FinalKeyword {
    final int CONSTANT = 10;

    final void display() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        obj.display();
        System.out.println("Constant: " + obj.CONSTANT);
    }
}
