package com.green.second.ch5;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = MyArray.make(3);
    }
}

class MyArray{
    public static int[] make(int num){
        int[] arr = new int[num];
        return arr;
    }
}

