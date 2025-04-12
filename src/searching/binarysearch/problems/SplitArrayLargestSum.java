package searching.binarysearch.problems;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        Solution1 ob=new Solution1();
        int [] nums={7,2,5,10,8};

        System.out.println(ob.splitArray(nums,2));
    }
}
class Solution1 {
    public int splitArray(int[] nums, int k) {

        // 1.min split i.e k=1, the value will be minimum in the array(this is our lower bound)

        // 2.max split i.e k=nums.length, the value will be sum of array (upper bound)

        // 3.(s,e) - will be the search bound. so we use BINARY SEARCH EVENTHOUGH THE INPUT IS NOT SORTED ARRAY.

        int s=nums[0];
        int e=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<s){
                s=nums[i];
            }
            e+=nums[i];
        }
        // now we found lower and upper bound,

        while(s<e){
            int pieces=1;
            int sum=0;
            int m=s+(e-s)/2;

            for(int i=0;i<nums.length;i++){
                if(sum+nums[i]>m){
                    sum=nums[i];
                    pieces++;
                }else{
                    sum+=nums[i];
                }
            }


            // check if obtainer pieces(splits) are less than or equal to allowed splits i.e(k=2), if lesser or equal, the possible answer fall under left of the range, so e=m;
            if(pieces<=k){
                e=m;
            }else{
                // if greater than pieces greater than k, the possible range might fall under the right side of the array.
                s=m+1;
            }

        }

        return e;
    }
}