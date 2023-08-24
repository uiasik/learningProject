package main.java.threadEx;

import main.java.Start;

public class StartThread implements Start {
    ThreadExtends threadExtends2 = new ThreadExtends();
    Thread[] threadExtends = new Thread[2];
    public void start() {
        createThread();
        run();
    }
    private void createThread(){
        for (int i = 0; i < threadExtends.length; i++) {
            threadExtends[i] = new Thread(threadExtends2);
        }
    }
    private void run() {
        for (int i = 0; i < threadExtends.length; i++) {
            threadExtends[i].start();
        }
    }
}
