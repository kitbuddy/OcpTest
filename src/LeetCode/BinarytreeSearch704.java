package LeetCode;

import java.util.Arrays;

public class BinarytreeSearch704 {
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//
//You must write an algorithm with O(log n) runtime complexity.
//

    public static int search(int[] nums, int target) {

            int location = -1;
            if(nums.length==0) {
                return -1;
            }

            for(int i = 0; i< nums.length; i++) {
                if(nums[i] == target) {
                    location =  i;
                    break;
                } else {
                    location = -1;
                }
            }
            return location;
        }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(BinarytreeSearch704.search(nums, target));
        System.out.println(BinarytreeSearch704.searchByMaps(nums, target));

    }
    // copied from Leet code
    private static int searchByMaps(int[] nums, int target) {

            int pivot;
            int leftIndex = 0;
            int rightIndex = nums.length - 1;

            while (leftIndex <= rightIndex) {
                pivot = leftIndex + (rightIndex - leftIndex) / 2;
                if (nums[pivot] == target) return pivot;
                if (target < nums[pivot]) rightIndex = pivot - 1;
                else leftIndex = pivot + 1;
            }
            return -1;

    }
}
