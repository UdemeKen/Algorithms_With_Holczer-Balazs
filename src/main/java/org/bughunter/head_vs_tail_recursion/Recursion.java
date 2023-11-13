package org.bughunter.head_vs_tail_recursion;

public class Recursion {

    public void head(int n){
        if (n == 0) {
            return;
        }
//        We call the function recursively
        head(n - 1);
//        We do some operations
        System.out.println("The value of n = " + n);
    }

    public void tail(int n){
        if (n == 0) {
            return;
        }
//        We do some operations
        System.out.println("The value of  n = " + n);
//        We call the function recursively
        tail(n - 1);
    }
}
