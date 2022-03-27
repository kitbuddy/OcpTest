package LeetCode;

import java.net.Inet4Address;
import java.util.HashMap;

public class AdditionOfTwoNumbersReturnsTargetNumber {

    public static void main(String[] args) {
        for (int i : AdditionOfTwoNumbersReturnsTargetNumber.twoSum(new int[]{2, 7, 12, 34}, 14)) {
//            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] num, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i< num.length; i++) {
            int temp = target-num[i];

            if(hm.keySet().contains(temp) ) {
                System.out.println(hm.keySet());
                System.out.println(hm.get(temp));
                System.out.println("-------");
                System.out.println(i);
                return new int[]{hm.get(temp), i};
            }
            hm.put(num[i], i);
        }

        return new int[0];
    }
}
