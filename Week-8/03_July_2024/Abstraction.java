// Abstract class
abstract class Shape {
    // Abstract method (does not have a body)
    abstract void draw();
    
    // Regular method
    void display() {
        System.out.println("Displaying shape.");
    }
}

// Concrete class inheriting from Shape
class Circle extends Shape {
    // Provide implementation for the abstract method
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Shape s = new Shape(); // This would cause an error because Shape is abstract
        
        // Create an object of the concrete class
        Circle myCircle = new Circle();
        
        // Call methods
        myCircle.display(); // Method from Shape class
        myCircle.draw(); // Method from Circle class
    }
}
