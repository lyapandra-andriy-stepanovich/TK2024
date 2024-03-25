package tk.cs.lr.mulithreading.mth04_Local;

import java.util.Arrays;
import java.util.List;

public class ThreadB extends Thread{
    private final List letters = Arrays.asList("a","b","c");
    private final int number = 10;

    @Override
    public void run() {
        letters.forEach(System.out::println);
        System.out.println("number = " + number);
    }
}
