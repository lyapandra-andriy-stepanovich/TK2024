package tk.cs.lr.mulithreading.mth03;

public class CounterImmutable {
        private final int counterImmutable;

        public CounterImmutable(int counterImmutable){
            this.counterImmutable = counterImmutable;
        }

//        public void incrementCounter(){
//            this.counterImmutable += 1;
//        }

        public int getCounter(){
            return this.counterImmutable;
        }
}
