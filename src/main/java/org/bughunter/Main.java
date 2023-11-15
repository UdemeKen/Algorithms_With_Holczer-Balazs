package org.bughunter;

import org.bughunter.countBit.CountBit;

public class Main {
    public static void main(String[] args) {

//        int[] nums = {1, -2, -5, 10, 55, 2, 3, -7, 7, 11, 100};
//        QuickSelect quickSelect = new QuickSelect(nums);
//        System.out.println(quickSelect.select(4));

        CountBit countBit = new CountBit();
        System.out.println(countBit.countBit(16));

    }
}