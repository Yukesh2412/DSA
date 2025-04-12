package bitmanipulation;

import java.util.*;

public class ReverseBits {
    // function to reverse bits of a number
    static int reverseBits(int num)
    {
        int NO_OF_BITS = Integer.SIZE;
        int reverse_num = 0;
        for (int i = 0; i < NO_OF_BITS; i++) {
            if (((num >> i) & 1) == 1)
                reverse_num |= 1 << ((NO_OF_BITS - 1) - i);
        }

        List arr= new ArrayList<>();
        Map m=new HashMap();
        m.put(1,"bro");
        m.remove(1);

        for(Object i : m.values()){
            System.out.println(i.toString());
        }
        return reverse_num;
    }









}
