public class Pro {
    protected void display() {
        System.out.println("\nProtected Access Modifier\n");
    }
}

class Protected extends Pro{
    public static void main(String[] args) {
        Protected a = new Protected();
        // Access protected method
        a.display(); // Output :- Protected Access Modifier
    }
}




