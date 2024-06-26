class A implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
        System.out.println("A Class");
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }

        // System.out.println("Thread Name = "+currentThread().getName());
        // System.out.println("Thread State = "+currentThread().getState());
        // System.out.println("Thread Class = "+currentThread().getClass());
        // System.out.println("Thread Group = "+currentThread().getThreadGroup());
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("B Class");
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class thread {
    public static void main(String[] args) {
        Runnable obj = new A();
        Runnable obj1 = new B();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        // System.out.println(obj.getPriority());
        // System.out.println(obj1.getPriority());
        // obj1.setPriority(3);
        // obj.start();
        // obj1.start();

        t1.start();
        t2.start();
        

    }
}
