package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MInSizeSubArray_209 {

    // Given an array of positive integers nums and a positive integer target, return the minimal
    // length of a contiguous subarray [numsl, numsl+1, ..., numsr-1,numsr] of which the sum is
    // greater than or equal to target. If there is no such subarray, return 0 instead.

    public static void main(String[] args) {
            int[] nums = {2,3,1,2,4,3};
            int target = 7;
        System.out.println(MInSizeSubArray_209.getMinSizeSubArray(nums, target));
    }

    private static List<Integer> getMinSizeSubArray(int[] nums, int target) {

        int add = 0;
        List<Integer> resultArray = new ArrayList<>();
        if(nums.length == 0) {
            return new ArrayList<>();
        }

        for (int i = 0; i < nums.length; i++) {

            if(add < target) {
                add = nums[i] + nums[i + 1];
                resultArray.add(nums[i]);
            }

            if( nums[i] > add) {
                resultArray = new ArrayList<>();
                resultArray.add(nums[i]);
                add = 0;
                add = nums[i] + nums[i + 1];
            }

            if(add == target) {
                return resultArray;
            }


        }
        return resultArray;
    }

}
