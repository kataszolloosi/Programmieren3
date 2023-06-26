package Abschlussbeispiel_Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TimePrintWorker tpw = new TimePrintWorker("TimePrintWorker");
        FileReadWorker frw = new FileReadWorker("FileReadWorker", "beispiel.txt", null);


        Thread t1 = new Thread(tpw);
        Thread t2 = new Thread(frw);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
