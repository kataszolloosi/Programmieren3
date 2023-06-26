package Abschlussbeispiel_Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TimePrintWorker w1 = new TimePrintWorker("TimePrintWorker");
        Thread t1 = new Thread(w1);

        FileReadWorker w2 = new FileReadWorker("FileReadWorker", "test.txt");
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();

        t2.join();

        w1.stopWorker();

    }
}
