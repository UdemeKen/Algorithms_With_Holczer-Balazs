package org.bughunter;

import org.bughunter.countBit.CountBit;
import org.bughunter.isEven.CheckEvenNumbers;

public class Main {
    public static void main(String[] args) {

        CheckEvenNumbers checkEvenNumbers = new CheckEvenNumbers();
        System.out.println(checkEvenNumbers.isEven(10));
    }
}