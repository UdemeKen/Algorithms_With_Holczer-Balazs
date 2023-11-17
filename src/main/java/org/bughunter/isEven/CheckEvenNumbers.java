package org.bughunter.isEven;

public class CheckEvenNumbers {

    public boolean isEven(int n){

//        XOR operator with 1 decrements the value for odd numbers
        if ((n ^ 1) == n + 1) {
            return true;
        } else {
            return false;
        }
    }
}
