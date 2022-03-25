package LeetCode;

public class FindFirstLastPositionSortedArray_34 {
    public static void main(String[] args) {
        int[] res = FindFirstLastPositionSortedArray_34.searchRange(new int[]{1, 2, 2, 4}, 2);
        System.out.println(res[0]);
        System.out.println(res[1]);

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] output = {-1, -1};


            for(int i = 0; i< nums.length; i++ ) {
        if(nums.length == 1 && nums[0] == target) {
            output = new int[]{0, 0};
        }
        if(nums[i] == target) {
            if(output[0] == -1) {
                output[0] = i;
            }

            if(output[1] == 0) {
                output[1] = i;
            }

            if(output[1] == -1) {
                output[1] = i;
            }
        } else {
            
        }

    }
            return output;
}
}
