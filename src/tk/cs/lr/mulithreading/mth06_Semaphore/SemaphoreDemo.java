package tk.cs.lr.mulithreading.mth06_Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    private static final boolean[] VAC_NUMB = new boolean[6];
    private static final Semaphore SEMAPHORE = new Semaphore(5, true);

    public static void main(String[] args) throws InterruptedException {
        for (int nn_of_Thread = 1; nn_of_Thread <= 7; nn_of_Thread++) {
            System.out.println("1 Start new thread " + nn_of_Thread);
            new Thread(new ConcurrentObject(nn_of_Thread)).start();
            System.out.println("3 The thread " + nn_of_Thread + " is running ");
            Thread.sleep(400);
            System.out.println("6 The thread " + nn_of_Thread + " has finished ");
            System.out.println();
        }
    }

    public static class ConcurrentObject implements Runnable {
        private int threadCnt;

        public ConcurrentObject(int threadCnt) {
            this.threadCnt = threadCnt;
        }

        @Override
        public void run() {
            try {
                SEMAPHORE.acquire();
                System.out.printf("2 SEMAPHORE acquired %d\n", threadCnt);
                int taskNumber = 0;

                synchronized (VAC_NUMB) {
                    for (int VAC_NUMB_cnt = 1; VAC_NUMB_cnt < 6; VAC_NUMB_cnt++)
                        if (!VAC_NUMB[VAC_NUMB_cnt]) {
                            VAC_NUMB[VAC_NUMB_cnt] = true;
                            taskNumber = VAC_NUMB_cnt;
                            System.out.printf("5 Thread " + threadCnt + " processing the task = ",VAC_NUMB_cnt);
                            break;
                        }
                }

                Thread.sleep(5000);

                synchronized (VAC_NUMB) {
                    VAC_NUMB[taskNumber] = false;
                }
                System.out.println("Task " + taskNumber + " is done");

            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            SEMAPHORE.release();
            System.out.println("7 SEMAPHORE acquired" + threadCnt);
            System.out.println("7 Semaphore " + threadCnt + " is Out");
        }
    }
}