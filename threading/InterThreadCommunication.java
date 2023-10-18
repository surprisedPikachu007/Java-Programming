package threading;

class MyThread extends Thread {
    int total = 0;
    public void run() {
        for(int i = 1; i <= 1000 ; i++) {
            total += i;
            //System.out.println(total);
            this.notify();
        }
    }
}

class MyComplexThread extends Thread {
    public void run() {

    }
}
public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.wait();
        System.out.println(myThread.total);
    }
}
