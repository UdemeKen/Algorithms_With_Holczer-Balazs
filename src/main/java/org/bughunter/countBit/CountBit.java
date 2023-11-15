package org.bughunter.countBit;

public class CountBit {

    public int countBit(int n) {
        int counter  = 0;
        while(n > 0){
            System.out.println(n);
            counter++;
            n = n >> 1;
        }
        return counter;
    }
}
