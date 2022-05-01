package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;

public class ContainsDuplicateII_219 {

    /*Given an integer array nums and an integer k,
    return true if there are two distinct indices i and j in the array
    such that nums[i] == nums[j] and abs(i - j) <= k.

    Example 1:

    Input: nums = [1,2,3,1], k = 3
    Output: true
    Example 2:

    Input: nums = [1,0,1,1], k = 1
    Output: true
    Example 3:

    Input: nums = [1,2,3,1,2,3], k = 2
    Output: false*/

    public static void main(String[] args) {
        int[] nums = {1,0,1,14};
        int k = 1;
//        System.out.println(ContainsDuplicateII_219.getIndicesDuplicate(nums, k));
        System.out.println(ContainsDuplicateII_219.getIndicesDuplicate2(nums, k));
    }

    public static boolean getIndicesDuplicate2(int[] nums, int k) {
//
//        long start = System.nanoTime();
//// some time passes
//        long end = System.nanoTime();
//        long elapsedTime = end - start;

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(!hs.contains(nums[i])){ // making it slow to work
//            if(!hs.add(nums[i])){

//                System.out.println(elapsedTime);
                return true;
            }
        }
        return false;

    }

    public static boolean getIndicesDuplicate(int[] nums, int k) {

        List<Integer> indicesList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];

            if (element == k) {
                indicesList.add(i);
            }


            if (indicesList.size() > 2) {
                for (int j = 0; j < indicesList.size() - 1; j++) {
                    if (Math.abs(i-j) <= k) {
                        return true;
                    } else {
                        return false;
                    }

                }
            }
        }
//        indicesList.forEach(System.out::println);

        return true;
    }

}
