package tk.cs.lr.mulithreading.mth01_Thread_Runnable;

import static java.lang.Thread.sleep;

public class ThreadExtds extends ThreadCustom {

    public static void main(String[] args) throws InterruptedException {
        ThreadCustom threadImplRunnable01 = new ThreadCustom();
        ThreadCustom threadImplRunnable02 = new ThreadCustom();
        threadImplRunnable01.run();
        threadImplRunnable02.run();

        System.out.println("Thread: Name:" + Thread.currentThread().getName() + " - State:" + Thread.currentThread().getState()  + " - Id:" + Thread.currentThread().getId());
    }
}
