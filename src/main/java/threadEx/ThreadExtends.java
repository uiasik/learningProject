package main.java.threadEx;

public class ThreadExtends implements Runnable {


    public static int counter = 0;


    @Override
    public synchronized void run() {

        for (int i = 0; i < 10; i++) {
            counter++;
            System.out.println(Thread.currentThread().getName()+ "  " + counter);
        }





    }

}
