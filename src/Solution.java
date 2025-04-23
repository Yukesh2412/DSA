import java.util.HashMap;
import java.util.*;

class Solution {
    public static void main(String[] args) {


        Map<Character,Integer> map=new HashMap<>();

        String str="abc";


        for(Character i:str.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))>1){
                System.out.println(str.charAt(i));
                break;
            }
        }

        }

}