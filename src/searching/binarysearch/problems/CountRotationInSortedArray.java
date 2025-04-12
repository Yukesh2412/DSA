package searching.binarysearch.problems;

public class CountRotationInSortedArray {
    public static void main(String[] args) {
        int[] nums={15,18,2,3,4,6};
        // linear approach
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                c=i+1;
                break;
            }
        }
        System.out.println("using O(n)"+c);

        // binary approach
        int peak=findpeak(nums);
        // index of peak+1 will be the number of time the sorted array is rotated
        int count=peak+1;
        if(peak==-1){
            System.out.println("not rotated");

        }else{
            System.out.println("using O(logn)"+count);

        }

    }

    static int findpeak(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int  m=s+(e-s)/2;
            if(m<e && nums[m]>nums[m+1]){
                return m;
            }
            if(m>s && nums[m]<nums[m-1]){
                return m-1;
            }
            if(nums[m]>=nums[e]){
                s=m+1;
            }else{
                e=m-1;
            }
        }

        return -1;
    }

}
