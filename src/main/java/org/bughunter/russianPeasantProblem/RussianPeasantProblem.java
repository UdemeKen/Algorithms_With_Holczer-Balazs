package org.bughunter.russianPeasantProblem;

public class RussianPeasantProblem {

    public int multiply(int a, int b){

        int result = 0;
        while(b > 0) {
            if((b ^ 1) == b - 1)
                result = result + a;
//            double the first number
                a = a << 1;
//            halve the second number
                b = b >> 1;
        }
        return result;
    }
}
