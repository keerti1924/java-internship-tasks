@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

public class Functional{
    public static void main(String[] args) {
        MyFunctionalInterface myFunc = () -> System.out.println("Functional Interface Method");
        myFunc.myMethod();
    }
}