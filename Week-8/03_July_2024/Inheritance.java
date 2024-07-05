// Base class
class Animal {
    // Method in the base class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class inheriting from Animal
class Dog extends Animal {
    // Method in the derived class
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create an object of the derived class
        Dog myDog = new Dog();
        
        // Call methods from both the base class and the derived class
        myDog.eat(); // Method from Animal class
        myDog.bark(); // Method from Dog class
    }
}