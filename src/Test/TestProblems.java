package Test;

public class TestProblems {

    public static void main(String[] args) {
        System.out.println(Palindrome1("A man, a plan, a canal: Panama"));


    }


    static boolean isAlpha(char c){
        if(c>=97 && c<=122){
            return true;
        }
        return false;
    }

    static String Palindrome1(String s){
//  Problem: Check if a sentence is a palindrome, ignoring spaces, punctuation, and case.
//        "A man, a plan, a canal: Panama"

        String str=s.toLowerCase();

        int p1=0;
        int p2=str.length()-1;

        while(p1<p2){


            while(!isAlpha(str.charAt(p1))){
                p1++;
            }

            while(!isAlpha(str.charAt(p2))){
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
