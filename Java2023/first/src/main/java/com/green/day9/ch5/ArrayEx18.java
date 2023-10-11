package com.green.day9.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43}
        };

        int sum = 0;
        for (int i = 0; i < score.length; i++) {

            for (int z = 0; z < score[i].length; z++) {
                System.out.printf("score[%d][%d] : %d\n", i, z, score[i][z]);
                sum += score[i][z];
            }
        }
        System.out.println("sum : "+sum);
        /*
        score[0][0] = 101
        score[1][0] = 21
        sum =
         */

        //향상된 for문을 이용하여 sum값을 구하고 싶을떄
        sum = 0;
        for(int[] arr : score){
            for(int val : arr){
                sum +=val;
            }
        }
        System.out.println("sum : "+ sum);
    }
}
