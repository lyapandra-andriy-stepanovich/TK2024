package tk.cs.lr.mulithreading.mth01;

import static java.lang.Thread.sleep;

public class RunnableImpl {
    public static void main(String[] args) throws InterruptedException {
        Runnable myRunnable01 = new MyRunnable();
        Runnable myRunnable02 = new MyRunnable();
        Thread thread01 = new Thread(myRunnable01);
        Thread thread02 = new Thread(myRunnable02);
        thread01.setName("Thread-01");
        thread02.setName("Thread-02");
        thread01.setPriority(1);
        thread02.setPriority(10);
        Thread.currentThread().setName("Thread-mn");

        thread01.start();
        thread02.join();
        thread02.start();
        System.out.println("Thread: Name:" + Thread.currentThread().getName() + " - State:" + Thread.currentThread().getState()  + " - Id:" + Thread.currentThread().getId()  + " - Priority:" + Thread.currentThread().getPriority());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread: Name:" + Thread.currentThread().getName() + " - State:" + Thread.currentThread().getState()  + " - Id:" + Thread.currentThread().getId());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread: Name:" + Thread.currentThread().getName() + " - State:" + Thread.currentThread().getState()  + " - Id:" + Thread.currentThread().getId() + " - Priority:" + Thread.currentThread().getPriority());
    }
}
