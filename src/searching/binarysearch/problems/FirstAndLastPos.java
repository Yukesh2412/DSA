package searching.binarysearch.problems;

import java.util.Arrays;

public class FirstAndLastPos {

    public static int firstLastPos(int[] arr ,int t,boolean isFirst ){
        int[]  result=new int[]{-1,-1};

//        Input: nums = [5,7,7,8,8,10], target = 8
//        Output: [3,4]

        //LINEAR
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==t){
//                if(arr[i]!=arr[i-1]){
//                    result[0]=i;
//                }
//                if(arr[i]!=arr[i+1]){
//                    result[1]=i;
//                }
//            }
//        }


        //BINARY

        int s=0;
        int e=arr.length-1;
        int ans=-1;

        while(s<=e){

            int m=(s+e)/2;

            if(arr[m]<t){
                s=m+1;
            }else if(arr[m]>t){
                e=m-1;
            }else{
                ans=m;
                if(isFirst){
                    e=m-1;
                }else{
                    s=m+1;
                }

            }

        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{8,9};
        int[]  result=new int[]{-1,-1};

        result[0]=firstLastPos(arr,8,true);
        result[1]=firstLastPos(arr,8,false);
        System.out.println(Arrays.toString(result));
    }
}
