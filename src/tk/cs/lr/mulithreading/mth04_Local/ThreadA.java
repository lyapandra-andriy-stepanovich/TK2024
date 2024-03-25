package tk.cs.lr.mulithreading.mth04_Local;

import java.util.Arrays;
import java.util.List;

public class ThreadA extends Thread{
    private final List numbers = Arrays.asList(1,2,3);
    private final int number = 1;

    @Override
    public void run() {
        numbers.forEach(System.out::println);
        System.out.println("number = " + number);
    }
}
