class Solution {
    public static void main(String[] args) {

        int  n=5;

        for(int i=0;i<n;i++){
            for(int space=0;space<n-i;space++){
                System.out.print(" ");
            }
            for(int star=0;star<i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int space=0;space<i;space++){
                System.out.print(" ");
            }
            for(int star=0;star<n-i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}