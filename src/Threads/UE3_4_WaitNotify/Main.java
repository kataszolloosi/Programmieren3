package Threads.UE3_4_WaitNotify;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Worker w = new Worker();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        t1.start();
        t2.start();
        t1.join();
        System.out.println("Counter zum Schluss: " + w.counter);
    }
}
