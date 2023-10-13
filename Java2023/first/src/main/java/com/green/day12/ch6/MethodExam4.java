package com.green.day12.ch6;

import java.util.Arrays;

public class MethodExam4 {

    int[] plusMap(int[] arr, int val) {
        int[] rArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rArr[i] = arr[i];
            rArr[i] += val;
        }
        return rArr;
    }

    void plusOrigin(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += val;

        }
    }

    int[] randomValFromTo(int len, int min, int max) {
        int[] tmpArr = new int[len];
        for (int i = 0; i < tmpArr.length; i++) {
            int rVal = (int) (Math.random()*(max-min+1))+min;
            tmpArr[i] = rVal;
        }
        return tmpArr;
    }
    public static void main(String[] args) {
        MethodExam4 me4 = new MethodExam4();

        int[] arr = {10, 20, 30, 40, 50};
        int[] rArr1 = me4.plusMap(arr, 2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rArr1));

        me4.plusOrigin(arr, 4);
        System.out.println(Arrays.toString(arr));
        //배열크기 랜덤 값 min~max
        int[] rArr2 = me4.randomValFromTo(10,5,20);
        System.out.println(Arrays.toString(rArr2));


    }
}
