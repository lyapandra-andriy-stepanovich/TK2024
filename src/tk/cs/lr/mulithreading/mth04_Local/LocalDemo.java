package tk.cs.lr.mulithreading.mth04_Local;

import tk.cs.lr.mulithreading.mth03_Immutable.CounterImmutable;
import tk.cs.lr.mulithreading.mth03_Immutable.CounterImmutableFalls;

public class LocalDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread01 = new ThreadA();
        Thread thread02 = new ThreadB();

        thread01.start();
        thread02.start();
    }
}