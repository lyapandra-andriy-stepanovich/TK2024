package tk.cs.lr.mulithreading;

public class ThreadCustom implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread: Name:" + Thread.currentThread().getName() + " - State:" + Thread.currentThread().getState()  + " - Id:" + Thread.currentThread().getId());
    }
}
