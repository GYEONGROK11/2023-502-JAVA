package com.green.second.ch5;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = MyArray.make(5);

        MyArray.inputStart(arr, 8);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = MyArray.mapSum(arr, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        int sum = MyArray.sum(arr2);
        System.out.println(sum);

        int[] arr4 = {10, 2, 1, 9, 13};
        int min = MyArray.min(arr4);
        System.out.println(min);

        MyArray.shuffle(arr4);
        System.out.println(Arrays.toString(arr4));

    }
}

class MyArray {
    public static int min(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rIdx = (int) (Math.random() * arr.length);
            if (i == rIdx) {continue;}
            int tmp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = tmp;
        }
    }

    public static int[] make(int len) {
        int[] arr = new int[len];
        return arr;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] mapSum(int[] arr, int num) {
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i] + num;
        }
        return tmp;
    }

    public static void inputStart(final int[] arr, final int num) {
        int tmp = num;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tmp++;
        }
    }
}

