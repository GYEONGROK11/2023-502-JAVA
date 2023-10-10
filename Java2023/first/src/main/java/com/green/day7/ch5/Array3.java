package com.green.day7.ch5;

public class Array3 {
    public static void main(String[] args) {  //deep 카피   =  하나 완전 복사 주소값 다름
        int[] arr1 = {5, 10, 15, 20};
        int[] arr2 = new int[arr1.length];
        String[] arr3 = new String[arr1.length];

        System.out.println("-----arr2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        //동등성 - 주소값이 다르더라도 서로 값이 같은지 (equals), 동일성 - 주소값이 같은지 (==)

        arr2[1] = 200;
        arr1[2] = 100;

        System.out.println("-----arr1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }
        System.out.println("-----arr2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }

    }
}
