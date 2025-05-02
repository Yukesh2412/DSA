package searching.binarysearch.problems;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30,40,50,60};

        int s=0;
        int e=arr.length-1;
        int target=600;
        boolean found=false;
        while(s<=e){
            int m=(s+e)/2;

            if(arr[m]==target){
                System.out.println("found");
                found=true;
                break;
            }else if(arr[m]>target){
                e=m-1;
            }else{
                s=m+1;
            }
        }

        if(!found){
            System.out.println("not found");
        }
    }
}
