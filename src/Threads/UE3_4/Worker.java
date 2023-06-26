package Threads.UE3_4;

public class Worker implements Runnable {
    private static int counter;  //static = variable für alle

    private boolean isRunning = true;
    private static Object printLock = new Object();

    @Override
    public void run() {
        for (; counter < 21;) {

            while(true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (printLock) {
                if (counter > 20) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " " + counter);
                counter++;
            }

        }
    }
}

}
