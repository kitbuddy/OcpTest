package LeetCode;

public class SmallestSubArrayWithGivenSum {

    public static void main(String[] args) {
        int sum = 8;
        int[] nums = new int[] {4,2,2,7,8,1,2,8,10};

        System.out.println(getSmallestSetForGivenSum(nums, sum));
    }

    public static int getSmallestSetForGivenSum(int[] arr, int targetSum) {

        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum =0;
        int windowStart =0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {

            currentWindowSum += arr[windowEnd];

            while (currentWindowSum >= targetSum) {
                minWindowSize = Math.min(minWindowSize, windowEnd-windowStart+1);
                currentWindowSum -= arr[windowStart];
                windowStart++;
            }

        }
        // it will return one as window size is one with value of only 8 in it.
        return minWindowSize;

    }
}
