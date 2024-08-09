abstract class Shape {
    abstract void draw(); // Abstract method - no implementation

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();    // Outputs: Drawing a circle.
        circle.display(); // Outputs: This is a shape.

        Shape rectangle = new Rectangle();
        rectangle.draw(); // Outputs: Drawing a rectangle.
        rectangle.display(); // Outputs: This is a shape.
    }
}
