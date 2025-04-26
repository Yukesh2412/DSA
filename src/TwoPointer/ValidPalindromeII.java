package TwoPointer;

public class ValidPalindromeII {
    public static void main(String[] args) {
//        System.out.println(validPalindrome("racecara"));


        for(int i=0,j=5;i<j;i++,j--){
            System.out.println(i+" "+j);
        }

    }
    static public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    static private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
