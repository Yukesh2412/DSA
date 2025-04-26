package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class CyclicSort {
    public static void main(String[] args) {
// set mismatch
        int[] arr={1,2,3};

        int i=0;

        while(i<arr.length){
            int index=arr[i]-1;

            if(arr[i]<arr.length && arr[i]>0 && arr[i]!=arr[index]){
                int t=arr[i];
                arr[i]=arr[index];
                arr[index]=t;
            }else{
                i++;
            }
        }


        for(int j=0;j<arr.length;j++){
           if(j!=arr[j]-1){
               System.out.println(j+1);

           }
        }







    }
}
