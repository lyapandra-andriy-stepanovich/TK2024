package tk.cs.lr.mulithreading.mth02_Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomic {
    private AtomicInteger counter = new AtomicInteger(0);

    public void incrementCounter() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }
}
