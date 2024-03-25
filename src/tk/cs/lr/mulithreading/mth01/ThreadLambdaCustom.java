package tk.cs.lr.mulithreading.mth01;

import static java.lang.Thread.sleep;

public class ThreadLambdaCustom extends ThreadCustom {

    public static void main(String[] args) throws InterruptedException {
        Thread thread00 = new Thread(() -> {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread: Name:" + Thread.currentThread().getName() + " - State:" + Thread.currentThread().getState()  + " - Id:" + Thread.currentThread().getId());
        });
        Thread thread01 = new Thread(() -> {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread: Name:" + Thread.currentThread().getName() + " - State:" + Thread.currentThread().getState()  + " - Id:" + Thread.currentThread().getId());
        });

        thread00.start();
        thread00.join(5000);
        thread01.start();

        System.out.println("Thread: Name:" + Thread.currentThread().getName() + " - State:" + Thread.currentThread().getState()  + " - Id:" + Thread.currentThread().getId());
    }
}
