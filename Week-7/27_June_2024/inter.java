class A{

}

public class inter {
    public static void main(String[] args) {
        A obj = new A(){
        public void show(){
            System.out.println("Interface");
        }
        };
        obj.show();

        int a = 10;
        String b="10";
        System.out.println(a+2 +" " +b+2);
        
    }
}
