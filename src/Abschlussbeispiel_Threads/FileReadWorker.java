package Abschlussbeispiel_Threads;

import java.io.*;
import java.util.ArrayList;

public class FileReadWorker extends Worker implements Runnable {
    private String path;
    public ArrayList<String> lines;
    private static Object lock = new Object();

    public FileReadWorker(String name, String path) {
        super(name);
        this.path = path;
        lines = new ArrayList<>();
    }

    @Override
    protected void work() {
        printStarted();
        File f = new File(path);
        System.out.println("Pfad zum File: " + f.getAbsolutePath());
        FileReader fr = null;
        BufferedReader br = null;
        String one_line;
        try {
            fr = new FileReader(path);
             br = new BufferedReader(fr);
            while ((one_line = br.readLine()) != null) {
                if (!shouldRun) {
                    break;
                }
                System.out.println(one_line);
                lines.add(one_line);
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }
            br.close();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        printStopped();
    }

    @Override
    public void run() {
        synchronized (lock) {
            work();
        }

    }
}
