package tk.cs.lr.mulithreading.mth06_Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static boolean[] VAC_NUMB = new boolean[5];
    public static final Semaphore SEMAPHORE = new Semaphore(2, true);

    public static void main(String[] args) throws InterruptedException {
        for (int nn_of_Thread = 1; nn_of_Thread < 10; nn_of_Thread++) {
            System.out.println("Run new thread " + nn_of_Thread);
            new Thread(new ConcurrentObject(nn_of_Thread)).start();
            System.out.println("The thread is sleeping " + nn_of_Thread);
            Thread.sleep(400);
            System.out.println("The thread has finished " + nn_of_Thread);
        }
    }

    static class ConcurrentObject implements Runnable {
        private int threadCnt;

        public ConcurrentObject(int carCnt) {
            this.threadCnt = carCnt;
        }

        @Override
        public void run() {
            try {
                SemaphoreDemo.SEMAPHORE.acquire();
                System.out.println("SEMAPHORE acquired");
                for (int i = 0; i < 4; i++) {
                    System.out.println("i = " + i);
                    if (!SemaphoreDemo.VAC_NUMB[i]) {
                        SemaphoreDemo.VAC_NUMB[i] = true;
                        System.out.println("code " + threadCnt + " is working. SemaphoreDemo.VAC_NUMB[i] = " + SemaphoreDemo.VAC_NUMB[i]);
                        break;
                    }
                }
                Thread.sleep(200);
                SEMAPHORE.release();
                System.out.println("Semaphore " + threadCnt + " is Out");
                System.out.println();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}