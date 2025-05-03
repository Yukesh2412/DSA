package searching.binarysearch.problems;

public class BinarySearch {

    public static int binary(int[] arr,int target){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int m=(s+e)/2;

            if(arr[m]>target){
                e=m-1;
            } else if(arr[m]==target){
                return arr[m];
            }else{
                s=m+1;
            }
        }

    return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30,40,50,60,70};

        System.out.println(binary(arr,50));
    }
}
/// m>t 1 t>m 2 m==t
