package threading;

class MySynchronousClass extends Thread {
    public void run() {
        fun();
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

public class MultiThreading {
    public static void main(String[] args) {
        MySynchronousClass mySynchronousClass = new MySynchronousClass();
        Thread thread = new Thread(mySynchronousClass, "thread 0");
        thread.start();

        MySynchronousClass mySynchronousClass1 = new MySynchronousClass();
        Thread thread1 = new Thread(mySynchronousClass1, "thread 1");
        thread1.start();
    }
}
