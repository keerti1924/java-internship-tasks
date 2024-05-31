class A {
    public void display() {
        System.out.println("\nPublic Access Modifier\n");
    }
}

public class publicaccess {
    public static void main(String[] args) {
        A a = new A();
        // Access public method
        a.display(); // Output :- Public Access Modifier
    }
}




