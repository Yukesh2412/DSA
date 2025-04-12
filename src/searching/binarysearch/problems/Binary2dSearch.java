package searching.binarysearch.problems;

import java.util.Arrays;
import java.util.Map;

public class Binary2dSearch {
    public static void main(String[] args) {
        int[][] arr=new int[][] {{10,20,30,40},{11,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target=10;
        System.out.println(Arrays.toString(search(arr, target)));


    }

   static public int[] search(int[][] arr,int target){
        int r=0;
        int c=arr.length-1;

        while(r<=arr.length-1 && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }else if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }

        }

        return new int[]{-1,-1};
    }

}
