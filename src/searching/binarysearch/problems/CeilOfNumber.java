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

        int[] arr = {2, 4, 6, 8, 10};

        System.out.println(solution.ceil(arr, 5));   // Output: 6
        System.out.println(solution.ceil(arr, 10));  // Output: 10
        System.out.println(solution.ceil(arr, 11));  // Output: -1

        System.out.println(solution.floor(arr, 5));  // Output: 4
        System.out.println(solution.floor(arr, 1));  // Output: -1
        System.out.println(solution.floor(arr, 10)); // Output: 10


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

    public int ceil(int[] arr, int t){
        int s=0;
        int e=arr.length-1;

        if(t>arr[arr.length-1]) return -1; // index out of bound edge case catch

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>t){
                e=m-1;
            }else if(arr[m]<t){
                s=m+1;
            }else{
                return arr[m];
            }
        }
        return arr[s];
    }
    public int floor(int[] arr, int t){
        int s=0;
        int e=arr.length-1;

        if(t<arr[0]) return -1; // index out of bound edge case catch

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>t){
                e=m-1;
            }else if(arr[m]<t){
                s=m+1;
            }else{
                return arr[m];
            }
        }
        return arr[e];
    }
}
