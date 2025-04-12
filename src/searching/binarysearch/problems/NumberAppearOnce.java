//class Solution {
//    public int singleNumber(int[] num) {
//        int[] arr={};
//        int s=0;
//        int e=arr.length-1;
//
//        while(s<=e){
//            int m=s+(e-s)/2;
//            if(m+1<arr.length&& arr[m]==arr[m+1]){
//                if((m&1)==1){
//                    e=m-1;
//                }else{
//                    s=m+1;
//                }
//            }else{
//                if((m&1)==1){
//                    s=m+1;
//                }else{
//                    e=m-1;
//                }
//            }
//        }
//
//        return arr[s];
//    }
//
////    public static int[] sort(int[] arr){
////        if(arr.length==1) return arr;
////
////        for(int i=0;i<arr.length;i++){
////            int min= min(arr,i+1);
////
////            if(arr[i]>arr[min]){
////                int t=arr[i];
////                arr[i]=arr[min];
////                arr[min]=t;
////            }
////        }
////        return 0;
////    }
//
//    public static int min(int[] arr,int s){
//        int min=s;
//
//        for(int i=s;i<arr.length;i++){
//            if(arr[i]<arr[min]){
//                min=i;
//            }
//        }
//        return min;
//    }
//}
