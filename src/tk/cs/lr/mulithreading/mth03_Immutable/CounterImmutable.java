package tk.cs.lr.mulithreading.mth03_Immutable;

public class CounterImmutable {
        private final int COUNTERIMMUTABLE;
        private  final int CONST = 10;

        public CounterImmutable(int COUNTERIMMUTABLE){
            this.COUNTERIMMUTABLE = COUNTERIMMUTABLE;
        }

//        public void incrementCounter(){
//            this.counterImmutable += 1;
//        }

        public int getCounter(){
            return this.COUNTERIMMUTABLE;
        }
}
