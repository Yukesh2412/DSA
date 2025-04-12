package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {


        int  n=5;
        String str="1";
        String output="";

        if(n==1){
            System.out.println("1");
        }

        int j=0;
        while(j<n){

            int i=0;
            int count=0;
            char value=str.charAt(i);

            while(i<str.length()){
                if(value == str.charAt(i)){
                    count++;
                    i++;
                }else{
                    str=output+count+str.charAt(i);
                    count=0;
                    value=str.charAt(i);
                }
            }

            str=output+count+str.charAt(i);;
            System.out.println(str);
            j++;
        }

    }
}
