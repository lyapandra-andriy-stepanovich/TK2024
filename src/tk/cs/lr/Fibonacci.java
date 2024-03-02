package tk.cs.lr;

public class Fibonacci {
    public int getFibonacciNumbers(int numberN)
    {
        if(numberN == 0)
        {
            return 0;
        }
        if(numberN == 1)
        {
            return 1;
        }
        return (getFibonacciNumbers(numberN - 2) + getFibonacciNumbers(numberN - 1));
    }
}
