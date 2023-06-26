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

    protected abstract void work();

    protected void printStarted(){
        //welche auf der Konsole den Namen des Workers, sowie „wurde gestartet“ ausgibt
        System.out.println(name + " wurde gestartet ");

    }

    protected void printStopped() {
        //welche auf der Konsole den Namen des Workers, sowie „wurde gestoppt“ ausgibt
        System.out.println(name + " wurde gestoppt ");

    }

    public void stopWorker(){
        //welche shouldRun auf false setzt
        shouldRun = false;
    }


}
