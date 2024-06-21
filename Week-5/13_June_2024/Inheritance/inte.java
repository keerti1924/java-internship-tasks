abstract class Computer{
    public abstract void code();
}
class Desktop extends Computer{
    public void code(){
        System.out.println("Coding....");
    } 
}
class Laptop extends Computer{
    public void code(){
        System.out.println("Coding at ease....");
    } 
}
class Dev{
    public void appDev(Computer com){
        com.code();
    } 
}

public class inte {
    public static void main(String[] args) {
        // Computer c = new Computer();
        // c.code();

        Computer desk = new Desktop();
        Computer lap = new Laptop();
        desk.code();
        lap.code();
    }
}
