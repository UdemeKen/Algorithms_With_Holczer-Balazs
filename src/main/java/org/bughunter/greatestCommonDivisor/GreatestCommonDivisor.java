package org.bughunter.greatestCommonDivisor;

public class GreatestCommonDivisor {

//    We assume a < b in every iteration
    public int gcd_recursion(int a, int b) {

//        Base-case when we terminate the algorithm
        if (a % b == 0){
            return b;
        }
//            Recursive method call
        return gcd_recursion(b, a % b);
    }

    public int gcd_iteration(int a, int b) {

        int temp = 0;

        while (b != 0){
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
