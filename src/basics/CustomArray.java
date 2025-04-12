package basics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArray {
    int CAPACITY=5;
    int size=0;
    int[] arr=new int[CAPACITY];


    CustomArray(){

    }
    public static void main(String[] args) {

        CustomArray arr=new CustomArray();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        System.out.println(arr);
        arr.delete();
        arr.delete();
        arr.add(500);
        arr.delete();
        arr.delete();
        arr.delete();
        System.out.println(arr);


    }

    public void add(int value){

        if(size==CAPACITY){
            resizeArray();
        }
        arr[size++]=value;
    }

    private void resizeArray() {
        CAPACITY=CAPACITY*2;
        int[] newArr= new int[CAPACITY];

        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        arr=newArr;
    }

    public void delete() {
        if (size == 0) {
            System.out.println("Array is already empty. Nothing to delete.");
            return;
        }

        size--;

        if (size > 0 && size <= CAPACITY / 4) {
            System.out.println("Shrinking... Size: " + size + ", Capacity before shrink: " + CAPACITY);
            shrinkArray();
            System.out.println("Capacity after shrink: " + CAPACITY);
        } else {
            System.out.println("Deleted. Size: " + size + ", Capacity: " + CAPACITY);
        }
    }


    private void shrinkArray() {
        CAPACITY=CAPACITY/2;
        int[] newArr=new int[CAPACITY];

        for(int i=0;i<CAPACITY;i++){
            newArr[i]=arr[i];
        }
        arr=newArr;
    }

    @Override
    public String toString(){
       int[] result=new int[size];

       for(int i=0;i<size;i++){
           result[i]=arr[i];
       }
       return Arrays.toString(result);
    }
}
