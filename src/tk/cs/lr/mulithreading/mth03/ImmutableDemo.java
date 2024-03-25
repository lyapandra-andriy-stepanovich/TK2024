package tk.cs.lr.mulithreading.mth03;

public class ImmutableDemo {
    public static CounterImmutable counterImmutable;
    public static CounterImmutableFalls counterImmutableFalls;

    public static void main(String[] args) throws InterruptedException {
        counterImmutable = new CounterImmutable(1_000_000);
        counterImmutableFalls = new CounterImmutableFalls(1_000_000);

        Runnable myRunnable01 = new MyRunnableAtomic();
        Runnable myRunnable02 = new MyRunnableAtomic();
        Thread thread01 = new Thread(myRunnable01);
        Thread thread02 = new Thread(myRunnable02);

        thread01.start();
        thread02.start();
    }
}

class MyRunnableAtomic implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
//            ImmutableDemo.counterImmutable.incrementCounter();
            ImmutableDemo.counterImmutableFalls.incrementCounter();
        }
        System.out.println("AtomicDemo.counterImmutable.getCounter() = " + ImmutableDemo.counterImmutable.getCounter());
        System.out.println("AtomicDemo.counterImmutableFalls.getCounter() = " + ImmutableDemo.counterImmutableFalls.getCounter());
    }
}