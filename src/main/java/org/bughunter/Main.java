package org.bughunter;

import org.bughunter.binarySearch.BinarySearch;
import org.bughunter.quickSelect.QuickSelect;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, -2, -5, 10, 55, 2, 3, -7, 7, 11, 100};
        QuickSelect quickSelect = new QuickSelect(nums);
        System.out.println(quickSelect.select(4));

    }
}