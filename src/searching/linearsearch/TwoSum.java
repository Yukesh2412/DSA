package searching.linearsearch;

import java.util.*;
class Solution {
    public static void main(String[] args) {
        System.out.println( Arrays.toString(twoSum(new int[]{3,2,4},6)));
    }
   static public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map=new HashMap<>();



        for(int i=0;i<nums.length-1;i++){
            int value=target-nums[i];

            if(map.containsKey(value)){
                return new int[]{map.get(value),i};
            }

            map.put(nums[i],i);

        }

        return new int[]{-1,-1};


    }

//  static  public int search(int[] arr,int a,int b,int t){
//
//        for(int i=a;i<b;i++){
//            if(arr[i]==t){
//                return i;
//            }
//        }
//
//        return -1;
//    }
}