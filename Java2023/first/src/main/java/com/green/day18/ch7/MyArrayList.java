package com.green.day18.ch7;

import java.util.Arrays;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int val) {
        int[] tmp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = val;
        arr = tmp;

    }
    public void add(int idx, int val) {
        int[] tmp = new int[arr.length + 1];
        tmp[idx] = val;
        for (int i = 0; i < arr.length; i++) {
            tmp[i<idx ? i : i+1] = arr[i];
        }
        arr = tmp;
    }
    @Override
    public String toString() {
        if (arr.length == 0) {
            return "[]";
        }
        String r = "[" + arr[0];
        for (int j = 1; j < arr.length; j++) {
            r += ", " + arr[j];
        }
        r += "]";
        return r;
    }
}

class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(14);
        list.add(12);
        list.add(15);
        System.out.println(list);
        list.add(1, 40);
        System.out.println(list);
    }
}
