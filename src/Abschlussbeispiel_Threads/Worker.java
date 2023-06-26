package Abschlussbeispiel_Threads;

import java.io.IOException;

public abstract class Worker {
    protected String name;
    protected boolean shouldRun;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker(String name) {
        this.name = name;
        shouldRun = true;
    }

    protected abstract void work() throws IOException, InterruptedException;

    protected void printStarted(){
        System.out.println(name + " Wurde gestartet ");

    }

    protected void printStopped() {
        System.out.println(name + " Wurde gestoppt ");

    }

    public void stopWorker(){
        shouldRun = false;
    }


}
