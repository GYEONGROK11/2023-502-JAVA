package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
         /*
        numArr각방에 0~9사이의 랜덤값 대입 (중복)
        cntArr의 0번 방은 0의 개수 1번방은 1의개수 count값을 넣는다
        0~9의 개수를 출력
         */
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            int rVal = (int) (Math.random() * LEN);
            numArr[i] = rVal;
        }
        System.out.println(Arrays.toString(numArr));

        // [0, 3, 2, 8, 2, 7, 1, 4, 1, 9]
        // {1, 2 ,1, 1, 1, 0, ...}
        /*
        System.out.println(Arrays.toString(cntArr));
        cntArr[1] = cntArr[1] +1;
        cntArr[2] += 1;
        cntArr[3]++;
        System.out.println(Arrays.toString(cntArr));
         */


        for (int i = 0; i < LEN; i++) {
            int val = numArr[i];
            cntArr[val]++;

            //cntArr[numArr[i]]++;
        }
        System.out.printf(Arrays.toString(cntArr));
        System.out.println();

        for (int i = 0; i < cntArr.length; i++) {
            System.out.printf("%d의 개수 : %d\n", i, cntArr[i]);
        }
    }
}


