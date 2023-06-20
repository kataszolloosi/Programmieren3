package UE3_3;

public class Worker implements Runnable {
    private static int counter;  //static = variable für alle

    private boolean isRunning = true;
    private static Object printLock = new Object();

    @Override
    public void run() {
        synchronized (printLock) {


            for (; counter < 21; counter++) {

                System.out.println("Thread von Worker: " + Thread.currentThread().getName());
                System.out.print("[");
                System.out.print("Counter: " + counter);
                System.out.print("]");
                System.out.println();
                try {

                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

}
