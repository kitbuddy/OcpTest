package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Duplicate1_217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(Duplicate1_217.containsDuplicate1( nums));
    }

    public static boolean containsDuplicate1(int[] nums) {

        Set<Integer> intSet = new HashSet<>();

        for(int i =0; i<nums.length; i++) {
            intSet.add(nums[i]);
        }

        if(nums.length == intSet.size()) {
            return false;
        } else {
            return true;
        }
    }

}
