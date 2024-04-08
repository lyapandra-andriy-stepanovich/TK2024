package tk.cs.lr.mulithreading.mth02_Atomic;

public class AtomicDemo {
    static CounterInt counterInt;
    static CounterAtomic counterAtomic;
    public static void main(String[] args) throws InterruptedException {
        counterInt = new CounterInt();
        counterAtomic = new CounterAtomic();

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
            AtomicDemo.counterInt.incrementCounter();
            AtomicDemo.counterAtomic.incrementCounter();
        }
        System.out.println("AtomicDemo.counterInt.getCounter() = " + AtomicDemo.counterInt.getCounter());
        System.out.println("AtomicDemo.counterAtomic.getCounter() = " + AtomicDemo.counterAtomic.getCounter());
    }
}