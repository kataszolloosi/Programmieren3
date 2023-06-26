package Abschlussbeispiel_Threads;

import java.util.Date;

public class TimePrintWorker extends Worker implements Runnable{
    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            work();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void work() throws InterruptedException {
        printStarted();
        while(shouldRun = true) {
            Date d = new Date();
            System.out.println(d.toString());
            Thread.sleep(1000);
        }
        printStopped();
    }
}
