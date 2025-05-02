package searching.linearsearch;

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9,10}};

        int[][] arr2=new int[3][];

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr2.length;i++){
         for(int j=0;j<arr2[i].length;j++){
             int n= sc.nextInt();
             arr2[i][j]=n;
         }
        }

        for(int[] i: arr2){
            for(int j:i){
                System.out.println(j);
                }
            }
        }




}
