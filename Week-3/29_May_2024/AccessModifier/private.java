class privateclass{
    private void display(){
        System.out.println("Private Access Modifier");
    }
}
public class private {
    public static void main(String[] args) {
        privateclass a = new privateclass(); 
        //Access private method 
        a.display(); //Complile Time Error
    }
}
