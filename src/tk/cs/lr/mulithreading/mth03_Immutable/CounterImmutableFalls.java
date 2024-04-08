package tk.cs.lr.mulithreading.mth03_Immutable;

public class CounterImmutableFalls {
        private int counterImmutable;

        public CounterImmutableFalls(int counterImmutable){
            this.counterImmutable = counterImmutable;
        }

    public void incrementCounter(){
        this.counterImmutable += 1;
    }

    public int getCounter(){
        return this.counterImmutable;
    }
}
