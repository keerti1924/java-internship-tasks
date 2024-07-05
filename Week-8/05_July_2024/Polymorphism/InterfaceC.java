// Interface Implementation

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class InterfaceC {
    public static void main(String[] args) {
        System.out.println("\n3. Interface Implementation\n");
        Drawable d1 = new Circle();
        Drawable d2 = new Rectangle();

        d1.draw();
        d2.draw();
    }
}
