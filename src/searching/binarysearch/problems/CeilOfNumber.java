package searching.binarysearch.problems;

import java.util.Arrays;

public class CeilOfNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 8, 10, 10, 12, 19};
        int target = 9;
        int result = solution.searchInsert(nums, target);
        System.out.println("Input:"+ Arrays.toString(nums) + "target = 5");
        System.out.println("Output: " + result); // Output: 2

    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] < target) {
                s = m + 1;
            } else if (nums[m] > target) {
                e = m - 1;
            } else {
                return nums[m];
            }
        }

        return nums[s];
    }
}
