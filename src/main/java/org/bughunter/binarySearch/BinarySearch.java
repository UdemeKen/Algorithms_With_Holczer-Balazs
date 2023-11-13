package org.bughunter.binarySearch;

public class BinarySearch {

    public int find(int[] container, int item, int left, int right) {
//        This is the search miss when the item is not present in the container
        if (right < left) {
            return  -1;
        }
        int middleIndex = (left + right) / 2;
//        We've found the item we're looking for
        if (container[middleIndex] == item){
            return middleIndex;
        }
//        We have to check that the item we're looking for is smaller or greater than the middle_item
        if (container[middleIndex] < item){
//            We can discard the left subArray
            return find(container, item, middleIndex + 1, right);
        } else {
            return find(container, item, left, middleIndex - 1);
        }
    }
}
