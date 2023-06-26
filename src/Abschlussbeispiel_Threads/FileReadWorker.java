package Abschlussbeispiel_Threads;

import java.io.*;
import java.util.ArrayList;

public class FileReadWorker extends Worker implements Runnable {
    private String path;
    private String line;
    public ArrayList<String> lines = new ArrayList<>();
    private static Object lock = new Object();

    public FileReadWorker(String name, String path, String line) {
        super(name);
        this.path = path;
        this.line = line;
    }

    @Override
    protected void work() throws IOException, InterruptedException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

            printStarted();

            while(br.readLine() != null) {
                if (!shouldRun) {
                    break;
                }
                lines.add(line);
                System.out.println(line);
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }
        br.close();
        printStopped();
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                work();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
