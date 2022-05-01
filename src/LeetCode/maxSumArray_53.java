package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class maxSumArray_53 {
    /*Given an integer array nums, find the contiguous subarray
    (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 */

    public static void main(String[] args) {
//        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = new int[] {4,2,1,7,8,1,2,8,1,0};
//        int[] nums = new int[] {-2,1,-3};
//        System.out.println(maxSumArray_53.getMaxSumArray(nums));
        System.out.println(getMaxSumSubArray(nums,4));
    }

    private static int getMaxSumSubArray(int[] nums, int slidingWindowMaxSize) {
//        nums = new int[] {4,2,1,7,8,1,2,8,1,0};
        int max_so_far = Integer.MIN_VALUE;
        int current_running_Sum = 0;

        if(nums.length == 0) {
            return 0;
        } else if(nums.length <=3) {
            for (int j = 0; j<nums.length; j++) {
                max_so_far += nums[j];
            }
            return max_so_far;
        }

//                  for (int i = 0; i < nums.length-2; i++) {


//                current_running_Sum = nums[i] + nums[i + (slidingWindowMaxSize-2)] + nums[i+(slidingWindowMaxSize-1)];

//          current_running_Sum = nums[i] + nums[i+1] + nums[i+2];

//            if(current_running_Sum >= max_so_far) {
//                max_so_far = current_running_Sum;
//            }
        for (int i = 0; i < nums.length; i++) {

            current_running_Sum += nums[i];

//            System.out.println(i);

            if(i >= slidingWindowMaxSize-1) {
                max_so_far = Math.max(max_so_far, current_running_Sum);
                current_running_Sum -= nums[i - (slidingWindowMaxSize-1)];
            }

        }


        return max_so_far;

    }

    private static int getMaxSumArray(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        int tempSum = nums[0];
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
//             tempSum = Math.max(tempSum + nums[i], nums[i]);
            if(tempSum < nums[i]) {
                tempSum = nums[i];
            } else  {
                tempSum = tempSum + nums[i];
            }


            maxSum = Math.max(tempSum, maxSum);
        }

        return maxSum;
    }
}
