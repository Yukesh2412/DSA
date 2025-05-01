package Test;
import java.util.*;

public class TestProblems {

    public static void main(String[] args) {
//        System.out.println(Palindrome1("9,8"));
//        System.out.println(isPowerOfFour(16));
//        System.out.println(missingNumber(new int[]{0,1}));
//        pascalTriangle(5);
//        System.out.println(Arrays.toString(ncrRow(3)));
        System.out.println(maxProfit(new int[]{2,4,1}));
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
