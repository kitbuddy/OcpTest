package LeetCode;

import recusionsLearn.FibbonacciMemoization;

import java.util.Arrays;

public class Arrauys {

    public static void main(String[] args) {
        int[] response = Arrauys.searchRange(new int[]{1, 3}, 1);
        Arrays.stream(response).forEach(System.out::println);
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] output = {-1, -1};
        if(nums.length == 1 && nums[0] == target) {
            output = new int[]{0, 0};
        }

        for(int i = 0; i< nums.length; i++ ) {
            if(nums[i] == target) {
                if(output[0] == -1) {
                    output = new int[]{0, 0};
                    output[0] = i;
                } else if(output[1] == -1) {
                    output[1] = i;
                }
            }

        }
        return output;
    }

}
