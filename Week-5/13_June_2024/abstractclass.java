abstract class Car{
    abstract void start();

    public void ac(){
        System.out.println("AC is on");
    }

    abstract void stop();
}

class maruti extends Car{
    void start(){
        System.out.println("Car is started");
    }
    void stop(){

    }
}

public class abstractclass {
    public static void main(String[] args) {
        Car c = new maruti();
        c.start();
        c.ac();
    }
}
 