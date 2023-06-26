package Abschlussbeispiel_Threads;

import java.util.Date;

public class TimePrintWorker extends Worker implements Runnable{
    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    public void run() {
        work();
    }

    @Override
    protected void work() {
        printStarted();
        while(shouldRun) {
            Date d = new Date();
            System.out.println(d.toString() + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        printStopped();
    }
}
