package LeetCode;

public class Min_OfRotatedArray_153 {
/*153. Find Minimum in Rotated Sorted Array

Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.



Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.*/
    public static void main(String[] args) {
        int[] nums =new int[] {14,15,16,9,10,11,12};
        System.out.println(Min_OfRotatedArray_153.getMInValue(nums));
    }

    // Breadth for BreadthFirstSearch
    private static int getMInValue(int[] nums) {

        int low = 0;
        int high = nums.length -1;


        while (low < high) {
            int guess = (low + high) /2;
            System.out.println("low -> " + low);
            System.out.println("guess -> " + guess);

            System.out.println("high -> " + high);
            if(nums[guess] > nums[high]) {
                low = guess +1;
                System.out.println("lowValue => " + nums[low]);
            } else {
                high = guess;
                System.out.println("highValue => " + nums[high]);
            }
            System.out.println("-----------------");

        }
        return nums[low];
    }

}
