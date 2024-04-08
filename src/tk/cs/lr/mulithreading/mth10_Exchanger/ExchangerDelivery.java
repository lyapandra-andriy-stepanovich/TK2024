package tk.cs.lr.mulithreading.mth10_Exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerDelivery {

        private static final Exchanger<String> EXCHANGER = new Exchanger<>();

        public static void main(String[] args) throws InterruptedException {
            String[] p1 = new String[]{"{посилка A->D}", "{посилка A->C}"};
            String[] p2 = new String[]{"{посилка B->C}", "{посилка B->D}"};
            new Thread(new Truck(1, "A", "D", p1)).start();
            Thread.sleep(100);
            new Thread(new Truck(2, "B", "C", p2)).start();
        }

        public static class Truck implements Runnable {
            private int number;
            private String dep;
            private String dest;
            private String[] parcels;

            public Truck(int number, String departure, String destination, String[] parcels) {
                this.number = number;
                this.dep = departure;
                this.dest = destination;
                this.parcels = parcels;
            }

            @Override
            public void run() {
                try {
                    System.out.printf("В вантажівку №%d завантажили: %s и %s.\n", number, parcels[0], parcels[1]);
                    System.out.printf("Вантажівка №%d виїхала з пункту %s в пункт %s.\n", number, dep, dest);
                    Thread.sleep(1000 + (long) Math.random() * 5000);
                    System.out.printf("Вантажівка №%d приехала в пункт Е.\n", number);
                    parcels[1] = EXCHANGER.exchange(parcels[1]);

                    System.out.printf("В вантажівку №%d перемістили посилку для пункту %s.\n", number, dest);
                    Thread.sleep(1000 + (long) Math.random() * 5000);
                    System.out.printf("Вантажівка №%d приїхала в %s і доставила: %s і %s.\n", number, dest, parcels[0], parcels[1]);
                } catch (InterruptedException e) {
                }
            }
        }
    }
