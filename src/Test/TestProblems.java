package Test;
import java.util.*;

public class TestProblems {

    public static void main(String[] args) {
        int[] arr= new int[]{7,8,1,2,3};
//        System.out.println(Palindrome1("9,8"));
//        System.out.println(isPowerOfFour(16));
//        System.out.println(missingNumber(new int[]{0,1}));
//        pascalTriangle(5);
//        System.out.println(Arrays.toString(ncrRow(3)));
//        System.out.println(maxProfit(new int[]{2,4,1}));
//        System.out.println(ceilNumber(arr,9));
//searchInfinite(arr,15);
//        System.out.println(findPeakElementInMountainArray(arr));
        System.out.println(findPeakElementInRotatedArray(arr));
//        play(arr);
    }


    public static void play(int[] arr) {



    }

    private static int sortedArraySearch(int[] arr,int t) {

        int s=0;
        int e=arr.length-1;

        int peak=findPeakElementInRotatedArray(arr);

        if(peak==-1) return binary(arr,s,e,t);

        if(arr[peak]==t) return peak;

        if(t<arr[0]){
            return binary(arr,peak+1,e,t);
        }
        return binary(arr,peak-1,e,t);

    }

    private static int findPeakElementInRotatedArray(int[] arr) {
        int s=0;
        int e=arr.length-1;

        while(s<e){
            int m=(s+e)/2;

            if(arr[m]<arr[e]){
                e=m;
            }else{
                s=m+1;
            }
        }
// here idea is to find the smallest value in the array, as the peak element in the array
        // will be before the smallest value. if we find smallest then value before the smallest is peak
        return s-1;
    }



    private static int findPeakElementInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;

        while(s<e){
            int m=s+(e-s)/2;

            if(arr[m]>arr[m+1]){
                s=m+1;
            }else{
                e=m;
            }
        }

        return s;
    }


    static public void searchInfinite(int[] arr,int t){

        int s=0;
        int e=5;
        while(t>arr[e]){
            //fixed window
//            s=e+1;
//            e=e+5;
            //exponent window
            int temp=e;
            e=e+(e-s+1)*2;
            s=temp+1;

        }

//        System.out.println(binary(arr,s,e,t));
        System.out.println(s+" "+e);
    }

    static public int binary(int[] arr,int s,int e,int t){

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>t){
                e=m-1;
            }else if(arr[m]<t){
                s=m+1;
            }else{
                return m;
            }
        }
        return -1;
    }



   static public int ceilNumber(int[] arr,int target){
        int s=0;
        int e=arr.length-1;


        if(target > arr[arr.length-1]) return -1;

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>target){
                e=m-1;
            }else if(arr[m]<target) {
                s=m+1;
            }else{
             return arr[m];
            }
        }

    return arr[e];
   }

   static public int maxProfit(int[] prices) {

        int min=0;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(prices[min]>prices[i]){
                min=i;
            }
            int profit= prices[i]-prices[min];

            if(profit>maxProfit){
                maxProfit=profit;
            }


        }
        return maxProfit;
    }

   static public int[] minmax(int[] arr,int a,int b){
        int max=a;
        int min=a;

        for(int i=a;i<b;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return new int[]{min,max};

    }
   static     public int min(int[] arr,int a,int b){
            int min=a;
            for(int i=a;i<b;i++){
                if(arr[i]<arr[min]){
                    min=i;
                }
            }
            return min;

        }



    static void pascalTriangle(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ncr(i,j));
            }
            System.out.println();
        }

    }

    static int ncr(int n,int r){
        int num=1;
        int dem=1;
        for(int i=0;i<r;i++){
            dem=dem*(i+1);
            num=num*(n-i);
        }

        return num/dem;
    }

    static int[] ncrRow(int n){
        int[] arr=new int[n+1];
        arr[0]=1;
        int prev=arr[0];
        for(int i=1;i<=n;i++){
            int currentValue= (n-(i-1));
            prev=prev * currentValue/i;
            arr[i]=prev;
        }
       return arr;
    }

    static int missingNumber(int[] nums) {
        int total=0;
        int arr=0;
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            total=total^i;
        }
        for (int num : nums) {
            arr = arr ^ num;
        }

        return total ^ arr; // Don't forget to xor with n (because 0 to n inclusive)
    }


    static int singleNumber(int[] arr){
        //map method
//        Map<Integer,Integer> map=new HashMap<>();
//
//        for(int i:arr){
//            int value=map.getOrDefault(i,0);
//
//            map.put(i,value+1);
//        }
//
//        for(Map.Entry<Integer,Integer> m: map.entrySet()){
//            if(m.getValue()==1){
//             return m.getKey();
//            }
//        }
//

        // xor method
        int ans=0;

        for(int i:arr){
            ans=ans^i;
        }

        return ans;
    }

    static boolean checkPowerOfTwo(int n){
        if(n<=0) return false;

        int result=n&(n-1);
        return result == 0;
    }

    static boolean isPowerOfFour(int n){

        while(n%4==0){
            n=n/4;
        }

        return n==1;

    }




    static String toBinaryString(int n){
        StringBuilder result=new StringBuilder();

        if(n==0) return "0";

        while(n>0){
            int rem=n%2;
            result.insert(0,rem);
            n=n/2;
        }
        return result.toString();
    }



    public static boolean isAlphaNum(char c){
        if((c>=48 && c<=57) || (c>=97 && c<=122)) return true;

        return false;
    }

    static String Palindrome1(String s){
//  Problem: Check if a sentence is a palindrome, ignoring spaces, punctuation, and case.
//        "A man, a plan, a canal: Panama"

        String str=s.toLowerCase();

        int p1=0;
        int p2=str.length()-1;

        while(p1<p2){


            while(p1<p2 && !isAlphaNum(str.charAt(p1))){
                p1++;
            }

            while(p1<p2 && !isAlphaNum(str.charAt(p2))){
                p2--;
            }


            if(str.charAt(p1)!=str.charAt(p2)){
                return "Not a palindrome";
            }
            p1++;
            p2--;
        }

        return "Palindrome";

    }




}
