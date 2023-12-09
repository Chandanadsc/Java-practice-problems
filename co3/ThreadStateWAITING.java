package co3;


public class ThreadStateWAITING implements Runnable{
    public static Thread t1;
    public static void main(String[] args) {
        t1 = new Thread(new ThreadStateWAITING());
        t1.start();
    }
    @Override
    public void run() {
        Thread t2 = new Thread(new DemoWaitingStateRunnable());
        t2.start();
        System.out.println(t2.getState());
        try {
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            //e.printStackTrace();
        }
        System.out.println(t2.getState());
    }
}
class DemoWaitingStateRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            //e.printStackTrace();
        }
        
        System.out.println(ThreadStateWAITING.t1.getState());
    }
}
