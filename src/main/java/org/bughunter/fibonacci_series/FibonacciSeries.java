package org.bughunter.fibonacci_series;

/*

Introduction to Dynamic Programming - Fibonacci Series

A Fibonacci series is the sequence of numbers in which each number is the sum of the two preceding ones.
For example, 0,1, 1, 2, 3, and so on. Here each number is the sum of the two preceding numbers.

*/
public class FibonacciSeries {

    public  int recursive(int n){
        if(n <= 1){
            return n;
        }
        int x = recursive(n - 1);
        int y= recursive(n - 2);
        return x + y;
    }

    public  int topDownMemoization(int n, int[] dp){
        if(n <= 1){
            return n;
        }
        int x = topDownMemoization(n - 1, dp);
        int y = topDownMemoization(n - 2,dp);
        return dp[n] = x + y;
    }

    public int bottomUpTabulation(int n){
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i =2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int spaceOptimizationBottomUp(int n){
        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
