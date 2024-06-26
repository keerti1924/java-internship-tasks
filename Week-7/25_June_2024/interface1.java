interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("a");
//     }
// }

public class interface1 {
    public static void main(String[] args) {
        // B obj = new B();
        // obj.show();
        A obj = new A(){
            public void show(){
                System.out.println("Interface Keyword");
            }
        };
        obj.show();
    }
}
