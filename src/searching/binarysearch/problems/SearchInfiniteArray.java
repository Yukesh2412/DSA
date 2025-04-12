package searching.binarysearch.problems;

public class SearchInfiniteArray {

    public static void main(String[] args) {
    // in infinite array, the upper bound is not available because,\n
    // there is no end in infinite, so we cant use array.length in the case
    // dont care about indexoutofbounds in this sample because, the infinite array\n
    // is never ending, so you cant exceed the maximum range.
    int[] nums={1,3,10,13,15,20,22,34,45,50,61,69,70,71,81,91,201,202,204,206,208,300,310,320,330,340,350,360,370,380,400};
    int target=206;
    // findingpostion at fixed window size
        int[] value=findPostion(target,nums);
        int s=value[0];
        int e=value[1];
    //bruteforce approach - O(n)
        int ans= linear(target,nums,s,e);
        System.out.println(ans);

    // findingposition at exponential window size - optimizing
        int[] value1=findPostionAtExp(target,nums);
        int s1=value1[0];
        int e1=value1[1];
        //optimal approach - O(logn)
        int ans1= binary(target,nums,s1,e1);
        System.out.println(ans);


    }

    static int[] findPostion(int target, int[] nums){
        //window size 5 for instance
        int[] a={0,0};
        int s=0;
        int e=4;
        while(target>nums[e]){
            s=e+1;
            e=e+5;
        }
        a[0]=s;a[1]=e;
        return a;
    }
    static int[] findPostionAtExp(int target, int[] nums){
        int[] a={0,0};
        int s=0;
        int e=1;
        int temp=0;
        while(target>nums[e]){
            //start can e+1 and saving the new start in temp variable
            temp=e+1;
            //double the window value
            // e= previous e+ sizeofwindow*2. To find size of window, then idea is "e=e-(s-1) ==>e=e-s+1".
            e= e+(e-s+1) *2;
            s=temp;
        }
        a[0]=s;a[1]=e;
        return a;
    }

    static int linear(int target,int[] nums, int s,int e){
        for (int i=s;i<=e;i++){
            if(nums[i] == target){
                return s;
            }
        }
        return -1;
    }

    static int binary(int target,int[] nums, int start,int end){
        int s=start;
        int e=end;

        while(s<=e){
            int m= s+(e-s)/2;
            if(nums[m]<target){
                s=m+1;
            }else if(nums[m]>target){
                e=m-1;
            }else{
                return m;
            }
        }
        return -1;

    }


}
