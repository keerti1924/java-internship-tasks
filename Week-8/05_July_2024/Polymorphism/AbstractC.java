

abstract class Shape {
    abstract void draw();
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class AbstractC {
    public static void main(String[] args) {
        System.out.println("\n4. Abstract Class Implementation\n");
        Shape s1 = new Triangle();
        Shape s2 = new Square();

        s1.draw();
        s2.draw();
    }
}
