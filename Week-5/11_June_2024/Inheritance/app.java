import calc.Addition;

public class app{
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Addition(18+6) = " + obj.add(18,6));
        System.out.println("Subtract(18-6) = " + obj.sub(18,6));
        System.out.println("Division(18/3) = " + obj.div(18,6));
        System.out.println("Multiplication(18*3) = " + obj.mul(18,6));
    }
}