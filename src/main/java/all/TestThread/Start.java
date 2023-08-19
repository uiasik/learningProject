package all.TestThread;

public class Start {
    ThreadExtends threadExtends2 = new ThreadExtends();
    Thread[] threadExtends = new Thread[2];
    public void start() {
        for (int i = 0; i < threadExtends.length; i++) {
            threadExtends[i] = new Thread(threadExtends2);
        }
    }
    public void run() {
        for (int i = 0; i < threadExtends.length; i++) {
            threadExtends[i].start();
        }
    }
}
