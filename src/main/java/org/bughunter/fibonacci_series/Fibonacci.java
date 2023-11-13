package org.bughunter.fibonacci_series;

public class Fibonacci {

    public int head(int n) {

//        We have to define the base cases F(0) = 0 and F(1) = 1
        if (n == 0) return 0;
        if (n == 1) return 1;

//        We call the method recursively
        int fib1 = head(n -1);
        int fib2 = head(n - 2);

//        We make some operations
        int result = fib1 + fib2;
        return result;
    }
}
