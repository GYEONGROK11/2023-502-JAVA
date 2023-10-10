package com.green.day7.ch5;

public class Array3Mission {
    public static void main(String[] args) {
        //arr2 는 길이가 4 arr1과 같은 방 같은 값을 가지고 3번방은 20을 가지고 있는 배열을 만들어주세요
        int[] arr1 = {5, 10, 15};
        int[] arr2 = new int[arr1.length + 1];


        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            if (i == arr1.length - 1) {
                arr2[i + 1] = 20;
            }
        }


        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr[%d] : %d\n", i, arr2[i]);
        }


    }
}

class Array3Mission_2 {
    public static void main(String[] args) {
        //arr2 는 길이가 4 arr1과 같은 방 같은 값을 가지고 3번방은 20을 가지고 있는 배열을 만들어주세요
        int[] arr1 = {5, 10, 15, 20, 25, 30};
        int[] arr2 = new int[arr1.length + 1];


        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr2.length-1] = 20;
        

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr[%d] : %d\n", i, arr2[i]);
        }


    }
}