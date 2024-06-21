interface Computer{
    void code();
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Coding....");
    } 
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Coding at ease....");
    } 
}
class Dev{
    public void appDev(Computer com){
        com.code();
    } 
}

public class interfaceclass {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();
        desk.code();
        lap.code();
    }
}