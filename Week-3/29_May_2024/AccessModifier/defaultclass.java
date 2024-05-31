class def{
    public void display(){
        System.out.println("\nDefault Access Modifier\n");
    }
}

public class defaultclass{
    public static void main(String[] args) {
        def obj = new def();
        obj.display();
    }
}
