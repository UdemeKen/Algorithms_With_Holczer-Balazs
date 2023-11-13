package org.bughunter.linearSearch;

public class LinearSearch {

    public int find(int[] container, int item) {
        for (int i = 0; i < container.length; i++){
//            This is when we find the given item
            if (container[i] == item) {
                return i;
            }
        }
//        This is the search miss when the item is not found
        return -1;
    }
}
