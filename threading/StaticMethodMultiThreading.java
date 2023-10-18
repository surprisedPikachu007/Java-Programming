package threading;

class MySynchronousClass extends Thread {
    public void run() {
        fun();
    }

    public static synchronized void syn() {
        for(int i = 0; i < 5; i++) {
            System.out.println("static");
            try {
                Thread.sleep(100);
            } catch(InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }

    public synchronized void fun() {
        for(int i = 0; i < 5; i++) {
            System.out.println(getName());
            try {
                Thread.sleep(100);
            } catch(InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}

public class StaticMethodMultiThreading {
    public static void main(String[] args) {
        
    }
}
