package collectionsAndThreads;

public class ThreadTest {
    public static void main(String[] args) {

//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        MyThread myThread1 = new MyThread();
//        myThread1.start();

        Thread thread = new Thread(new Runner());
        thread.start();

        System.out.println("Hello from main thread");

    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread" + i );
        }

    }
}

class MyThread extends Thread {
    public void run(){
        for(int i = 0;i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread" +i );
        }
    }
}
