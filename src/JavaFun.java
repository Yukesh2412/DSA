import javax.swing.plaf.synth.SynthSeparatorUI;
import java.util.*;
import java.lang.System;

class JavaFun{




    public static void main(String[] args) {
        int value=30;


        int s=0;
        int e=value;
        int m=-1;

        while(s<=e){
            m = s+(e-s)/2;

            if(m*m==value){
                System.out.print(m);
                break;
            }

            if(m*m > value){
                e=m-1;
            }

            if(m*m< value){
                s=m+1;

            }

        }

        System.out.print(m);


    }
}


