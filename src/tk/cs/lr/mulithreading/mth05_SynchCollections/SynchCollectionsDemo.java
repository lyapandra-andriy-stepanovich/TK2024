package tk.cs.lr.mulithreading.mth05_SynchCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.lang.Thread.sleep;

public class SynchCollectionsDemo {
    public static void main(String[] args) throws InterruptedException {
        Collection<Integer> syncCollection = Collections.synchronizedList(new ArrayList<>());
        Thread thread01 = new Thread(() -> syncCollection.addAll(Arrays.asList(1,2,3)));
        Thread thread02 = new Thread(() -> syncCollection.addAll(Arrays.asList(4,5,6)));
        thread01.start();
        thread02.start();
        sleep(1000);
        System.out.println("syncCollection = " + syncCollection);
    }
}
