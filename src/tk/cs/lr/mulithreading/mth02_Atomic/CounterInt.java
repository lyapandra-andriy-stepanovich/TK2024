package tk.cs.lr.mulithreading.mth02_Atomic;

public class CounterInt {
    private int counter = 0;

    public void incrementCounter() {
        counter += 1;
    }

    public int getCounter() {
        return counter;
    }
}
