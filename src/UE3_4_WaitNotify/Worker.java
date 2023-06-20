package UE3_4_WaitNotify;

public class Worker implements Runnable {
    static int counter;  //static = variable für alle

    private static Object printLock = new Object();

    @Override
    public void run() {
        synchronized (printLock) {
            while (counter < 20) {
                printLock.notify();
                counter++;
                System.out.println(Thread.currentThread().getName() +
                        " -- Counter --- " + counter);
                try {
                    printLock.wait();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printLock.notify();
            }
        }

    }
}


