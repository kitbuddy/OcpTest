package StreamDemo;

import java.util.HashSet;
import java.util.Set;

public class IntArrayToSet {

    public static void main(String[] args) {
       int[] nums = {1,2,3,1};
        System.out.println(IntArrayToSet.containsDuplicate( nums));
    }

        public static boolean containsDuplicate(int[] nums) {

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
