package org.bughunter.quickSelect;

import java.util.Random;

public class QuickSelect {

    private int[] nums;

    public QuickSelect(int[] nums){
        this.nums = nums;
    }

    public int select(int k){
        return quickSelect(0, nums.length - 1, k - 1);
    }

    private int partition(int firstIndex, int lastIndex){
//        Index of the random pivot[firstIndex, lastIndex]
        int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
        swap(pivot, lastIndex);
        for (int i = firstIndex; i < lastIndex; i++) {
            if (nums[i] < nums[lastIndex]){
                swap(i, firstIndex);
                firstIndex++;
            }
        }
        swap(lastIndex, firstIndex);
        return firstIndex;
    }

    private void swap(int pivot, int lastIndex) {
        int temp = nums[pivot];
        nums[pivot] = nums[lastIndex];
        nums[lastIndex] = temp;
    }

    private int quickSelect(int firstIndex, int lastIndex, int k) {
        int pivotIndex = partition(firstIndex, lastIndex);
        if (pivotIndex < k){
//            We have to discard the left subarray, so we have to consider the items on the right
            return quickSelect(pivotIndex + 1, lastIndex, k);
        }else if (pivotIndex > k){
//            We have to discard the right subarray, so we have to consider the items on the left
            return quickSelect(firstIndex, pivotIndex - 1, k);
        }
        return nums[pivotIndex];
    }
}
