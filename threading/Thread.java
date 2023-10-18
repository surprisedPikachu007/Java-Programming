package threading;

class MyThread extends Thread{
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class MySynchronizedThread extends Thread {
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

class ThreadSample {
    public static void main(String[] args) {
        // Non - Synchronized
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();

        // Synchronized
        MySynchronizedThread mySynchronizedThread = new MySynchronizedThread();
        mySynchronizedThread.start();
        MySynchronizedThread mySynchronizedThread1 = new MySynchronizedThread();
        mySynchronizedThread1.start();
    }
}
