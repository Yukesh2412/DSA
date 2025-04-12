package searching.binarysearch.problems;

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {

        int s=0;
        int e=letters.length-1;

        while(s<=e){
            int m= s+(e-s)/2;
            //IMPORTANT
// the condition if (target > letters[m]) should be if (target >= letters[m]).
//            Here’s why:
//            If target is equal to letters[m], you want to continue searching to the right to find the next greatest letter. Therefore, target >= letters[m] is the appropriate condition to move the start pointer s to m + 1.
//            This ensures that the algorithm correctly finds the smallest letter greater than the target, even if the target matches an element in the array.
//
            if(target>=letters[m]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return letters[s% letters.length];
    }

    public static void main(String[] args) {
        NextGreatestLetter obj= new NextGreatestLetter();
        char[] letters={'c','f','j'};
        System.out.println( obj.nextGreatestLetter(letters, 'c'));

    }
}
