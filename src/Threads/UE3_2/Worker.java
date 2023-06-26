package Threads.UE3_2;

import java.util.Date;

public class Worker implements Runnable {
    private final int sleepInterval = 2000; //msec = 2 SEK
    private boolean isRunning = true;
    private static Object printLock = new Object();
    public void requestShutDown() {
        isRunning = false;
    }

    @Override
    public void run() {
        System.out.println("Thread von Worker: " + Thread.currentThread().getName());
        synchronized (printLock) {
            for (int i = 0; i < 10; i++) {
                Date d = new Date();
                System.out.print("[");
                System.out.print(d.toString());
                System.out.print(", CPUS: ");
                System.out.print(Runtime.getRuntime().availableProcessors());
                System.out.print(", FreeMem: ");
                System.out.print(Runtime.getRuntime().freeMemory());
                System.out.print("]");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
