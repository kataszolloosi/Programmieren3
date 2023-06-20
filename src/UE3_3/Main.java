package UE3_3;

public class Main {
    public static void main(String[] args) {
        Worker w = new Worker();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        t1.start();
        t2.start();
    }
}
