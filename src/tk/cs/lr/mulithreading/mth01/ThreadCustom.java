package tk.cs.lr.mulithreading.mth01;

public class ThreadCustom implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread: Name:" + Thread.currentThread().getName() + " - State:" + Thread.currentThread().getState()  + " - Id:" + Thread.currentThread().getId());
    }
}
