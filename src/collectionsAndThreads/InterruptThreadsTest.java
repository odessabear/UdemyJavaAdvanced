package collectionsAndThreads;

import java.util.Random;

public class InterruptThreadsTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1000000000; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread was interrupted");
                        break;
                    }
                    Math.sin(random.nextDouble());

                }
            }
        });

        System.out.println("Starting of thread");

        thread.start();

        thread.interrupt();
        Thread.sleep(1000);

        thread.join();


        System.out.println("Thread finished");
    }
}
