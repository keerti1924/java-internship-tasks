// Method Overloading (Compile-time Polymorphism)


class Overload {
    void display(int a) {
        System.out.println("Argument: " + a);
    }

    void display(double a) {
        System.out.println("Argument: " + a);
    }

    void display(String a) {
        System.out.println("Argument: " + a);
    }

    public static void main(String[] args) {
        System.out.println("\n1. Method Overloading (Compile-time Polymorphism)\n");

        Overload obj = new Overload();
        obj.display(5);
        obj.display(5.5);
        obj.display("Hello");
    }
}
