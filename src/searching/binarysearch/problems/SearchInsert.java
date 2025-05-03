package searching.binarysearch.problems;

public class SearchInsert {

    public static int searchInsert(int[] arr,int target){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int m=(s+e)/2;

            if(arr[m]>target){
                e=m-1;
            } else if(arr[m]<target){
               s=m+1;
            }else{
               return m;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,3,5,6};

        System.out.println(searchInsert(arr,7));

    }
}
