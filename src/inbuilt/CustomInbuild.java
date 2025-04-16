package inbuilt;

import java.io.*;
import java.lang.StringBuilder;
import java.util.ArrayList;

public class CustomInbuild {

    static PrintStream out= System.out;


    public static void main(String[] args) {

        //string
//        1. length
//        System.out.print(length("hello"));

//        2. toCharArray
//        out.print(toCharArray("hello"));

//        3.charAt
//        out.print(charAt("hello",0));

//        4.substring
//        out.print(substring("hello",0,5));

        //        5.equals
//        out.print(equals("1",""));

// 6. toLowercase
//        out.print(toLowerCase("HELLO"));

        // 7. toUpper
//        out.print(toUpper("hello"));

        // 8. trim
//        out.print(trim("    "));

        // 9. split
//        out.print(split("       bro     this is      shit  "));
        String temp="";
        String t="";
        out.print(temp==t);


    }


    static int length(String str){
        int count=0;
       char[] arr=str.toCharArray();
       for(int i:arr){
           count++;
       }
    return count;
    }
    static char[] toCharArray(String str){

        char[] arr=new char[str.length()];

        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }

        return arr;
    }
    static char charAt(String str,int index){

        char[] arr= toCharArray(str);

        return arr[index];

    }
    static String substring(String string,int a,int b){
        StringBuilder str=new StringBuilder();

        for(int i=a;i<b;i++){
            str.append(string.charAt(i));
        }
    return str.toString();
    }

    static boolean equals(String s1,String s2){

        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    return false;
                }
            }
            return true;
        }

       return false;
    }


    static String toLowerCase(String str){
        StringBuilder result=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char c=(char) (str.charAt(i) + 32);
            result.append(c);
        }
        return result.toString();
    }
    static String toUpper(String str){
        StringBuilder result=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char c=(char) (str.charAt(i) - 32);
            result.append(c);
        }
        return result.toString();
    }

    static String trim(String str){
        // "  abc "
        int p1=0;
        int p2=str.length()-1; //4

        while(p1<p2){
            if(str.charAt(p1)==32){
                p1++;
            }
            if(str.charAt(p2)==32){
                p2--;
            }
            if(str.charAt(p1)!=32 && str.charAt(p2)!=32){
                break;
            }

        }
        StringBuilder result=new StringBuilder();

        for(int i=p1;i<=p2;i++){
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    static ArrayList<String> split(String str){
        ArrayList<String> arr=new ArrayList<String>();

        String temp="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                temp=temp+str.charAt(i);
            }else if(str.charAt(i)==' '){
                if(!temp.equals("")){
                    arr.add(temp);
                    temp="";
                }

            }
        }
        if(!temp.equals("")){
            arr.add(temp);
        }
        return arr;
    }

}
