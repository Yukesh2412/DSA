package sorting;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, -1};
//        1. insertion
//        insertion(arr);
//        System.out.println(Arrays.toString(arr));
//        2. selection
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
//         3. bubble

    }
    static void swap(int[] arr,int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;

    }
    static void insertion(int[] arr){

//        2 ways swapping(naive) and shifting(optimised)

//        1. swapping

//        for(int i=1;i<arr.length;i++){
//            int j=i;
//
//            while(j>0 && arr[j]<arr[j-1]){
//                swap(arr,j,j-1);
//                j--;
//
//            }
//        }

//        2. shifiting
        for(int i=0;i<arr.length;i++){
            int j=i;
            int key=arr[j];

            while(j>0 && key<arr[j-1]){
               arr[j]=arr[j-1];
                j--;

            }
            arr[j]=key;
        }


    }

    static int findmin(int[] arr,int a,int b){
        int min=a;
        for(int i=a;i<=b;i++){
            if(arr[min]>arr[i]){
                min=i;
            };
        }
        return min;
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){

            int min= findmin(arr,i+1,arr.length-1);

            if(arr[min]<arr[i]){
                int t=arr[i];
                arr[i]=arr[min];
                arr[min]=t;
            }

        }
    }

}
