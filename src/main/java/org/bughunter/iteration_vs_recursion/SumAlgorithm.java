package org.bughunter.iteration_vs_recursion;

public class SumAlgorithm {

    public int iteration(int n){
        int result = 0;
        for(int num = 1; num <= n; num++){
            result += num;
        }
        return result;
    }

    public int recursion(int n){
        if (n == 1){
            return 1;
        }
        return n + recursion(n - 1);
    }
}
