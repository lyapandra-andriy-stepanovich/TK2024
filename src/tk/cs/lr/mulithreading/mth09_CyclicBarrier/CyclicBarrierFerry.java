package tk.cs.lr.mulithreading.mth09_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierFerry {
    private static final CyclicBarrier BARRIER = new CyclicBarrier(3, new FerryBoat());



    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 10; i++) {
            new Thread(new Car(i)).start();
            Thread.sleep(400);
        }
    }


    public static class FerryBoat implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(500);
                System.out.println("Паром переправив автомобілі!");
            } catch (InterruptedException e) {
            }
        }
    }


    public static class Car implements Runnable {
        private int carNumber;

        public Car(int carNumber) {
            this.carNumber = carNumber;
        }

        @Override
        public void run() {
            try {
                System.out.printf("Автомобіль №%d підїхав до старту.\n", carNumber);


                BARRIER.await();
                System.out.printf("Автомобіль №%d продовжив.\n", carNumber);
            } catch (Exception e) {
            }
        }
    }
}
